package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Produto;
import services.ProdutoServiceImplementation;


@WebServlet(urlPatterns = {"/main", "/insert", "/delete", "/update"})
public class ProdutoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public ProdutoController() {
        super();
        
    }


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	String address = request.getServletPath();
    		 
    	switch (address) {
    		 
    		case "/main": {
    			product(request, response);
    			break;
    		}
    			
    		case "/insert": {
    			newProduct(request, response);
    			break;
    		}
    		
    		case "/delete": {
    			delProduct(request, response);
    			break;
    		}
    			
    		case "/update": {
    			try {
					updateProduto(request, response);
				} catch (ServletException | IOException | SQLException e) {
					 
					e.printStackTrace();
				}
    			break;
    		}
    			
    		default: {
    			response.sendError(HttpServletResponse.SC_NOT_FOUND);
    			break;
    		}
    			 
    	}

    }
	
	//Catálogo
    public void product(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  response.sendRedirect("produto.jsp");
		 
	}
	
	
	//Novo Produto
	public void newProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
	
	
	public void delProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		if(ProdutoServiceImplementation.delProduto(Integer.parseInt(request.getParameter("id")))) {
			response.sendRedirect("responseSucess.jsp?resp=deletar+produto");

		}else{
			
			response.sendRedirect("responseFailed.jsp?resp=deletar+produto");

		}
	}
	
	//Update
	public void updateProduto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		 Produto produto = new Produto(
				 						Integer.parseInt(request.getParameter("id")),
				 						request.getParameter("inputNome"),
				 						request.getParameter("inputDescricao"),
				 						Double.parseDouble(request.getParameter("inputPreco"))
				 						
				 					);  
		
		 if(ProdutoServiceImplementation.updateProduct(produto)) {
				response.sendRedirect("responseSucess.jsp?resp=editar+produto");
		 
		 }else {
			 
				response.sendRedirect("responseFailed.jsp?resp=editar+produto");
		 }
		 
	}

}