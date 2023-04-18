package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/Hello")
public class Hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hello() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter write = response.getWriter();
		 
//		 write.println("<html>");
//		 write.println("<head>");
//
//		 write.println("<title>Página por Servlet</title>");
//
//		 write.println("</head>");
//		 
//		 write.println("<body>");
//		 
//		 write.println("<h1>Hello World</h1>");
//
//		 	 
//		 
//		 write.println("</body>");
//		 write.println("</html>");
//		 
		 
		 
		 write.printf("<div>");
		
		 
		 
		 write.printf("</div>");

	}

}




