package link;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/table")
public class tab extends HttpServlet {   
    public tab() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 PrintWriter out =response.getWriter();
		    out.println("<table border 2px>");
		    out.println("<tr><th>name</th><th>city</th></tr>");
		    out.println("<tr><td>ram</td><td>jaipur</td></tr>");
		    out.println("<tr><td>vikas</td><td>tonk</td></tr>");
		    out.println("<tr><td>tarun</td><td>alwar</td></tr>");
		    out.println("<tr><td>karan</td><td>jhalawar</td></tr>");
		    out.println("</table>");
		  
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
