package com.test.basic.JDBCEight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQlInsertDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://127.0.0.1:3306/test";
		String user="mysql";
		String password=" ";
		String sql="insert into user(username,password) VALUES(?,?)";
		//建立数据库连接，获得连接对象conn
		Connection conn=DriverManager.getConnection(url, user, password);
		//创建一个Statement对象
		PreparedStatement statement=conn.prepareStatement(sql);
		//赋值
		statement.setString(1, "用户");
		statement.setString(2, "密码");
		//执行sql语句
		System.out.println(statement.executeUpdate());
		//关闭数据库连接相关对象
		statement.close();
		conn.close();
	}

}
