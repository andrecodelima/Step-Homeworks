package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet(urlPatterns = {"/main"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Controller() {
        super();
         
    }

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String address = request.getServletPath();
		
		
		switch(address) {
			case "/main":
				alunos(request, response);
				break;
			
		}
			
		
	}

	public void alunos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.sendRedirect("curso.jsp");
	}
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		doGet(request, response);
	}

}
