/*
 * IT18011494 Nasome P.V.R.D.V.
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

import service.Customermethodimpl;

/**
 * Servlet implementation class deleteServer
 */
@WebServlet("/deleteServer")
public class deleteServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deleteServer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Customermethodimpl ob1 =new Customermethodimpl();
		HttpSession session =request.getSession();
		
		String x=(String)session.getAttribute("username");
		ob1.deleteacc(x);
		session.setAttribute("username",null);
		response.sendRedirect("home.jsp");
		
	}

}
