package com.test.basic.JDBCEight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MysqlQueryDemo {
	public static void main(String[] args) throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");//加载数据库驱动
		String url="jdbc:mysql://127.0.0.1:3306/test";
		String user="mysql";
		String password=" ";
		String sql="select * from users";
		//建立数据库连接，获得连接对象conn
		Connection conn=DriverManager.getConnection(url, user, password);
		//创建一个Statement
		//Statement statement=conn.createStatement();
		PreparedStatement statement=conn.prepareStatement(sql);
		//获得查询后的结果集
		ResultSet rs=statement.executeQuery();
		//对结果集进行遍历，取出结果
		while (rs.next()) {
			System.out.println(rs.getString("username"));
		}
		//关闭数据库连接相关对象
		rs.close();
		statement.close();
		conn.close();
	}
}
