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
	        conn=DriverManager.getConnection("jdbc:mysql://localhost/user?"+"user=root&password=cscindia");
		}
		catch(ClassNotFoundException ce){
			ce.printStackTrace();
		}
		catch(SQLException se){
			se.printStackTrace();
		}
	}//connect
	
	public static boolean createUser(User user){
		PreparedStatement pmt=null;
		
		try{
			 pmt=conn.prepareStatement("insert into user values(?,?,?,?,?,?,?,?,?,?)");
			pmt.setInt(1, user.getUserId());
			pmt.setInt(2, user.getManagerId());
			pmt.setString(3, user.getFirstName());
			pmt.setString(4, user.getLastName());
			pmt.setString(5, user.getEmail());
			pmt.setString(6, user.getPassword());
			pmt.setString(7, user.getShortId());
			pmt.setString(8, user.getMobileNumber());
			pmt.setString(9, user.getDateOfJoining());
			pmt.setString(10, user.getIsActive());
			
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
