package com.csc.service;

import java.util.ArrayList;

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
	
	public ArrayList<User> display(){
		AdminDAO.connect();
		ArrayList<User> al= AdminDAO.displayUser();
		
		
		return al;
		
	}
	
	public boolean update(User user){
		AdminDAO.connect();
		boolean b=AdminDAO.updateUser(user);
		if(b){
		
		return true;
		}
		else{
			return false;
		}
		
	}
	
	
}
