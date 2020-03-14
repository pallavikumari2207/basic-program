package com.Bridgelab.service;

import java.sql.SQLException;

import com.Bridgelab.Repository.UserRepository;
import com.Bridgelab.model.user;

public class Userimp implements UserService{
   UserRepository repo=new UserRepository();
	@Override
	public int createUser(user person) {
	   
		int status=0;
		try {
			status = repo.signup(person);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}

}
