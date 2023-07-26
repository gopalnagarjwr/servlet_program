package Dispatch;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/send")
public class D extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public D() {
        super();
      
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		     String E=request.getParameter("email");
		     String P=request.getParameter("pass");
		     if(E.equals("abc@gmail.com")&& P.equals("123")) {
		    	 RequestDispatcher rd=request.getRequestDispatcher("C");
		    	 rd.forward(request, response);
		     }
		     else if(!E.equals("abc@gmail.com")&& !P.equals("123")) {
		    	 response.getWriter().println("<h1> invaild gmail and pass. </h1>");
		    	 RequestDispatcher rd=request.getRequestDispatcher("dis.html");
		    	 rd.include(request, response);
		    	
		     }

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
