package send;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


 
public class Re extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Re() {
       super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		     response.getWriter().println("<h1>Hello friends </h1>");
		     response.getWriter().println("<h3>Aftrer 10 sec. open google page .. </h3>");
		    
		     response.setHeader("Refresh","10;url='https://www.google.com/'");
		           
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
