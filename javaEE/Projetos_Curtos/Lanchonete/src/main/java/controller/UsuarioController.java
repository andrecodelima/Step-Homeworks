package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Produto;
import model.Usuario;
import services.ProdutoImplementation;
import services.UsuarioImplementation;

 
@WebServlet(urlPatterns = {"/insertUser"})
public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public UsuarioController() {
        super();
         
    }

	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String address = request.getServletPath();
		
		switch(address) {
					
			case "/insertUser":
				NovoUsuario(request, response);
				break;
				
		 			
		}
	}

	
	public void NovoUsuario(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		
		Usuario usuario = new Usuario(
									  
									  request.getParameter("inputUsuario"),
									  request.getParameter("inputPassword")
								
								   );
									
		if(UsuarioImplementation.Insert(usuario)){
			
			response.sendRedirect("responseSucess.jsp?resp=usuario+cadastrado");
			
		}else {
			response.sendRedirect("responseFailed.jsp?resp=cadastrar+usuario");
		}
	}
	

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		doGet(request, response);
	}

}
