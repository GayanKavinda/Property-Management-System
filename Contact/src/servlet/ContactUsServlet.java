package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.contact.model.Inquiry;
import com.contact.service.ContactUslmpl;
import com.contact.service.IContactUs;

/**
 * Servlet implementation class Property
 */
@WebServlet("/ContactUsServlet")
public class ContactUsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactUsServlet() {
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
		
		String name = request.getParameter("name");
		
		String email = request.getParameter("email");
		
		String city = request.getParameter("city");
		String description = request.getParameter("description");
		
		Inquiry inquiry = new Inquiry(name, email, city, description);
		
		IContactUs contactus = new ContactUslmpl();
		contactus.addInquiry(inquiry);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Success.jsp"); 
		
		
		request.setAttribute("inquiry",inquiry );
		
		
		dispatcher.forward(request, response);
		
		
		
		
	}

}
