<%@page import="controller.DAO"%>
<%@page import="model.Pessoa"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"%>

<% Pessoa aluno = DAO.getToId(Integer.parseInt(request.getParameter("id")));%>


<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!-- CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">

<link rel="stylesheet" href="./static/css/style.css">

<title>Edic�o</title>
</head>
<body>

	<nav class="navbar bg-body-tertiary">
		<div class="container-fluid">
			<a class="navbar-brand" href="index.html"> <img
				src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRBEsGrsiXpTzLbbWbNWhSOLfkNWsniG6dQbDR6GvgFZTjo1As8HFCJVx668jedY1mLyg4&usqp=CAU"
				alt="Logo" width="40" height="40"
				class="d-inline-block align-text-top"> Step
			</a>
		</div>
	</nav>

	<main class="main-default">

		<section class="box-curso">

			<h1>Edi��o de Alunos</h1>
			<hr>

			<form name="formAluno" action="update">

				<section class="table">
	
					<div class="row">
						<div class="col-md-5">
							<input type="text" class="form-control" name="inputNome" id="inputNome" placeholder="Nome Completo" maxlength="100" value="<%=aluno.getNome()%>">
							<label for="inputNome">Nome completo</label>
						</div>
	
						<div class="col-md-3">
							<input type="text" class="form-control" name="inputGenero" 	id="inputGenero" placeholder="Genero" maxlength="20" value="<%=aluno.getGenero()%>"> 
							<label for="inputGenero">G�nero</label>
							
						</div>
					</div>
	
					<div class="row">
						<div class="col-md-1">
							<input type="text" class="form-control" name="inputIdade" id="inputIdade" placeholder="Idade" maxlength="10" value="<%=aluno.getIdade()%>"> 
							<label for="inputNome">Idade</label>
						</div>
	
						<div class="col-md-4">
							<input type="text" class="form-control" name="inputEmail" id="inputEmail" placeholder="E-mail" maxlength="100" value="<%=aluno.getEmail()%>">
							 <label for="inputEmail">E-mail</label>
						</div>
	
						<div class="col-md-3">
							<input type="text" class="form-control" name="inputTelefone" id="inputTelefone" placeholder="Telefone" maxlength="14" value="<%=aluno.getTelefone()%>">
							 <label for="inputTelefone">Telefone</label>
						</div>
						
						<input type="hidden" name="id" value="<%=aluno.getId()%>">

					</div>

					<div>
				
						<button type=submit class="btn btn-success">Salvar</button>
				
					</div>

				</section>

			</form>

		</section>

	</main>



	<!-- SCRIPTS -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
		crossorigin="anonymous"></script>
	<script src="./static/js/js.js"></script>

</body>
</html>