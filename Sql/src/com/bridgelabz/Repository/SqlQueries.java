package com.bridgelabz.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.Bridgelabz.configuration.ConnectionConfig;
import com.Bridgelabz.model.Student;

public class SqlQueries {
	ConnectionConfig cnctn=ConnectionConfig.getInstance();
	
	public int save(Student std) {
		//System.out.println(std);
		String sql = "insert into student values(?,?,?)";
		int status = 0;
		try(Connection con = cnctn.getconnection();
			PreparedStatement ps = con.prepareStatement(sql)){
			ps.setString(1,std.getName());
			ps.setString(2,std.getDept());
			ps.setInt(3,std.getID());
			status=ps.executeUpdate(); 
			//System.out.println(status);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}

}
