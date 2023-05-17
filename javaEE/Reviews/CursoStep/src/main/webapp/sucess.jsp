<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<% String descricao = request.getParameter("desc"); %>


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">

    <link rel="stylesheet" href="./static/css/style.css">

    <title>Página Inicial</title>
</head>
<body>


	<nav class="navbar bg-body-tertiary">
      <div class="container-fluid">
        <a class="navbar-brand" href="index.html">
          <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRBEsGrsiXpTzLbbWbNWhSOLfkNWsniG6dQbDR6GvgFZTjo1As8HFCJVx668jedY1mLyg4&usqp=CAU" alt="Logo" width="40" height="40" class="d-inline-block align-text-top">
          Step
        </a>
      </div>
    </nav>
	<main>

        <section class="box-curso">
        	
        	Sucesso ao <%=descricao%>
        	
            
        </section>
    
    </main>
    


    <!-- SCRIPTS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
    <script src="./static/js/js.js"></script>
    
</body>
</html>