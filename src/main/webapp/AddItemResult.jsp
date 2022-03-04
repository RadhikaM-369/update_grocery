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
	<span style="color : red;"> ${messageN}</span>
	<br>
	<span style="color : red;"> ${messageQ}</span>
	<br>
	<span style="color : red;"> ${messageP}</span>
	<br>
	<span style="color : red;"> ${messageT}</span>
	<br>
	<span style="color : red;"> ${messageB}</span>
	<br>
	<span style="color : red;"> ${message1}</span>
	
		<br><br>		
		<a href="AddItem.jsp">Add another item</a>
		<br><br>
		
		<a href="HomePage.jsp">GO HOME</a>
		</form>

</body>
</html>