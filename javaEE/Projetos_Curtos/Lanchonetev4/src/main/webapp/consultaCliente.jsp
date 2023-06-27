<%@	page import="model.Cliente"%>
<%@	page import="services.ClienteserviceImplementation"%>
<%@	page import="java.util.ArrayList"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@	page import="model.Produto"%>

<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.io.FileWriter"%>
 
<%
	

	ArrayList<Cliente> lista = new ArrayList<Cliente>();
	String nome = request.getParameter("name");

	if(nome == (null) || nome.equals("")){
		lista = ClienteserviceImplementation.getCliente();
	}else{
		lista = ClienteserviceImplementation.getClientByname(nome);
	}
	
	String line = "";
	
	if(lista.isEmpty()){
		line = "<h3>Conteúdo não encontrado </h3>";
	}
	else
		for(Cliente c : lista){
			
			line +=	"<tr>"		+
					
							"<td class='Dados'>"	+	c.getId()			+			"</td>"		+
							"<td class='Dados'>"	+	c.getNome()			+			"</td>"		+
							"<td class='Dados'>"	+	c.getTelefone()		+			"</td>"		+
							"<td class='Dados'>"	+	c.getEndereco()		+			"</td>"		+
							"<td class='Dados'>"	+	c.getEmail()		+			"</td>"		+
					
					"</tr>"		;	
		}
	
	
	ArrayList<Cliente> listaCliente = ClienteserviceImplementation.getCliente();
	String lines = "";
	
	FileWriter doc 		= new FileWriter("C:\\java\\saidas\\cliente.txt");
	PrintWriter write	= new PrintWriter(doc);
	
	
	for(Cliente c : listaCliente){
		write.println(c.getNome() + " | " + c.getEndereco() + " | " + c.getTelefone() + " | " + c.getEmail());
	}
	
	doc.close();
	write.close();
	
	FileReader doc1 = new FileReader("C:\\java\\saidas\\cliente.txt");
	BufferedReader read = new BufferedReader(doc1);
	
	
	ArrayList<Cliente> listaClienteLida = new ArrayList<Cliente>();
	String cliente = read.readLine();
	
	for(Cliente c : listaCliente){
		
		lines +=	"<tr>"		+
				
							"<td class='Dados'>"	+	c.getId()			+			"</td>"		+
							"<td class='Dados'>"	+	c.getNome()			+			"</td>"		+
							"<td class='Dados'>"	+	c.getTelefone()		+			"</td>"		+
							"<td class='Dados'>"	+	c.getEndereco()		+			"</td>"		+
							"<td class='Dados'>"	+	c.getEmail()		+			"</td>"		+
					
					"</tr>"		;	
		
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
	
	.botao-download {
	  display: inline-block;
	  padding: 10px 20px;
	  background-color: #4CAF50;
	  color: white;
	  text-align: center;
	  text-decoration: none;
	  font-size: 16px;
	  border-radius: 12px;
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

<title>Consulta | Cliente</title>
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
				 
				<h1><font color='#fff'> Cliente </font></h1>
				<hr>
				
	
		</section>
	</main>
	<main class="main-default">

		<section class="box-produtos">

			<h1>Consulta de Clientes</h1>
			<hr>
			
 			  <div class="col-md-3">
			
			<form action="consultaCliente.jsp">
				<div class="input-group mb-3">
		  			<input type="text" class="form-control" name="name" placeholder="Pesquisar" aria-label="Recipient's username" aria-describedby="button-addon2">
		 			 <button class="btn btn-primary" id="button-addon2">
		 			 	<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-search" viewBox="0 0 16 16">
						  <path d="M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001c.03.04.062.078.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1.007 1.007 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0z"/>
						</svg>
		 			 </button>
			 	</div>
			 </form>
			 </div>
			 
			<a href="cadastroCliente.html" class="btn btn-outline-info" title="Cadastrar novo cliente">Novo</a> 
			
			<a href="consultaCliente.jsp" title="Consulta de clientes">
			 	<button type="button" class="btn btn-primary">
			 	<svg xmlns="http://www.w3.org/2000/svg" width="50" height="24" fill="currentColor" class="bi bi-file-earmark-text" viewBox="0 0 16 16">
					  <path d="M5.5 7a.5.5 0 0 0 0 1h5a.5.5 0 0 0 0-1h-5zM5 9.5a.5.5 0 0 1 .5-.5h5a.5.5 0 0 1 0 1h-5a.5.5 0 0 1-.5-.5zm0 2a.5.5 0 0 1 .5-.5h2a.5.5 0 0 1 0 1h-2a.5.5 0 0 1-.5-.5z"/>
					  <path d="M9.5 0H4a2 2 0 0 0-2 2v12a2 2 0 0 0 2 2h8a2 2 0 0 0 2-2V4.5L9.5 0zm0 1v2A1.5 1.5 0 0 0 11 4.5h2V14a1 1 0 0 1-1 1H4a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1h5.5z"/>
					</svg>
			 	</button>
			</a>
			
			<table class="table-produtos" id="tabelaProduto">
							

 				<thead>
					<tr>
					
						<th class="col-nome">ID</th>
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