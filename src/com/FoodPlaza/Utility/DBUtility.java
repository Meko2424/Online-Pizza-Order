package com.FoodPlaza.Utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtility 
{
	public static Connection connection()
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/Foodplaza","root","solo2424");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;	
	}
  
}
