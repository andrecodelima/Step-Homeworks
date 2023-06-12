package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/main"})
public class ProdutoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ProdutoController() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String address = request.getServletPath();
		 
		 switch (address) {
			case "main": {
				Produto(request, response);
				break;
				
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + address);
			}
	}


	protected void Produto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  response.sendRedirect("produto.jsp");
		 
	}

}
