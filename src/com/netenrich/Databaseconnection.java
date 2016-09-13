package com.netenrich;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Databaseconnection {
	private String username;
	private String password;
	private String database_url;
	
	
	public Databaseconnection(String user_name,String Password,String databaseurl){
		this.username=user_name;
		this.password=Password;
		this.database_url = databaseurl;
	}
	public Connection Access_Database(){
		java.sql.Connection connection=null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			 connection = DriverManager.getConnection(database_url,username,password);
			
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.print(e);
		} 
		return connection;
	}
}
