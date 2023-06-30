package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Venda;
import services.VendaServiceImplementation;

 
@WebServlet(urlPatterns = {"/iniciaVenda"})
public class VendaController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public VendaController() {
        super();
      
    }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String action = request.getServletPath();
		
		switch(action) {
			case "/iniciaVenda":
				funcIniciaVenda(request,response);
			break;
		}
	}
 
	protected void funcIniciaVenda(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		Venda venda = new Venda();
		venda.setEntrega(false);
		
		if(VendaServiceImplementation.insert(venda)){
			
		}
		
	}

}
