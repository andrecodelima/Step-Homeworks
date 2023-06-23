<%@ page language="java" contentType="text/html; charset=UTF-8"%>
    
<% String resp = request.getParameter("resp"); %>
    
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

<title>Response</title>
</head>
<body onload="retornarPaginaCliente()">
	
	<!-- NAVBAR -->
	
	<main>

		<section class="box-sucess">
			 
			<span>Sucesso ao <%=resp%></span> 

			<div> <button class="btn btn" type="button" disabled >
				<span class="spinner-border spinner-border-sm" role="status" aria-hidden="true"></span>
				Retornando...
			  </button></div>
			

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