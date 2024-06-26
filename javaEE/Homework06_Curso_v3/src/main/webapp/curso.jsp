<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ page import="model.DAO" %>
<%@ page import="model.Aluno" %>
<%@ page import="java.util.ArrayList" %>    
    
<%
        ArrayList<Aluno> list = DAO.getAll();
        	String lines = "";
        	
        	if(list.isEmpty()){
        		lines = "<tr><th colspan='3'> N�o h� alunos cadastrados </tr></th>";
        	}else{
        		
        		for(Aluno aluno : list){
        	String nome 	= aluno.getNome();
        	String genero	= aluno.getGenero();
        	String email 	= aluno.getEmail();
        	
        	lines += "<tr>" +
        					"<td>" 	+ nome		+ "</td>"	+ 
        					"<td>"	+ genero	+ "</td>"	+
        					"<td>"	+ email		+ "</td>"	+
        			
        			"</tr>";
        		}
        	}
        %>    
    
           
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
<link rel="stylesheet" href="./shared/estilo.css">

<title>Curso parte 2</title>
</head>
<body>

    <main class="container">

        <h1>Sistema de Gerenciamento de Cursos</h1>
        <hr>
        <h3>Alunos</h3>

        <a href="novo.html" class="btn btn-outline-info" title="Cadastrar novo aluno">Novo</a>
        <hr>

        <section>
            <table id="tabelaContato">
                <thead>
                    <tr>
                        <th class="col-nome">Nome</th> <th class="col-genero">G�nero</th> <th class="col-email">E-mail</th>
                    </tr>
                </thead>

                <tbody>
					<%=lines %>
                </tbody>
                
                <tfoot>
                    <tr>
                        <th colspan="3">Fim dos Contatos</th>
                    </tr>
                </tfoot>
                


            </table>

        </section>

    </main>


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
</body>
</html>