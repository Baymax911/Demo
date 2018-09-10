package com.test.basic.JDBCEight;

/*
 * 利用DButil工具类，更加方便的操作数据库
 */
public class DBDemo {
//1.
	public static void main(String[] args) {
		String driver="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC";
		String username="mysql";
		String password="";
		
		//connect first
		DButil.getConnection(driver, url, username,password);
		
		//insert
		String insertSQL="insert into users(username,password) VALUES(?,?)";
		DButil.insertOrUpdate(insertSQL, "username","password");
		
		//query
		String querySQL="select * from users";
		DButil.query(querySQL);
		
		//update that row
		String updatSQL="update users set username =?,password =? where id=?";
		DButil.insertOrUpdate(updatSQL,"password","username","1");
		
		//query again
		DButil.query(querySQL);
		
		//close
		DButil.close();
		
	}

}
