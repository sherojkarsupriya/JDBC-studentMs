package com.studentMs;
import java.sql.*;
import java.util.Scanner;
public class adduserstudent 
{
	public static void main( String[] args ) throws Exception 
	{

	    	//Todo Auto gentereted method stub
	  	    Scanner scan=new Scanner(System.in);
	    	Class.forName("com.mysql.cj.jdbc.Driver");
	    	//create the object to get Connection
	    	//url to db,username,password
	    	String url="jdbc:mysql://localhost:3306/student";
	    	String username="root";
	    	String password="123973";
	    	
	    	//get connection to the db
	    	Connection con=DriverManager.getConnection(url,username,password);
	    	System.out.println("********Add Your student to DB**********");
	    	System.out.println("Enter student No");
	    	int mid=scan.nextInt();
	    	System.out.println("Enter student name");
	    	scan.nextLine();
	    	String sname=scan.nextLine();
	    	System.out.println("Enter student class");
	    	String sclass=scan.nextLine();
	    	System.out.println("Enter student marks");
			int smarks=scan.nextInt();
			
			String query="insert into student values( ?,?,?,?)";
			
			PreparedStatement pst=con.prepareStatement(query);
			pst.setInt(1, mid);
			pst.setString(2,sname);
			pst.setString(3,sclass);
			pst.setInt(4, smarks);
			 
		
		    int count=pst.executeUpdate();
			System.out.println(count+" row(s) effected");
			
	    	con.close();
	    	scan.close();
	    }

}
