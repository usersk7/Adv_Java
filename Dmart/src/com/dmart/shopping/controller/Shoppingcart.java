package com.dmart.shopping.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dmart.shopping.dao.DaoProductImpl;
import com.dmart.shopping.dao.IDaoProduct;
import com.dmart.shopping.model.product;


@WebServlet("*.do")
public class Shoppingcart extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	String jspname="";
	
    public Shoppingcart() {
        super();
       
        
        
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		
		
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
	
		String command = (request.getServletPath());
		System.out.println("call"+command);
		
		
		
		
		switch (command) {
		case "/getAllUserDetails.do":
								System.out.println("inside switch");
								
								IDaoProduct service = new DaoProductImpl();
			try {
				
				ArrayList<product> list2 = new ArrayList();				
				list2 = service.getAllProductDetails();
				System.out.println(list2);	
				PrintWriter ps = response.getWriter();
				ps.print(list2);
				
				
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
								break;

		default:
			{
				jspname="index.html";
			}
			break;
		}
		
		
		
		
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

		
		doGet(request, response);
	}

}
