<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	li{
		display:none;
	}
		
	h1{
		color:#fff;
	}
	
</style>
<title>Login</title>
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
						
						<li class="nav-item"><a class="nav-link" href="#">Clientes</a></li>
						
						<li class="nav-item"><a class="nav-link" href="venda.jsp">Venda de Balcão</a></li>
						
						<li class="nav-item"><a class="nav-link" href="#">Entrega</a></li>
						 
					</ul>
				</div>
				
			</div>
		</nav>
	</header>
	<main>

		<section class="box-login">
			 
			<div class="col-md-6 login-form-2">
              
                  <form class="" name="formLogin" action="logar">
                    <h3>Login</h3>
                        <div class="form-group">
                            <input type="text" name="inputUsuario" class="form-control" placeholder="User*"/>
                        </div>
                        <div class="form-group">
                            <input type="password" name="inputPassword" class="form-control" placeholder="Password*"/>
                        </div>
                        <div class="form-group">
                        
                            <input type="button"  class="btnLogin" value="Login" onclick="validaLogar()"/></br>
                            
                         <a href="cadastroUser.html"><input type="button" name="cadastro" class="btnLogin" value="Cadastro"/></a>   
                            
                        </div>
                     </form>
               
                        
                        <div class="form-group">                  

                            <a href="#" class="btnForgetPwd" value="Login"><h7>Forget Password?</h7></a>
                        </div>
                </div>
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