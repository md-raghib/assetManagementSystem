package com.csc.dao;


import java.sql.*;
import com.csc.bean.*;


public class AdminDAO {
	
	private static Connection conn;
	
	public AdminDAO(){}
	
	public static void connect()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
	        conn=DriverManager.getConnection("jdbc:mysql://localhost/test1?"+"user=root&password=root");
		}
		catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}
		catch(SQLException se){
			se.printStackTrace();
		}
	}//connect
	
	public static boolean createUser(User u){
		PreparedStatement pmt=null;
		
		try{
			 pmt=conn.prepareStatement("insert into user values(?,?,?,?,?,?,?,?,?,?,?)");
			pmt.setInt(1, u.getUserId());
			pmt.setInt(2, u.getManagerId());
			pmt.setString(3, u.getFirstname());
			pmt.setString(4, u.getLastName());
			pmt.setString(5, u.getEmail());
			pmt.setString(6, u.getPassword());
			pmt.setString(7, u.getShortId());
			pmt.setString(8, u.getMobileNumber());
			pmt.setString(9, u.getDateOfJoining());
			pmt.setString(10, u.getIsActive());
			
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
