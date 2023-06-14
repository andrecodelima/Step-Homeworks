<%@page import="model.Produto"%>
<%@page import="services.ProdutoServiceImplementation"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>


<%
	Produto produto = ProdutoServiceImplementation.getId(Integer.parseInt(request.getParameter("id")));
%>
    
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

<title>Editar</title>
</head>
<body>


	<!-- NAVBAR -->
	
	<header>
		<nav class="navbar navbar-expand-lg" id="navbar">
			<div class="container-fluid">
			
				<a class="navbar-brand" href="index.html">LimaLanches</a>
				
				<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" 	aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				
				<div class="collapse navbar-collapse" id="navbarNavDropdown">
					<ul class="navbar-nav">
					
						<li class="nav-item"><a class="nav-link active" aria-current="page" href="index.html">Home</a></li>
						
						<li class="nav-item"><a class="nav-link" href="#">Clientes</a></li>
						
						<li class="nav-item"><a class="nav-link" href="#">Venda de Balcão</a></li>
						
						<li class="nav-item"><a class="nav-link" href="#">Entrega</a></li>
						 
					</ul>
				</div>
				
			</div>
		</nav>
	</header>
	
	<main class="main-default">

		<section class="box-produtos">

			<h1>EDITAR PRODUTO</h1>
			<hr>

			<a href="index.html" class="btn btn-outline-info"
				title="Página inicial">Home</a>  


			<table class="box-produtos" id="tabelaProduto">

				<form name="formProduto" action="update">

					<section class="table" id="table">

						<div class="row">

							<div class="col-md-4">

								<input type="text" class="form-control" name="inputNome" id="inputNome" placeholder="Nome do produto" maxlength="45" value="<%=produto.getNome()%>">
								<label for="inputNome">Produto</label>

							</div>

							<div class="col-md-5">

								<input type="text" class="form-control" name="inputDescricao" id="inputDescricao" placeholder="Descrição do produto" maxlength="50" value="<%=produto.getDescricao()%>">
								<label for="inputDescricao">Descrição</label>
								
							</div>

							<div class="col-md-2">

								<input type="text" class="form-control" name="inputPreco" id="inputPreco" placeholder="R$" maxlength="15" value="<%=produto.getPreco()%>">
								<label for="inputPreco">Preço</label>
								
								<input type="hidden" name="id" value="<%=produto.getId()%>">
								
							</div>

						</div>

						<div class="row">

							<input class='button-cadastro' type="submit" value="Salvar">

						</div>

					</section>

				</form>

			</table>
	</main>



	<!-- SCRIPTS -->
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe"
		crossorigin="anonymous"></script>
	<script src="./static/js/js.js"></script>

</body>
</html>