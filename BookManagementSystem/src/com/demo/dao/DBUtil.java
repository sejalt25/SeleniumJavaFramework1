package com.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBUtil {
	public void getMyConnection() {
		Connection conn=null;
		//setContentType("text/html");
	try {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			if(conn!=null) {
				System.out.println("Connection done");
			}
			else {
				System.out.println("Connection not done");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}catch(SQLException e){
		e.printStackTrace();
	}finally {
		try {
		conn.close();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	}
}
