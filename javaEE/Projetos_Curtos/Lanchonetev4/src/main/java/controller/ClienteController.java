package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cliente;
import model.Produto;
import services.ClienteserviceImplementation;
import services.ProdutoServiceImplementation;

@WebServlet(urlPatterns = { "/insertClient"})
public class ClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ClienteController() {
		super();

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String address = request.getServletPath();

		switch (address) {
		
		case "/insertClient":
			NewClient(request, response);
			break;

		}

	}

 
	public void NewClient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		 Cliente cliente = new Cliente(
					request.getParameter("inputNome"),
					request.getParameter("inputTelefone"),
					request.getParameter("inputEmail"),
					request.getParameter("inputEndereco")
					
 				);  
		
		if(ClienteserviceImplementation.insert(cliente)) {
			response.getWriter().append("Cliente cadastrado!");
			
		}else {
		
			response.getWriter().append("Falha no cadastro");
		}
	

	 

	}
}
