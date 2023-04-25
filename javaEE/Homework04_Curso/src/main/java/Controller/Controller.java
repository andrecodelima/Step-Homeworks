package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/main")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public Controller() {
        super();
     }

    
    //Informa algo ao usuário
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 		response.getWriter().append("Servidor está em: ").append(request.getContextPath());
	}

	 
	//Pedir algo ao servidor
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
