
package servlet;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.apache.tomcat.util.http.fileupload.IOUtils;

import model.property;
import service.propertymethodimpl;

/**
 * Servlet implementation class AddpropertyServer
 */
@WebServlet("/AddpropertyServer")
@MultipartConfig(maxFileSize=169999999)
public class AddpropertyServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddpropertyServer() {
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
		String name=request.getParameter("name") ;
		Part filePart =request.getPart("image");
		String description=request.getParameter("description") ;
		InputStream inputStream=null;
		if(filePart != null) {
			long fileSize = filePart.getSize();
			String fileContent=filePart.getContentType();
			inputStream=filePart.getInputStream();
			
		}
		
		property p=new property();
		p.setPname(name);
		p.setImage(inputStream);
		p.setDescription(description);
		propertymethodimpl ob=new propertymethodimpl();
		
		ob.addProperty(p);
		response.sendRedirect("newproperty.jsp");
		}
	

	

		
		
	}


