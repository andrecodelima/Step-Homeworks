<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<%@page import="services.ProdutoServiceImplementation"%>
<%@page import="model.Produto"%>
  
<%

ArrayList<Produto> lista = ProdutoServiceImplementation.getProduto();
String line = "";

if(lista.isEmpty()){
	line = "<tr><th colspan='3'> Não há produtos cadastrados </tr></th>";
	
}else{
	
	for(Produto p : lista){
		
		String nome			= p.getNome();
		String descricao	= p.getDescricao();
		Double preco		= p.getPreco();
		int id				= p.getId();
		
		line +=	"<tr>"			+
			
					"<td class='Dados'>"		+ nome 			+	"</td>"		+
					"<td class='Dados'>"		+ descricao		+ 	"</td>"		+
					"<td class='Dados'>"		+ preco			+ 	"</td>"		+
					
					"<td class='table-link'><a class='btn btn-warning' href='edit.jsp?id=" 				+ id + "'>Editar</a></td>"  	+
					"<td class='table-link'><a class='btn btn-danger'  href='deleteProduct?id=" 	    + id + "'>Excluir</a></td>"  	+
					
				"</tr>";
	}
}

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

<style>
	.Dados{
		color:#000;	
		font-weight: 600;
		border-bottom: 1px dotted #fff
		
	}
	
	h1{
		color:#fff;
	}
</style> 

<title>Clientes</title>
</head>
<body>


	<!-- NAVBAR -->
	
	<header>
		<nav class="navbar navbar-expand-lg" id="navbar">
			<div class="container-fluid">
			
				<a class="navbar-brand" href="index.html">Lima Lanches</a>
				
				<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavDropdown" 	aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				
				<div class="collapse navbar-collapse" id="navbarNavDropdown">
					<ul class="navbar-nav">
					
						<li class="nav-item"><a class="nav-link active" aria-current="page" href="home.html">Home</a></li>						
						
						<li class="nav-item dropdown">
				          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
				            Produtos
				          </a>
				          <ul class="dropdown-menu">
				           	<li><a class="dropdown-item" href="produto.jsp">Produtos</a></li>
				          	<li><a class="dropdown-item" href="cadastroProduto.html">Cadastro de Produtos</a></li>
				            <li><a class="dropdown-item" href="consultaProduto.jsp">Consulta de Produtos</a></li>
				          </ul>
				        </li>
				        
						<li class="nav-item dropdown">
				          <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
				            Cliente
				          </a>
				          <ul class="dropdown-menu">
				           	<li><a class="dropdown-item" href="cliente.jsp">Clientes</a></li>
				      		<li><a class="dropdown-item" href="cadastroCliente.html">Cadastro de Clientes</a></li>
				            <li><a class="dropdown-item" href="consultaCliente.jsp">Consulta de Cliente</a></li>
				          </ul>
				        </li>
				        
				        <li class="nav-item"><a class="nav-link" href="venda.jsp">Venda de Balcão</a></li>
						
						<li class="nav-item"><a class="nav-link" href="#">Entrega</a></li>
						 
					</ul>
				</div>
				
			</div>
		</nav>
	</header>
	
	<main>
		<section class="box-acesso">
				 
				<h1>Produtos</h1>
				<hr>
				
	
		</section>
	</main>
	
	<main class="main-default">

		<section class="box-produtos">

			<h1>Lista de Produtos</h1>
			<hr>

			<a href="cadastroProduto.html" class="btn btn-outline-info" title="Cadastrar novo produto">Novo</a> 

			<table class="table-produtos" id="tabelaProduto">
			
				<thead>
					<tr>
						<th class="col-nome">Nome</th>
						<th class="col-descricao">Descrição</th>
						<th class="col-preco">Preço</th>
						 
					</tr>
				</thead>


				<tbody>
					<tr>
						<th><%=line %></th>
					</tr>
				</tbody>

				
				<tfoot>
					<tr>
						<th colspan="5">Fim da lista</th>
					</tr>
				</tfoot>

			</table>
			
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