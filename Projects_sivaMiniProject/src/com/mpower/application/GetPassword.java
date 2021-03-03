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

public class GetPassword extends HttpServlet{
	
	ResultSet rs=null;
	RequestDispatcher rd=null;
	Connection con=null;
	PreparedStatement pst=null;
	String selectQuery="select st_name,password from sivareddy.project_table where email=?";

	@Override
	public void init() throws ServletException {
		
		try {
			Class.forName(Driver);
			con=DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String user=null;
		String pwd=null;
		String email=req.getParameter("email");
		try {
			pst=con.prepareStatement(selectQuery);
			pst.setString(1, email);
			rs=pst.executeQuery();
			if(rs.next())
			{
				user=rs.getString(1);
				pwd=rs.getString(2);
				pwd=Password.decryptPassword(pwd);
				SendEmail.send(email,user,pwd);
				rd=req.getRequestDispatcher("emailSent.html");
			}else{
				rd=req.getRequestDispatcher("invalidEmail.html");
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
		e.printStackTrace();
	}
	}

}
