/*IT18011494 Nasome P.V.R.D.V.
 * 
 * 
 */
package server;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Customer;
import service.Customermethodimpl;

/**
 * Servlet implementation class resetpwdServer
 */
@WebServlet("/resetpwdServer")
public class resetpwdServer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public resetpwdServer() {
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

		Customer c = new Customer();

		response.setContentType("text/html");
		HttpSession session1 = request.getSession();

		String uname = (String) session1.getAttribute("forgotusername");
		String password = request.getParameter("npassword");
		String cpassword = request.getParameter("cpassword");

		String pwinvalid = "Password Mismatching";

		if (!(password.equals(cpassword))) {
			response.sendRedirect("resetpwd.jsp");
		} else {
			Customermethodimpl resetpwdcus = new Customermethodimpl();
			resetpwdcus.storenewpwd(uname, password);
			HttpSession session = request.getSession();
			session.setAttribute("username", uname);

			response.sendRedirect("member.jsp");

		}

	}
}
