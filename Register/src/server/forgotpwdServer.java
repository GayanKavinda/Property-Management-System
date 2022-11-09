/*IT18011494 Nasome P.V.R.D.V.
 * 
 * 
 */
package server;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.Customermethodimpl;

/**
 * Servlet implementation class forgotpwdServer
 */
@WebServlet("/forgotpwdServer")
public class forgotpwdServer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public forgotpwdServer() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		String uname = request.getParameter("name");

		Customermethodimpl c1 = new Customermethodimpl();
		String x = c1.fgtpwd(uname);

		if (!(x == null)) {
			request.setAttribute("usernameslist", x);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/nxtfgtpwd.jsp");
			dispatcher.forward(request, response);
		} else {
			response.sendRedirect("toLogin.jsp");
		}

	}

}
