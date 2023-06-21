package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.VendaProduto;
import services.ProdutoServiceImplementation;
import services.VendaProdutoServiceImplamentation;

 
@WebServlet(urlPatterns = {"/insertVendaProduto"})
public class VendaProdutoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public VendaProdutoController() {
        super();
     }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		
		switch(action) {
			case "/insertVendaProduto":
				func_VendaProduto(request,response);
			break;
		}
	}
	
 
	protected void func_VendaProduto(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		int idProduto		= Integer.parseInt(request.getParameter("inputIdProduto"));
		double quantidade	= Double.parseDouble(request.getParameter("inputQuantidade"));
		double preco		= ProdutoServiceImplementation.getId(idProduto).getPreco();
		int idVenda			= Integer.parseInt(request.getParameter("idVenda"));
		
		VendaProdutoServiceImplamentation.insert(new VendaProduto(idVenda, idProduto, preco, quantidade));

	}

}
