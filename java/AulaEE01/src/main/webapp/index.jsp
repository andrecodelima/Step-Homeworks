<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Homework 01</title>


<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">

<style>

    body{
        background-color: rgb(219, 214, 214);
        padding: 20px 20px;

        
    }

   
    .container{
        width: 20%;
        border: 4px solid #d9e4e1;
        float: left;
        display: flex;
        justify-content: center;
        background-color: #a2d2dd;
    }
    
    .img{
        width: 137px;
        height: 121px;
    }
    
</style>
</head>
<body>
    <h1>Homework - 01</h1>
    <h2>Array de alunos</h2>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>

 
    <%
             String [][] alunos = {
                 {"Carla Lima", "carla@gmail.com"},
                 {"Luan Garcia", "luan22@gmail.com"},
                 {"Ivan Lopes", "ivanlopes02@gmail.com"},
                 {"Roberto Silva", "carla@gmail.com"},
                 {"Pedro Amaral", "pepeboladao@gmail.com"},
             };
//         https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS8WA38CtbniKLILdfERWoe6k0tmP57ay6p_PzIbY1Kzs4kSVWXsraZVa_Tkjxi6_IMbnE&usqp=CAU
               
            for(int i=0; i<alunos.length; i++){
             
                for(int j=0; j<alunos[i].length; j++){
                               
                };
                                 
             out.print(
                       "<div class='container'>" 
                      +"<div class='card' style='width: 18rem;'>"
                      +"<img class='img' src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS8WA38CtbniKLILdfERWoe6k0tmP57ay6p_PzIbY1Kzs4kSVWXsraZVa_Tkjxi6_IMbnE&usqp=CAU'>"
                      
                      + "<div class='card-body'>"
                      + "<h5 class='card-title'>"  + "<strong>" + "Nome: " + "</strong>" + alunos[i][0] + "</h5>"
                      + "<p>" + "<strong>" + "E-mail: " + "</strong>" + alunos[i][1] + "</p>"
                      
                      + "</div>"
                                         
                      + "</div>"
                      + "</div>"
                      
                      );
                };
                
         %>
</body>
</html>