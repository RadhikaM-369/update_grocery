<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Grocery Application</h1>
<hr>

	<form action="result.do" method="post">
	<span style="color : red;"> ${message}</span>
	<br><br>
	
	<label>Name :</label> ${grocery.name} <br>
	<label>Quantity :</label> ${grocery.qty} <br>
	<label>Price :</label>${grocery.price} <br>
	<label>Type :</label> ${grocery.type} <br>
	<label>Brand :</label> ${grocery.brand}	<br>	
	<label>Total :</label> ${message1}<br><br>
		
		<a href="AddItem.jsp">Add another item</a>
		<br><br>
		
		<a href="HomePage.jsp">GO HOME</a>
		
		</form>

</body>
</html>