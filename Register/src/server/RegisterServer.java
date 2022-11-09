/*
 * IT18011494 Nasome P.V.R.D.V.
 * 
 */
package server;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import model.Customer;
import service.Customermethodimpl;

/**
 * Servlet implementation class RegisterServer
 */
@WebServlet("/RegisterServer")
public class RegisterServer extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterServer() {
		super();

	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
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
		String uname = request.getParameter("name");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String cpassword = request.getParameter("cpassword");

		c.setName(uname);
		c.setemail(email);
		c.setPassword(password);

		String pwinvalid = "Password Mismatching";
		
		PrintWriter out=response.getWriter();
		
		if (!(password.equals(cpassword))) {
			out.println("<script type=\"text/javascript\">");
			   out.println("alert('Password is mismatching Please re-enter details');");
			   out.println("location='login.jsp';");
			   out.println("</script>");
			//response.sendRedirect("login.jsp");

		} else {
			Customermethodimpl newcus = new Customermethodimpl();

			if (newcus.insertCustomer(c) == 1) {
				   out.println("<script type=\"text/javascript\">");
				   out.println("alert('User name Existed Please re-enter details.');");
				   out.println("location='login.jsp';");
				   out.println("</script>");
				
				//response.sendRedirect("login.jsp");
			} else {
				HttpSession session = request.getSession();
				session.setAttribute("username", uname);
				response.sendRedirect("member.jsp");

			}

		}

	}

}
