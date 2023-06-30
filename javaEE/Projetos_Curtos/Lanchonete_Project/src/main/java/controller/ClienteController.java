package controller;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import model.Cliente;
import services.ClienteserviceImplementation;

@WebServlet(urlPatterns = { "/insertClient", "/deleteClient", "/updateClient", "/exportaClientePdf"})
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
			
		case "/exportaClientePdf":{
			try {
				fnc_exportaPdf(request, response);
			} catch (ServletException | IOException | DocumentException e) {
				e.printStackTrace();
			}
			break;
			
		}
			
			
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
	
	
	//Exportar PDF
		public void fnc_exportaPdf(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, DocumentException {
			
			// Definindo a variavel que vai receber o parametro do formulário.
			// Criando a lista que vai armazenar os Clientes que serão exibidos.
			String nome = request.getParameter("nome");
			ArrayList<Cliente>list = new ArrayList<Cliente>();
			
			// ---
			if(nome == null || nome.equals("")){
				list = ClienteserviceImplementation.getCliente();
			
			}else {
				
				list = ClienteserviceImplementation.getClientByname(nome);
			}
			
			// ---
			if(list.isEmpty()) {
				
			}else {
				
				Document document = new Document();
				PdfWriter.getInstance(document, new FileOutputStream("C:\\\\java\\\\saidas\\\\Cliente.pdf"));
				document.open();
				
				Font fontTitulo 	= FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18);
				Font fontParagrafo	= FontFactory.getFont(FontFactory.TIMES, 14);
				
				Paragraph titulo = new Paragraph("Relatório de Clientes", fontTitulo);
				titulo.setSpacingAfter(15);
				document.add(titulo);
				
				for(Cliente c: list) {
					String line = "Nome: " + c.getNome() + " - Telefone: " + c.getTelefone() + "Endereço: " + c.getEndereco() + "Email: " + c.getEmail();
					
					Paragraph paragraph = new Paragraph(line, fontParagrafo);
					
					paragraph.setSpacingAfter(10);
					paragraph.setFirstLineIndent(30);
					document.add(paragraph);
					
				}

				document.close();

			}
		
		}
}
