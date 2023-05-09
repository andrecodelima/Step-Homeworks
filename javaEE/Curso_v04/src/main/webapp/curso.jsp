<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ page import="controller.DAO" %>
<%@ page import="model.JavaBeans" %>
<%@ page import="java.util.ArrayList" %>


<%
	ArrayList<JavaBeans> lista = DAO.getAll();
	String lines = "";
	
	if(lista.isEmpty()){
		lines = "<tr><th colspan='3'> Não há alunos cadastrados</th></tr>";
		
	}else{
		
		for(JavaBeans aluno : lista){
			String nome		= aluno.getNome();
			String genero 	= aluno.getGenero();
			String email 	= aluno.getEmail();
			int id			= aluno.getId();
			
			lines +=	 "<tr>" +
			
								"<td>" + nome 		+ "</td>" +
								"<td>" + genero 	+ "</td>" +
								"<td>" + email 		+ "</td>" +
					
                                "<td class='table-link'><a class='btn btn-outline-danger' href='delete?id=" + id + "'>EXCLUIR</a></td>" +
                                
						"</tr>";
		}
	}


%>

    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title>Alunos</title>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">

        <link rel="stylesheet" href="./static/css/estilo.css">
    </head>

    <body>

        <main class="container">

            <h1>Sistema de Gerenciamento de Cursos</h1>
            
            <hr>

            <h3>Alunos</h3>

            <a href="novo.html" class="btn btn-outline-info" title="Cadastrar novo aluno">NOVO</a>
        </main>


        <section>

            <table id="tabelaContato">

                <thead>
                    <tr>
                        <th class="col-nome">Nome</th> <th class="col-genero">Gênero</th> <th class="col-email">E-mail</th>
                    </tr>
                </thead>

                <tbody>
                	
                </tbody>
					<%=lines %>
                <tfoot>
                    <tr>
                        <th colspan="3">Fim dos Contatos</th>
                    </tr>
                </tfoot>
                
            </table>

        </section>


        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
            crossorigin="anonymous"></script>

        <script src="./js/validacaoAluno.js"></script>


        
    </body>

    </html>