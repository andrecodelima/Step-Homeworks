package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Produto;
import services.ProdutoServiceImplementation;


@WebServlet(urlPatterns = {"/main", "/insert"})
public class ProdutoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ProdutoController() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String address = request.getServletPath();
		 
		 switch (address) {
		 
			case "/main": {
				Product(request, response);
				break;
			}
			
			case "/insert":{
				NewProduct(request, response);
				break;
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + address);
			}
	}


	protected void Product(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  response.sendRedirect("produto.jsp");
		 
	}
	
	protected void NewProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 Produto produto = new Produto(
				 						request.getParameter("inputNome"),
				 						request.getParameter("inputDescricao"),
				 						Double.parseDouble(request.getParameter("inputPreco"))
				 					);  
		
		 if(ProdutoServiceImplementation.insert(produto)) {
			 response.getWriter().append("Produto cadastrado!");
		 
		 }else {
			 
			 response.getWriter().append("Falha no cadastro");
		 }
		 
	}

}
