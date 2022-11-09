/*
 * IT18011494 Nasome P.V.R.D.V.
 * 
 * 
 */
package server;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.Customermethodimpl;

/**
 * Servlet implementation class forgotpwdrecoverServer
 */
@WebServlet("/forgotpwdrecoverServer")
public class forgotpwdrecoverServer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public forgotpwdrecoverServer() {
		super();
		
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
		String email = request.getParameter("email");

		Customermethodimpl ob = new Customermethodimpl();
		if (ob.resetpwd(uname, email)) {

			HttpSession session = request.getSession();
			session.setAttribute("forgotusername", uname);

			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/resetpwd.jsp");
			dispatcher.forward(request, response);
		} else {
			response.sendRedirect("forgotpwd.jsp");

		}

	}

}
