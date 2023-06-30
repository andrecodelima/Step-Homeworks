package controller;

import java.io.File;
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
import com.itextpdf.text.FontFactoryImp;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import model.Produto;
import services.ProdutoServiceImplementation;


@WebServlet(urlPatterns = {"/main", "/insertProduct", "/deleteProduct", "/updateProduct", "/exportaProdutoPdf"})
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
    			
    		case "/insertProduct": {
    			newProduct(request, response);
    			break;
    		}
    		
    		case "/deleteProduct": {
    			delProduct(request, response);
    			break;
    		}
    			
    		case "/updateProduct": {
    			try {
					updateProduto(request, response);
				} catch (ServletException | IOException | SQLException e) {
					 
					e.printStackTrace();
				}
    			break;
    		}
    		
    		
    		case "/exportaProdutoPdf":{
    			try {
					fnc_exportaPdf(request, response);
				} catch (ServletException | IOException | DocumentException e) {
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
				response.sendRedirect("responseSucess.jsp?resp=cadastrar+produto");
		 
		 }else {
			 
				response.sendRedirect("responseFailed.jsp?resp=cadastrar+produto");
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
	
	//Exportar PDF
	public void fnc_exportaPdf(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, DocumentException {
		
		// Definindo a variavel que vai receber o parametro do formulário.
		// Criando a lista que vai armazenar os produtos que serão exibidos.
		String nome = request.getParameter("nome");
		ArrayList<Produto>list = new ArrayList<Produto>();
		
		// ---
		if(nome == null || nome.equals("")){
			list = ProdutoServiceImplementation.getProduto();
		
		}else {
			
			list = ProdutoServiceImplementation.getProdutoByName(nome);
		}
		
		// ---
		if(list.isEmpty()) {
			
		}else {
			
			Document document = new Document();
			PdfWriter.getInstance(document, new FileOutputStream("C:\\\\java\\\\saidas\\\\Produto.pdf"));
			document.open();
			
			Font fontTitulo 	= FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18);
			Font fontParagrafo	= FontFactory.getFont(FontFactory.TIMES, 14);
			
			Paragraph titulo = new Paragraph("Relatório de Produtos", fontTitulo);
			titulo.setSpacingAfter(15);
			document.add(titulo);
			
			for(Produto p: list) {
				String line = "Nome: " + p.getNome() + " - Preço R$: " + p.getPreco();
				
				Paragraph paragraph = new Paragraph(line, fontParagrafo);
				
				paragraph.setSpacingAfter(10);
				paragraph.setFirstLineIndent(30);
				document.add(paragraph);
				
			}

			document.close();

		}
	
	}
}