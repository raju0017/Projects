package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StaffLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public StaffLoginServlet() {

	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String staffName = req.getParameter("uname");
		out.println("<html><body><h3>Hello Welcome.......to</html></body></h3> " + staffName);

	}

}
