package com.csc.service;

import java.util.ArrayList;

import com.csc.bean.Request;
import com.csc.dao.RequestDAO;

public class RequestService {
	public boolean requestAsset(Request request)
	{
		RequestDAO.connect();
		boolean b= RequestDAO.requestAsset(request);
		if(b){
		return true;
		}
		else
			return false;
		
	}
	
	public ArrayList<Request> displayStatus() {
		
		RequestDAO.connect();
		ArrayList<Request> al= RequestDAO.displayRequestStatus();
		return al;
	}
	
}
