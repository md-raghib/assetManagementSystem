package com.csc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
	

}
