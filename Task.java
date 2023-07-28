package send;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/auto")
public class Task extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Task() {
        super();

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		PrintWriter obj=response.getWriter();
		if(email.equals("abc@gmail.com")) {
			
			 response.sendRedirect("https://www.google.com");
		}
		else if(email.equals("")||pass.equals("")) {
			obj.println("<script> alert('please input email or pass.. : ')</script>");
			RequestDispatcher rd=request.getRequestDispatcher("task.html");
	    	 rd.include(request, response);
		}
		else if(!email.equals("abc@gmail.com") ||pass.length()>3) {
			
			obj.println("<script> alert('please input right email : ')</script>");
			RequestDispatcher rd=request.getRequestDispatcher("task.html");
	    	 rd.include(request, response);
		}
		
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
