package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Usuario;
import services.UsuarioServiceImplementation;

@WebServlet(urlPatterns = { "/acesso", "/insertUser", "/logar" })
public class UsuarioController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UsuarioController() {
		super();

	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String address = request.getServletPath();

		switch (address) {
		case "/acesso":
			Acesso(request, response);
			break;

		case "/insertUser":
			NewUser(request, response);
			break;

		case "/logar":
			Logar(request, response);
			break;

		}

	}

	public void Acesso(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("logar.jsp");
	}

	public void NewUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Usuario usuario = new Usuario(request.getParameter("inputUsuario"), request.getParameter("inputPassword"));

		if (UsuarioServiceImplementation.insert(usuario)) {

			response.sendRedirect("responseSucessUser.jsp?resp=usuario+cadastrado");

		} else {
			response.sendRedirect("responseFailed.jsp?resp=cadastrar+usuario");
		}

	}

	public void Logar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String usuario = request.getParameter("inputUsuario");
		String password = request.getParameter("inputPassword");

		Usuario usr = UsuarioServiceImplementation.getUsuario(usuario);

		if (usr != null) {
			if ((usr.getUsuario().equals(usuario)) && (usr.getPassword().equals(password))) {
				response.sendRedirect("produto.jsp");

			} else if ((usuario != usr.getUsuario()) || (password != usr.getPassword())) {
				response.sendRedirect("responseFailed.jsp?resp=acessar+sistema. Usuario+ou+senha+invalido.");

			}
			// Tratar erro de usuario null

		}

	}
}
