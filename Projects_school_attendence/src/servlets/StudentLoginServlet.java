package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public StudentLoginServlet() {
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String studentName = req.getParameter("uname");
		out.println("<html><body><h3>Hello Welcome.......to</html></body></h3> " + studentName);

	}

}
