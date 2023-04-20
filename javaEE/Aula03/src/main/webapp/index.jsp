<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import = "Pessoa.Pessoa" %>
<%@ page import = "java.util.ArrayList" %>


<%

ArrayList<Pessoa>lista = new ArrayList<Pessoa>();
	lista.add(new Pessoa("Jessica", "Feminino", 1.43, 47));
	lista.add(new Pessoa("Joaquin", "Masculino", 1.78, 90));
	lista.add(new Pessoa("Carla", "Feminino", 1.50, 81));
	lista.add(new Pessoa("Mario", "Masculino", 1.91, 62));

	String cards = "";
	
	for(Pessoa p: lista){
		
		String classe = p.getGenero().equalsIgnoreCase("masculino")? "preto" : "cinza";
										
		cards += "<div class='"   + classe + "'>" +
				
				"Nome: " 		  + p.getNome() +		"</br>"	+
				"IMC:  "		  + p.imc()	    +		"</br>"	+
				
				"</div>";
			 
				
	}



%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Exercicio Aula03</title>

<style>
	.Pessoa{
		border:2px solid blue;
		width:50%;
		
	}
	
	.Pessoa div{
		border:2px solid blue;
		width:90%;
 		display:grid;
 		grid-template-columns:auto, auto;
 		padding:50px;		
	}
	
	.cinza{background-color:gray;}
	.preto{background-color:black;color:white;}

</style>


</head>
<body>
	
	<h1>Exercício Aula03</h1>
	
	<section class='Pessoa'>
		
		<div>
			<%=cards %>
		</div>
	
	</section>
	
	

</body>
</html>