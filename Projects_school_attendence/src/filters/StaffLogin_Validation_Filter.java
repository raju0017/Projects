package filters;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.schoolapp.db.DBConnectionManager;

public class StaffLogin_Validation_Filter implements Filter {

	public StaffLogin_Validation_Filter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String staffName = request.getParameter("uname");
		String staffPassword = request.getParameter("pwd");

		try {
			Connection con = DBConnectionManager.getConnection("oracle.jdbc.driver.OracleDriver",
					"jdbc:oracle:thin:@localhost:1521:xe", "scott", "tiger");

			Statement st = con.createStatement();
			String query = "select * from faculty";
			ResultSet rs = st.executeQuery(query);
			while (rs.next()) {
				System.out.println("entered in filter");
				if (rs.getString("uname").equals(staffName) && (rs.getString("password").equals(staffPassword))) {
					chain.doFilter(request, response);
				} else {

/*					out.println("<html><head><script type='text/javascript'>");
					out.println("errorMsg()");
					out.println("</script></head></html>");
*/
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

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
