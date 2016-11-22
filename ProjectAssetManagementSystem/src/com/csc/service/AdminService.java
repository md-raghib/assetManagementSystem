package com.csc.service;

import com.csc.bean.User;
import com.csc.dao.AdminDAO;

public class AdminService {
	
	public boolean create(User user)
	{
		AdminDAO.connect();
		boolean b= AdminDAO.createUser(user);
		if(b){
		return true;
		}
		else
			return false;
		
	}
	
	public User display(){
		AdminDAO.connect();
		AdminDAO.displayUser();
		
		return null;
	}
	
}
