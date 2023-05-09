package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.JavaBeans;


@WebServlet(urlPatterns = {"/main", "/insert", "/delete"} )
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Controller() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response.getWriter().append("Servidor está em: ").append(request.getContextPath());
		/*O método doGet é utilizado para informarmos algo ao usuário.*/
		// O response é o retorno do DoGet que retorna algo ao usuário.
		// Informa algo ao usuário. (Response - responde ao usuário)
		
		String caminho = request.getServletPath();
		
		/* 1. Dentro de caminho foi colocado um request que faz referencia ao servletPath que está la no inicio, na anatoção e 
		 * 		que tem o caminho definido como 'main'
		 * 
		 * 2. Se o caminho for 'main' ele executa o metodo criado (metodo 'aluno' que tem como função fazer o redirecionamento
		 * para a pagina indicada ('curso.jsp').
		 * 
		 * */
		
		
		switch(caminho) {
			case "/main":
				alunos(request, response);// !! execução do método
				break;
				
			case "/insert":
				novoAluno(request, response);
				break;
				
			case "/delete":
				deletAluno(request, response);
				break;
		}
		
//		if(caminho.equals("/main")) {
//			alunos(request, response);		
//			
//		}
		
		
		
	}
	
	public void alunos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("curso.jsp");
	}

	public void novoAluno(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		//exibição de lista
		JavaBeans aluno = new JavaBeans(request.getParameter("inputNome"),
										request.getParameter("inputGenero"),
										request.getParameter("inputEmail")
										);
		 
		if(DAO.insert(aluno)) {
//			response.getWriter().append("Aluno cadastrado");
			response.sendRedirect("sucesso.jsp?desc=inserir+aluno");
			
		}else {
			response.getWriter().append("Aluno não cadastrado");
		}
		
		 
	}
	
	public void deletAluno(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			if(DAO.deleteId(Integer.parseInt(request.getParameter("id")))){
				response.sendRedirect("sucesso.jsp?desc=deletar+aluno");
				
			}else {
				response.getWriter().append("FALHA AO DELETAR ALUNO");
			}
			
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*O método doPost é utilizado para fazermos uma requisição ou pedirmos algo ao servidor*/
		//Pede algo ao servidor
		doGet(request, response);
	}

}
