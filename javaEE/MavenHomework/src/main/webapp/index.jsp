<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="main.AppEngine" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Homework - Maven</title>

<style type="text/css">
	body{
		background-color: #333333;
		
	}
	
	h1{
		color:#fff;
	}
	.box{
		
		border:2px solid #fff;
		width: 300px;
		background-color: #dddddd;
		padding: 15px;
		
		margin:0 auto;
		
	}
	
	.box-msg{
		
		border:2px solid #2353f2;
		padding-left: 10px;
	}
	
	
</style>
</head>
<body >

	<h1>Homework - Maven </h1>
	
	<div class="box">
		<h2>System inf <%= AppEngine.getInfoSystem() %></h2>
	</div>
	
</body>
</html>