<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Pessoa.Pessoa" %>

<%

ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
lista.add(new Pessoa("Catia", "Feminino", 1.79, 90));
lista.add(new Pessoa("Roberto", "Masculino", 1.89, 92));
lista.add(new Pessoa("Lúcia", "Feminino", 1.59, 91));
lista.add(new Pessoa("Robson", "Masculino", 1.62, 50));
lista.add(new Pessoa("Elton", "Masculino", 1.91, 75));


String cards = "";

for (Pessoa p: lista){
	
	cards += "<div>" + 
			
				"Nome: " 	+ p.nome 	+ "<br>" +
				"Gênero: "  + p.genero  + "<br>" +
				"IMC: "		+ p.imc() 	+ "<br>" +
				
			"<div>";
			
}

%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Homework 02</title>


<style>
	.pessoas{
		display:grid;
		grid-template-columns: auto auto;
		gap:50px;
		padding:50px;
			
	}
	
	
	.pessoas div{
		box-shadow: 2px 2px 4px black;
	
	}

</style>
</head>
<body>

<h1>Homework 02</h1>


<section class="pessoas">
	<%=cards %>
</section>

</body>
</html>