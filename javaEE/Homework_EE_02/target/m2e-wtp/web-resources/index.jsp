<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.ArrayList" %>
<%@ page import="Pessoa.Pessoa" %>   
    
<%

	ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
	lista.add(new Pessoa("Clara", "Feminino", 1.4, 43.1));
	lista.add(new Pessoa("Bia", "Feminino", 1.64, 67.2));
	lista.add(new Pessoa("Carlos", "Masculino", 1.94,77.2));


	String cards = "";
	
	for (Pessoa p : lista){
		
		cards += "<div class='div'>" + 
				
				"Nome: " 	+ p.getNome()   + "<br>" + 
				"Gênero: "  + p.getGenero() + "<br>" + 
				"IMC: "     + p.imc() 		+
				
				"<div>";
				
	}

%>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>

	.pessoas{
	
		border:solid 2px blue;
		display:grid;
		grid-template-columns:auto auto;
		gap:50px;
		padding:50px;
		
	
	}
	
	.div{
		border:solid 2px blue;
		margin-top:10px;
		
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