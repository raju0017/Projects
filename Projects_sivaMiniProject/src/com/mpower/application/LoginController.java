package com.mpower.application;

import static com.mpower.application.DbConstant.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginController extends HttpServlet{
	
	Connection con=null;
	PreparedStatement pst=null;
	String selectQuery="select st_name from sivareddy.project_table where st_name=? and password=?";

	@Override
	public void init() throws ServletException {
		
		try {
			Class.forName(Driver);
			con=DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		ResultSet rs=null;
		RequestDispatcher rd=null;
		
		String user=req.getParameter("name");
		String pwd=req.getParameter("pwd");
		try {
			pst=con.prepareStatement(selectQuery);
			
			pst.setString(1, user);
			pst.setString(2, pwd);
			
			rs=pst.executeQuery();
			if(rs.next())
			{
			req.setAttribute("user", user);
			rd=req.getRequestDispatcher("welcome.html");
			}else{
				rd=req.getRequestDispatcher("invalidLogin.html");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		rd.forward(req, resp);
		
	}
	
	@Override
	public void destroy() {

		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}










