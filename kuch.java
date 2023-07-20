package link;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/v")
public class kuch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public kuch() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s=request.getParameter("name");
		String a=request.getParameter("age");
		int age=Integer.parseInt(a);
	      PrintWriter obj=response.getWriter();
		 if(age>=18) {
			obj.print("vailed person for vote");
		 }else {
			obj.print("Not vailed person for vote");
		 }
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
