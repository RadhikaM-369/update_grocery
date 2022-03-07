<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> SEARCH ITEM</h1>
<form action="search.do" >
	<input type="text" name="productName">
	<input type="submit" value="SEARCH">
	<div>
	<br><br>
	<label>Name :</label> ${grocery.name} <br>
	<label>Quantity :</label> ${grocery.qty} <br>
	<label>Price :</label>${grocery.price} <br>
	<label>Type :</label> ${grocery.type} <br>
	<label>Brand :</label> ${grocery.brand}	<br>	
	<label>Total :</label> ${message1}<br><br>
	</div>	
	<div> <a href="HomePage.jsp"> HOME PAGE </a> </div>
	</form>
		
</body>
</html>