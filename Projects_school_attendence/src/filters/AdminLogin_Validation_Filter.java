package filters;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.w3c.dom.Document;

import com.schoolapp.db.DBConnectionManager;

import java.sql.*;

public class AdminLogin_Validation_Filter implements Filter {

	public AdminLogin_Validation_Filter() {
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String adminName = request.getParameter("uname");
		String adminPassword = request.getParameter("pwd");

		try {
			Connection con = DBConnectionManager.getConnection("oracle.jdbc.driver.OracleDriver",
					"jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");
			Statement st = con.createStatement();
			String query = "select * from admin";
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				if (rs.getString("uname").equals(adminName) && (rs.getString("password").equals(adminPassword))) {
					//chain.doFilter(request, response);
					
				} else {

					out.println("<html><head><script type='text/javascript'>");

					out.println("errorMsg()");

					out.println("</script></head></html>");

					out.println("userName or Password Error..!");
					RequestDispatcher rd = request.getRequestDispatcher("index.html");
					rd.include(request, response);
				}
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
