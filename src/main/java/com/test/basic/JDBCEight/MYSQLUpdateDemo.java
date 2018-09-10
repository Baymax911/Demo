package com.test.basic.JDBCEight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MYSQLUpdateDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//加载数据库驱动
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://127.0.0.1:3306/test";
		String user="mysql";
		String password="";
		String sql="update users set password =? where username=?";
		//建立数据库连接，获得连接对象conn
		Connection conn=DriverManager.getConnection(url, user, password);
		//创建Statement
		PreparedStatement statement=conn.prepareStatement(sql);
		statement.setString(1, "password");
		statement.setString(2, "user");
		//执行语句
		System.out.println(statement.executeUpdate());
		//关闭
		statement.close();
		conn.close();
	}

}
