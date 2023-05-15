<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.io.FileWriter"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ page import="controller.DAO" %>
<%@ page import="model.Aluno" %>
<%@ page import="java.util.ArrayList" %>


<%


// Lista para recuperar dados
ArrayList<Aluno> lista = DAO.getAll();
String linhas = "";


FileWriter doc 		= new FileWriter("C:\\java\\saidas\\aluno.txt");
PrintWriter write	= new PrintWriter(doc);

for(Aluno a : lista){
	write.println(a.getNome() + " - " + a.getGenero() + " - " + a.getEmail());
}

doc.close();
write.close();

FileReader doc1 = new FileReader("C:\\java\\saidas\\aluno.txt");
BufferedReader read = new BufferedReader(doc1);

ArrayList<Aluno>listaLida = new ArrayList<Aluno>();
String aluno = read.readLine();



for(Aluno a : lista){
	
	linhas += 	"<tr>"	+
				
				"<td>"	+	a.getNome()		+ "</td>"	+
				"<td>"	+ 	a.getGenero()	+ "</td>"	+
				"<td>"	+	a.getEmail()	+ "</td>"	+
				
				"</tr>";
				
			  			  
		
}


	
%>

    <!DOCTYPE html>
    <html>

    <head>
        <meta charset="ISO-8859-1">
        <title>Consulta</title>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
            integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">

        <link rel="stylesheet" href="./static/css/estilo.css">
    </head>

    <body>

        <main class="container">

            <h1>Sistema de Gerenciamento de Cursos</h1>
            
            <hr>

            <h3>Consulta</h3>

            <a href="consulta.jsp" class="btn btn-outline-secondary" title="Cadastrar novo aluno">EXPORTAR</a>
            
        </main>


        <section id="section">

            <table id="tabelaContato">

                <thead>
                    <tr>
                        <th class="col-nome">Nome</th> <th class="col-genero">Gênero</th> <th class="col-email">E-mail</th>
                    </tr>
                </thead>

                <tbody>
                	<%=linhas%>
				</tbody>
				
                 
                
            </table>

        </section>


        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
            crossorigin="anonymous"></script>

        <script src="./js/validacaoAluno.js"></script>


        
    </body>

    </html>