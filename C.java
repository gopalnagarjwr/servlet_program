package Dispatch;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class C extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public C() {
        super();
     
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       PrintWriter pw=response.getWriter();
	       pw.println("<h1>");
	       pw.println(" vaild : "+request.getParameter("email"));
	       pw.println("successfuly add ");
	       pw.println("</h1>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
