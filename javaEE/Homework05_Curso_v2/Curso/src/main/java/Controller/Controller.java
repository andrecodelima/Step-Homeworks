package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.JavaBeans;
 
@WebServlet(urlPatterns = {"/main" , "/insert"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public Controller() {
        super();
     }

    
    //Informa algo ao usuário

    //No metodo temos o reques e o response para usar quando necessario
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// 		response.getWriter().append("Servidor está em: ").append(request.getServletPath());
		
 		String caminho = request.getServletPath();
 		if(caminho.equals("/main")) { //verifica o endereço
 			alunos(request, response); //chama a pagina 'alunos' que está contida no metodo alunos
 		
 		}else if(caminho.equals("/insert")){
// 			response.getWriter().append("caminho=" + caminho);
 			novoAluno(request, response);
 		}
 		
	}
	
	//Esse metodo alunos irá chamar a pagina de alunos
	protected void alunos(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("curso.jsp");
		
	}


	protected void novoAluno(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		JavaBeans aluno = new JavaBeans(
										request.getParameter("inputNome"), 
										request.getParameter("inputGenero"), 
										request.getParameter("inputEmail")
										);
		
		
		if(DAO.insert(aluno)) {
			response.getWriter().append("Aluno Cadastrado");
			
		}else {
			response.getWriter().append("Aluno não cadastrado");
		}
		
		
//		Testando se os dados estão chegando
//		System.out.println(request.getParameter("inputNome"));
//		System.out.println(request.getParameter("inputEmail"));
//		System.out.println(request.getParameter("inputGenero"));

		
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
