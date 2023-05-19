package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Produto;
import services.ProdutoImplementation;
 
@WebServlet(urlPatterns = {"/main", "/insert"})
public class ProdutoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ProdutoController() {
        super();
       
    }
	 
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String address = request.getServletPath();
		
		switch(address) {
		
			case "/main":
				Produto(request, response);
				break;
				
			case "/insert":
				NovoProduto(request, response);
				break;
				
		}
	}

	
	public void Produto (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.sendRedirect("produto.jsp");
	}
	 
	
	public void NovoProduto(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		
		Produto produto = new Produto(
									  
									  request.getParameter("inputNome"),
									  request.getParameter("inputDescricao"),
									  Double.parseDouble(request.getParameter("inputPreco"))
								
								   );
									
		if(ProdutoImplementation.Insert(produto)){
			
			response.getWriter().append("Produto cadastrado!");
			
		}else {
			response.getWriter().append("Produto não cadastrado");
		}
	}
	
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		doGet(request, response);
	}

}
