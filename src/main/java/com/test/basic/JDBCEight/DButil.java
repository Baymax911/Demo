package com.test.basic.JDBCEight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DButil {
	private static Connection conn=null;
	private static PreparedStatement preStatement=null;
	private static ResultSet rs=null;
	
	
	//获取连接。饿汉式（懒汉式就是在构造时连接上，然后方法返回connection
	public static Connection getConnection(String driver, String url, String user, String password) {

		try {
			if (null == conn || conn.isClosed()) {
				Class.forName(driver);
				conn= DriverManager.getConnection(url, user, password);
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	//关闭连接
	public static void close() {
		if (null !=conn) {
			try {
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	//查询方法，打印出结果集
	public static void query(String sql) {
		if(null==conn) {
			return;
		}
		try {
			preStatement=conn.prepareStatement(sql);
			rs=preStatement.executeQuery();
			
			//获取参数列表
			int columns=rs.getMetaData().getColumnCount();
			int rows=1;
			//循环一组一组取结果集
			while (rs.next()) {
				System.out.println("第"+rows+"行：");
				//按列下标取出某行某列的数据
				for(int i=1;i<columns;i++) {
					System.out.println("第"+i+"列数据:"+rs.getString(i));
				}
				rows++;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//关闭
			if (null !=rs) {
				try {
					rs.close();
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
			if(null !=preStatement) {
				try {
					preStatement.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	//插入或者更新都是executeUpdate(),同时设置参数值的方法也一样
	//params是一个不定长度的字符串数组，相当于String[] params
	
	public static void insertOrUpdate(String sql, String ... params) {
		
		if(null==conn){
			return;
		}
		try {
			preStatement=conn.prepareStatement(sql);
			int i=1;
			//设置参数值
			for(String item:params) {
				preStatement.setString(i++, item);
			}
			System.out.println("插入记录结果:"+preStatement.executeUpdate());
		}catch (SQLException e){
			e.printStackTrace();
		}finally {
			//关闭
			if(null !=preStatement) {
				try {
					preStatement.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	

}
