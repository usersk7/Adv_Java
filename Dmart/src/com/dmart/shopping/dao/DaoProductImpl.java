package com.dmart.shopping.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.dmart.shopping.model.product;

public class DaoProductImpl  implements IDaoProduct{
	
	ArrayList<product> mylist = new ArrayList();
	

	public ArrayList<product> getAllProductDetails() throws ClassNotFoundException, SQLException {
		System.out.println("hello");

		Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr", "root", "");
      String sk = "select * from employee ";
      
      Statement stmt= con.createStatement();
      ResultSet rs=stmt.executeQuery(sk);
      
      while(rs.next())
      {
    	  int id =rs.getInt("id");
    	  String s= rs.getString("name");
    	String sal =  rs.getString("salary");
    	  
    	//  System.out.println("id"   +id+"name  "+s+"  "+sal);
    	
    	product pobj = new product(id,s,sal);
    	mylist.add(pobj);
    	
    	
      }
  
      System.out.println(mylist);
      
      return mylist;
      
//        PreparedStatement pstmt1 = con.prepareStatement(sk);
//        pstmt1.execute();
       // System.out.println("conncted");
	}

}
