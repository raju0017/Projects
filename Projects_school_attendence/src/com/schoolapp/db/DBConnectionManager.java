package com.schoolapp.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionManager {	
	
	 public static Connection con;
	public static Connection getConnection(String className, String url, String userName, String Password)
	{
		try {
			Class.forName(className);
			con = DriverManager.getConnection(url, userName, Password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	public static void closeConnection()
	{
		try {
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
