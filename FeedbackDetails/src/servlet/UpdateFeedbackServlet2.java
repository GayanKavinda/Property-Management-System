package servlet;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import feedback.Feedback;
import methods.feedbackcrud;

/**
 * Servlet implementation class UpdateFeedbackServlet2
 */
@WebServlet("/UpdateFeedbackServlet2")
public class UpdateFeedbackServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateFeedbackServlet2() {
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
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		String fid=request.getParameter("custID");
		int custID=Integer.parseInt(fid);
		String name=request.getParameter("name");
		String mail=request.getParameter("mail");
		String selection=request.getParameter("selection");
		String rateValue=request.getParameter("rateValue");
		String comment=request.getParameter("comment");
		
		Feedback f=new Feedback();
		f.setCustomerID(custID);
		f.setCustomerName(name);
		f.setCustomerMail(mail);
		f.setAnsForQuestion1(selection);
		f.setAnsForQuestion2(rateValue);
		f.setComment(comment);
		
		int status=feedbackcrud.update(f);
		if(status>0){
			response.sendRedirect("display.jsp");
		}else{
			out.println("Sorry! unable to update record");
		}
		
		out.close();
	}

}
