<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "domain.Veiculo" %>

<%

 ArrayList<Veiculo> listaCarros = new ArrayList<Veiculo>();
	listaCarros.add(new Veiculo("FordKa", 62999));
	listaCarros.add(new Veiculo("Fiat Uno", 33998));
	listaCarros.add(new Veiculo("Renout Sandero", 55799));
	listaCarros.add(new Veiculo("HB20", 79999));


	String cards = "";
	
	for(Veiculo carro : listaCarros){
		
		String classe = "";
		if(carro.getPreco()>50000){

			classe = "vermelho";
			
		}else{
			classe = "verde";
		}
		
		cards += "<div class=' " 		+ 	classe + "'>" 			+			
					
					"Modelo: " 			+	carro.getModelo()   	+	"</br>" 	+
					"Preço:  "			+ 	carro.getPreco()		+	"</br>"		+
					
				"</div>";
				
			
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Homework03</title>

<style>
	
	html{
		font-family: 'helvetica';
		font-size: 1.1rem;
	}

	body{
		font-size: 1.2rem;
		background-color: #cdcdcd;

	}
	.container{
		border: 4px solid #eee8e8;
		display: grid;
		grid-template-columns: auto;
		/* gap: 20px; */
		padding: 20px 20px;
		width: 40%;
		
	}

	.container div{
		width: 90%;
		padding: 20px 20px;
		margin-top: 10px;

	}

	.vermelho{background-color: rgb(192, 19, 19);}
	.verde{background-color: green;}

</style>

</head>
<body>

<h1>Homework 03</h1>

<section class="container">
	<div><%=cards%></div>
</section>

</body>
</html>