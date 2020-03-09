package com.Bridgelabz.configuration;

import java.beans.Statement;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionConfig {
	private static ConnectionConfig conn;
	private Properties p = new Properties();
	 private static Connection con = null;
		private Statement stmt = null;

	private ConnectionConfig() {
		try (FileReader fr = new FileReader("property.properties")) {
			p.load(fr);
			//Statement stmt = null;
			Class.forName((String) p.get("DRIVER"));
			con= DriverManager.getConnection(p.getProperty("URL"), p.getProperty("USER"),
					p.getProperty("PASS"));
		} catch (SQLException | IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
	public Connection getconnection() {
		return con;	
	}

	public static ConnectionConfig getInstance() {
		if(conn==null)
		{
		conn=new ConnectionConfig();
		return  conn;
	     }
		return conn;
	}
	}
