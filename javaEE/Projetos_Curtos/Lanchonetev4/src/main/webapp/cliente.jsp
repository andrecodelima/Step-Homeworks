<%@	page import="model.Cliente"%>
<%@	page import="services.ClienteserviceImplementation"%>
<%@	page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@	page import="model.Produto"%>
  
<%
	ArrayList<Cliente> lista = ClienteserviceImplementation.getCliente();
	String line = "";
	
	if(lista.isEmpty()){
		line = "<tr><th colspan='3'> Não há clientes cadastrados </tr></th>";
		
	}else{
		
		for(Cliente c : lista){
			
			String nome			= 	c.getNome();
			String telefone		= 	c.getTelefone();
			String email		= 	c.getEmail();
			String endereco		= 	c.getEndereco();
			
			int id				= 	c.getId();
			
			
			line +=	"<tr>"		+
			
						"<td class='Dados'>"	+	nome		+		"</td>"		+
						"<td class='Dados'>"	+	telefone	+		"</td>"		+
						"<td class='Dados'>"	+	email		+		"</td>"		+
						"<td class='Dados'>"	+	endereco	+		"</td>"		+
						
						
						"<td class='table-link'><a class='btn btn-warning' href='editClient.jsp?id=" 		+ id + "'>Editar</a></td>"  	+
						"<td class='table-link'><a class='btn btn-danger'  href='deleteClient?id=" 	+ id + "'>Excluir</a></td>"  	+
											
					"</tr>"																													;
		}
	}


%>

<style>
	.Dados{
		color:#000;	
		font-weight:500;
		border-bottom: 1px dotted #fff
		}
		
		h1{
		color:#fff;
		}
		
	}
		
</style>   
  
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

<title>Produtos</title>
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
					
						<li class="nav-item"><a class="nav-link active" aria-current="page" href="index.html">Home</a></li>						
						
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
				 
				<h1><font color='#fff'> Cliente </font></h1>
				<hr>
				
	
		</section>
	</main>
	<main class="main-default">

		<section class="box-produtos">

			<h1>Lista de Clientes</h1>
			<hr>

			<a href="cadastroCliente.html" class="btn btn-outline-info" title="Cadastrar novo cliente">Novo</a> 

			<table class="table-produtos" id="tabelaProduto">
			
				<thead>
					<tr>
						<th class="col-nome">Nome</th>
						<th class="col-descricao">Telefone</th>
						<th class="col-preco">E-mail</th>
						<th class="col-preco">Endereço</th>
						
						 
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