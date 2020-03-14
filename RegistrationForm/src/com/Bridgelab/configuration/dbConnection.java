package com.Bridgelab.configuration;

import java.sql.Connection;
import java.sql.DriverManager;

public class dbConnection {
	static String uname = "root";
	static String upass = "root";
	static String url = "jdbc:mysql://localhost:3306/loginReg";
	static Connection con = null;
	public Connection connectionProvider()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,uname,upass);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
		
	}
}
