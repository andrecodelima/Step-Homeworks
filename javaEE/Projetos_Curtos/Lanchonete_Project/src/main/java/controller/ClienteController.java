package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cliente;
import services.ClienteserviceImplementation;

@WebServlet(urlPatterns = { "/insertClient", "/deleteClient", "/updateClient"})
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

			
		case "/deleteClient":
			delClient(request, response);
			break;
			
		case "/updateClient":
			try {
				updateClient(request, response);
			} catch (ServletException | IOException | SQLException e) {
				 
				e.printStackTrace();
			}
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
			response.sendRedirect("responseSucessClient.jsp?resp=cadastrar+cliente");
			
		}else {
		
			response.getWriter().append("Falha no cadastro");
		}

	}
	
	public void delClient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(ClienteserviceImplementation.delClient(Integer.parseInt(request.getParameter("id")))) {
			response.sendRedirect("responseSucess.jsp?resp=deletar+cliente");

		}else{
			
			response.sendRedirect("responseFailed.jsp?resp=deletar+cliente");

		}
	}
	
	public void updateClient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		 Cliente cliente = new Cliente(
				 						Integer.parseInt(request.getParameter("id")),
				 						request.getParameter("inputNome"),
				 						request.getParameter("inputTelefone"),
				 						request.getParameter("inputEndereco"),
				 						request.getParameter("inputEmail")
				 					);  
		
		 if(ClienteserviceImplementation.updateClient(cliente)) {
				response.sendRedirect("responseSucess.jsp?resp=editar+cliente");
		 
		 }else {
			 
				response.sendRedirect("responseFailed.jsp?resp=editar+cliente");
		 }
		 
	}
}
