<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import = "java.util.ArrayList" %>
<%@ page import = "domain.Veiculo" %>

<%

 ArrayList<Veiculo> listaCarros = new ArrayList<Veiculo>();
	listaCarros.add(new Veiculo("FordKa", 62.999));
	listaCarros.add(new Veiculo("Fiat Uno", 33.998));
	listaCarros.add(new Veiculo("Renout Sandero", 55.799));
	listaCarros.add(new Veiculo("HB20", 79.999));


	String cards = "";
	
	for(Veiculo carro : listaCarros){
		
		String classe = "";
		if(carro.getPreco()>50000){

			classe = "vermelho";
			
		}else{
			classe = "verde";
		}
		
		cards += "<div class=' " 	+ classe + "'>" 		+
					
					"Modelo: " 		+	carro.getModelo()   +
					"Preço:  "		+ 	carro.getPreco()	+
					
				"</div>";
				
				
	
		
		
		
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Homework03</title>

<style>
	
	.vermelho{backgroud-color:red;}
	.verde{backgroud-color:green;}

</style>

</head>
<body>

<h1>Homework 03</h1>

<section>


</section>

</body>
</html>