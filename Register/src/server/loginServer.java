/*
 * IT18011494 Nasome P.V.R.D.V.
 * 
 * 
 */
package server;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import service.Customermethodimpl;

/**
 * Servlet implementation class loginServer
 */
@WebServlet("/loginServer")
public class loginServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServer() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		String uname=request.getParameter("name");
		String password=request.getParameter("password");
		
		Customermethodimpl c =new Customermethodimpl();
		
		PrintWriter out=response.getWriter();
		
		if(c.logCustomer(uname,password)==true){
		HttpSession session =request.getSession();
		session.setAttribute("username", uname);
		response.encodeURL("property/propertyindex.jsp");
		response.sendRedirect("member.jsp");
		
		
		}else {
			
			out.println("<script type=\"text/javascript\">");
			   out.println("alert('User or Password is Incorrect');");
			   out.println("location='toLogin.jsp';");
			   out.println("</script>");
			
			/*response.sendRedirect("toLogin.jsp");
			request.setAttribute("msg","Invalid User name or password");*/
		
		}
		
	
	}

}








