package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Cliente;
import services.ClienteServiceImplementation;

/**
 * Servlet implementation class Cliente
 */
@WebServlet(urlPatterns = {"/cadastraCliente"})
public class ClienteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		
		switch(action) {
			case "/cadastraCliente":
				fnc_cadastra(request,response);
				break;
		}
	}

	protected void fnc_cadastra(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome 	= request.getParameter("inputNome");
		String telefone = request.getParameter("inputTelefone");
		String email 	= request.getParameter("inputEmail");
		String endereco = request.getParameter("inputEndereco");
		try {
			if(ClienteServiceImplementation.insert(new Cliente(nome,telefone,email,endereco))) {
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		response.sendRedirect("cadastraCliente.html");
	}
}
