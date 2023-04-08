package com.studentMs;
 //importing package
import java.sql.*;


  /**
  * JDBC SAMPLE PROGRAM BY #supriya.s.
  *
  */
   public class App 
   {
     public static void main( String[] args ) throws Exception 
    	{

    	    	//load and register driver
    	  	
    	    	Class.forName("com.mysql.cj.jdbc.Driver");
    	    	//create the object to get Connection
    	    	//url to db,username,password
    	    	String url="jdbc:mysql://localhost:3306/student";
    	    	String username="root";
    	    	String password="123973";
    	    	
    	    	//get connection to the db
    	    	Connection con=DriverManager.getConnection(url,username,password);
    	    	Statement st=con.createStatement();
    	    	ResultSet rs=st.executeQuery("select * from student");
    	    	
    	    	while(rs.next())
    	    	{
    	    		String studentdata=rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4);
    	    		
    	    		System.out.println(studentdata);
    	    	}
    	    	con.close();
    	    }
    }

