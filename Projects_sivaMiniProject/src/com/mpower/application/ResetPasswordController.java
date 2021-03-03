package com.mpower.application;

import static com.mpower.application.DbConstant.Driver;
import static com.mpower.application.DbConstant.password;
import static com.mpower.application.DbConstant.url;
import static com.mpower.application.DbConstant.user;

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

public class ResetPasswordController extends HttpServlet{
	
	Connection con=null;
	PreparedStatement pst=null;
	String selectQuery="select st_name from sivareddy.project_table where password=?";
	String updateQuery="update sivareddy.project_table set password=? where password=?";

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
		
		String prevpwd=req.getParameter("prevpwd");
		String newpwd=req.getParameter("newpwd");
		prevpwd=Password.encryptPassword(prevpwd);
		ResultSet rs=null;
		RequestDispatcher rd=null;
		try {
			pst=con.prepareStatement(selectQuery);
			pst.setString(1, prevpwd);
			rs=pst.executeQuery();
			if(rs.next())
			{
				newpwd=Password.encryptPassword(newpwd);
				pst=con.prepareStatement(updateQuery);
				pst.setString(1, newpwd);
				pst.setString(2, prevpwd);
				pst.executeUpdate();
				rd=req.getRequestDispatcher("passwordChanged.html");
			}else
			{
				rd=req.getRequestDispatcher("wrongPassword.html");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
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
