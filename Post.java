package send;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/po")
public class Post extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public Post() {
        super();

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      PrintWriter ob=response.getWriter() ;
	      ob.print("<html>");
	      ob.print("<body>");
	      ob.print("<form action='po' method='post'>");
	      ob.print("Email : <input type='email' name='email'/>");
	      ob.print("Password : <input type='password' name='pass'/>");
	      ob.print("<button type='submit'>Submit</button>");
	      ob.print("</form>");
	      ob.print("</body>");
	      ob.print("</html>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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

}
