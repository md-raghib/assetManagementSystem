package com.csc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.csc.bean.Request;

public class RequestDAO {
private static Connection conn;
	
	public RequestDAO(){}
	
	public static void connect()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
	        conn=DriverManager.getConnection("jdbc:mysql://localhost/employeedata?"+"user=root&password=cscindia@123");
		}
		catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}
		catch(SQLException se){
			se.printStackTrace();
		}
	}//connect
	
	public static boolean requestAsset(Request request){
		PreparedStatement pmt=null;
		
		try{
			 pmt=conn.prepareStatement("insert into request2(user_id,asset_name) values(?,?)");
			//pmt.setInt(1, request.getRequestId());
			pmt.setInt(1, request.getUserId());
			/*pmt.setString(3, request.getStatus());
			pmt.setString(4, request.getType());*/
			pmt.setString(2, request.getAssetName());
			/*pmt.setString(6, request.getRemarks());
			pmt.setString(7, request.getRequestDate());*/
			
			
			int n=pmt.executeUpdate();
			if(n>0)
				return true;
		}catch(SQLException se){
			se.printStackTrace();
		}finally{
			try{
				if( pmt!=null){
					pmt.close();
				}
				
				if(conn!=null){
					conn.close();
				}
			}catch(SQLException se){
				se.printStackTrace();
			}
		}
		return false;
	}//createUser
	
	

	public static ArrayList<Request> displayRequestStatus() {
		
		try{
			String query="Select * from request2";
			PreparedStatement pmt=conn.prepareStatement(query);
			ResultSet rs=pmt.executeQuery();
			ArrayList<Request> al=new ArrayList<>();
			while(rs.next()){
				Request request=new Request();
				request.setRequestId(rs.getInt(1));
				request.setUserId(rs.getInt(2));
				request.setStatus(rs.getString(3));
				request.setType(rs.getString(4));
				request.setAssetName(rs.getString(5));
				request.setRemarks(rs.getString(6));
				request.setRequestDate(rs.getString(7));
				
				
				al.add(request);
				
				
			}
			return al;
			
			
		}catch(SQLException se){
			se.printStackTrace();
		}
		return null;
		
	}
}
