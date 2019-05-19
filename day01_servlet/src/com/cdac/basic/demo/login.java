package com.cdac.basic.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *  implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final RequestDispatcher RequestDispatcher = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String jspName = null;
		RequestDispatcher dispatch = null;
		
		String cmd = (request.getServletPath());
		System.out.println("calling"+cmd);
		
		switch (cmd) {
		case "/login.do":{
			String name =request.getParameter("uname");
			String pwd = request.getParameter("psw");
			if (name.equals("shubham")& pwd.equals("shubham")) {
				jspName = "/welcome.html";
				
			}
			else {
				jspName = "/error.html";
			}
		}
			
			break;

		default:{
			jspName = "/index.html";
		}
			break;
		}
		
		dispatch = request.getRequestDispatcher(jspName);
		dispatch.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
