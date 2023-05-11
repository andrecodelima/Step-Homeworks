<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<%@ page import="controller.DAO" %>
<%@ page import="model.Aluno" %>
<%@ page import="java.util.ArrayList" %>


<%

Aluno aluno = DAO.GetToId(Integer.parseInt(request.getParameter("id")));

%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Curso</title>

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">

    <link rel="stylesheet" href="./static/css/estilo.css">

</head>

<body>

    <main class="container bg-cinza">
        <h1>EDITAR ALUNO</h1>
        
        <form name="formAluno" action="update">

            <section>

                    <div class="form-floating col-md-5">
                        <input type="text" class="form-control" name="inputNome" id="inputNome" placeholder="Nome Completo" maxlength="100" value="<%=aluno.getNome()%>">
                        <label for="inputNome">Nome Completo</label>
                    </div>

                    <div class="form-floating col-md-3">
                        <input type="text" class="form-control" name="inputGenero" id="inputGenero" placeholder="Gênero" maxlength="10" value="<%=aluno.getGenero()%>">
                        <label for="inputGenero">Gênero</label>
                    </div>

                    <div class="form-floating col-md-3">
                        <input type="text" class="form-control" name="inputEmail" id="inputEmail" placeholder="name@example.com" maxlength="100" value="<%=aluno.getEmail()%>">
                        <label for="inputEmail">E-mail</label>
                    </div>
                    
                    <input type="hidden" name="id" value="<%=aluno.getId()%>">

                               
                <div>
                    <button type="submit" class="btn btn-success">Salvar</button>
                </div>
            </section>

        </form>
        
    </main>


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
        crossorigin="anonymous"></script>

   

</body>

</html>