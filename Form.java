package P;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ac")
public class Form extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Form() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		       String name=request.getParameter("name");
		       String add=request.getParameter("address");
		       String gendar=request.getParameter("gendar");
		       String hob=request.getParameter("hob");
		       String skill=request.getParameter("sk");
		   PrintWriter pw=response.getWriter();
		   pw.println("user name : "+name);
		   pw.println("user address : "+add);
		   pw.println("user gendar : "+gendar);
		   pw.println("user hobby : "+hob);
		   pw.println("user skills : "+skill);
		

	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
