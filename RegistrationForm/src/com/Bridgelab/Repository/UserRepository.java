package com.Bridgelab.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bridgelab.configuration.dbConnection;
import com.Bridgelab.model.user;

public class UserRepository {
	dbConnection mysql=new dbConnection();
 public int signup(user person) throws SQLException {
	 
	 int status=0;
	 String sql="Insert into login(email,pwd,fname,lname,mob) values(?,?,?,?,?)";
	try(Connection con = mysql.connectionProvider();
			PreparedStatement ps = con.prepareStatement(sql)){
		ps.setString(1,person.getEmail());
		ps.setString(2,person.getPwd());
		ps.setString(3,person.getFname());
		ps.setString(4,person.getLname());
		ps.setString(5,person.getMob());
		status=ps.executeUpdate();
	}
	return status;
}
 public boolean login(String uname,String pwd) throws SQLException {
	 boolean check = false;
	 String query = "SELECT * FROM login WHERE email=? AND pwd=?";
		try(Connection con =mysql.connectionProvider();
		    PreparedStatement ps =con.prepareStatement(query)){
		ps.setString(1, uname);
		ps.setString(2,pwd);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println("Inside the resultSet");
			if(rs.getString(1).equals(uname) && rs.getString(2).equals(pwd))
			{
				check = true;
			}
			else
			{
				check = false;
			}
		}
		
		}
		return check;
		}
		
	

 

}