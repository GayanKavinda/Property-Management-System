package servlet;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import feedback.Feedback;
import methods.feedbackcrud;

/**
 * Servlet implementation class ListFeedbackServlet
 */
@WebServlet("/ListFeedbackServlet")
public class ListFeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListFeedbackServlet() {
        super();
        // TODO Auto-generated constructor stub
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
		
		
		
		/*PrintWriter out=response.getWriter();
		
		
		out.println("<a href='form.jsp'>Add New Feedback</a>");
		out.println("<h1>Feedback List</h1>");
		
		List<Feedback> list=feedbackcrud.getAllFeedbacks();
		
		out.print("<table border='1' width='100%'");
		out.print("<tr><th>Feedback Id</th><th>Name</th><th>Email</th><th>How did you find this site?</th><th>How did you rate CORAL PROPERTIES?</th><th>Comments or Suggestions</th><th>Edit</th><th>Delete</th></tr>");
		for(Feedback f:list){
			out.print("<tr><td>"+f.getCustomerID()+"</td><td>"+f.getCustomerName()+"</td><td>"+f.getCustomerMail()+"</td><td>"+f.getAnsForQuestion1()+"</td><td>"+f.getAnsForQuestion2()+"</td><td>"+f.getComment()+"</td><td><a href='UpdateFeedbackServlet?id="+f.getCustomerID()+"'>edit</a></td><td><a href='DeleteFeedbackServlet?id="+f.getCustomerID()+"'>delete</a></td></tr>");
		}
		out.print("</table>");
		
		out.close();*/
	}

}
