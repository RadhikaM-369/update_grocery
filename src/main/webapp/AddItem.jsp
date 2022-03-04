<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<span style="color: red;"> ${message}</span>

	<h1>Grocery Application</h1>

	<form action="additem.do" method="post">

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
			<label>Quantity </label> <select name="qty" id="qty">
				<option value="">-SELECT-</option>
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="5">5</option>
				<option value="10">10</option>
			</select>
		</div>
		<div>
			<label>Price </label> <input type="text" name="price" />
		</div>
		<div>
			<label>Type </label> <select name="type" id="type">
				<option value="">-SELECT-</option>
				<option value="FoodGrains">FoodGrains</option>
				<option value="CookingOil">CookingOil</option>
				<option value="DryFruits">DryFruits</option>
			</select>
		</div>
		<div>
			<label>Brand </label> <select name="brand" id="brand">
				<option value="">-SELECT-</option>
				<option value="Kwality">Kwality</option>
				<option value="Heritage">Heritage</option>
				<option value="Patanjali">Patanjali</option>
				<option value="RoyalIndianProducts">RoyalIndianProducts</option>
			</select>
		</div>
		<input type="submit" value="Add Item">
	</form>

</body>
</html>