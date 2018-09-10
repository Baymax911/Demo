package com.test.basic.JDBCEight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MySQLConnectionDemo {

	public static void main(String[] args) {
		//加载驱动  2.
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		//创建数据连接对象   3.
		String url="jdbc:mysql://127.0.0.1:3306/test";
		String username="mysql";
		String password="";
		Connection connection=null;
		PreparedStatement statement=null;
		ResultSet rs=null;
		
		try {
			connection=DriverManager.getConnection(url, username, password);
			//执行sql 5.
			String sql="select * from users where username=? and password= ?";
			//创建Statement对象 4.
			statement=connection.prepareStatement(sql);
			statement.setString(1, "user1");
			statement.setString(2, "password1");
			rs=statement.executeQuery();
			
			
			//遍历结果集   6.
			while(rs.next()) {
				System.out.println(rs.getRow());
				System.out.println(rs.getString("password"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		
		}finally {
			//关闭数据库连接  7.
			try {
				if(null !=rs) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (null !=statement) {
					statement.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (null !=connection) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
