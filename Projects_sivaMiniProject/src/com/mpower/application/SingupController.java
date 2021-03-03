package com.mpower.application;
import static com.mpower.application.DbConstant.*;
import com.mpower.application.SendEmail;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SingupController extends HttpServlet{
	
	Connection con=null;
	PreparedStatement pst=null;
	String selectQuery="select * from sivareddy.project_table where email=?";
	String insertQuery="insert into sivareddy.project_table values(?,?,?,?,?,?,?,?,?,?,?,?)";
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
		String email=req.getParameter("email");
		String user=req.getParameter("name");
		String pwd=Password.getPassword();
		int status=1;
		ResultSet rs=null;
		RequestDispatcher rd=null;
		try {
			pst=con.prepareStatement(selectQuery);
			pst.setString(1, email);
			rs=pst.executeQuery();
			if(rs.next())
			{
				rd=req.getRequestDispatcher("emailExist.html");
			}else
			{
				pst=con.prepareStatement(insertQuery);
				Enumeration keys=req.getParameterNames();
				int i=1;
				while(keys.hasMoreElements())
				{
					if(i<10)
					{
					String value=req.getParameter((String) keys.nextElement());
					pst.setString(i++, value);
					}
				}
				SendEmail.send(email, user, pwd);
				pwd=Password.encryptPassword(pwd);
				pst.setString(11, pwd);
				pst.setInt(12, status);
				pst.executeQuery();
				
				rd=req.getRequestDispatcher("signupSuccess.html");
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
