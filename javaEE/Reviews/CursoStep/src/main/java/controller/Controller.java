package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Pessoa;

 
@WebServlet(urlPatterns = {"/main", "/insert"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Controller() {
        super();
         
    }

	
    //REDIRECTS
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String address = request.getServletPath();
				
		switch(address) {
			case "/main":
				alunos(request, response);
				break;
				
			case "/insert":
				novoAluno(request, response);
				break;
			
		}
			
		
	}

	
	//RED.ALUNO
	public void alunos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.sendRedirect("curso.jsp");
	}
	 
	
	
	//INSERT
	public void novoAluno(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Pessoa aluno = new Pessoa(request.getParameter("inputNome"),
								  request.getParameter("inputGenero"),
								  Integer.parseInt(request.getParameter("inputIdade")),
								  request.getParameter("inputEmail"),
								  request.getParameter("inputTelefone"));
		
		
		if(DAO.insert(aluno)){
			
			response.sendRedirect("sucess.jsp?desc=inserir+Aluno");
		
		}else {
			response.getWriter().append("Aluno não cadastrado");
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		doGet(request, response);
	}

}
