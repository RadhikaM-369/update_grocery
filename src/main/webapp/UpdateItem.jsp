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

	<form action="update.do" method="post">
		<div>
			<label>Name </label> <select name="name" id="name">
				<option value="">-SELECT-</option>
				<option value="FingerMillet">FingerMillet</option>
				<option value="Rice">Rice</option>
				<option value="Jaggery">Jaggery</option>
				<option value="Honey">Honey</option>
				<option value="SplitBeans">SplitBeans</option>
				<option value="OliveOil">OliveOil</option>
				<option value="SunflowerOil">SunflowerOil</option>
				<option value="Almond">Almond</option>
				<option value="Figg">Figg</option>
				<option value="DryDate">DryDate</option>
				<option value="Walnut">Walnut</option>
				<option value="Resin">Resin</option>
			</select>
		</div>
		<div>
			<label>Name : </label><input type="text" value="${grocery.name}" name="name"/>
		</div>
		<div>
			<label>Quantity: </label> <input type="text" value="${grocery.qty}" name="qty">
		</div>
		<div>
			<label>Price: </label> <input type="text" value="${grocery.price}" name="price" />
		</div>
		<div>
			<label>Type: </label> <input type="text" value="${grocery.type}" name="type" />
		</div>
		<div>
			<label>Brand: </label> <input type="text" value="${grocery.brand}" name="brand" />
		</div>
		<div>
			<label>Total : </label> <input type="text" value="${message1}" name="">
		</div>
		<input type="submit" value="UPDATE">
	</form>

</body>
</html>