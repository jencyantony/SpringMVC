<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<%@ page isELIgnored="false" %>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Your Product Information</title>
	</head>
	<body>
	<h2>Your Product Information</h2>
		<table>
				<tr>
				<td>PRODUCT MODEL NAME:</td>
				<td>${product.modelName}</td>
			</tr>
			<tr>
				<td>PRODUCT MODEL ID:</td>
				<td>${product.productId}</td>
			</tr>
			<tr>
				<td>PRODUCT PURCHASED FROM:</td>
				<td>${product.purchasedFrom}</td>
			</tr>
			<tr>
				<td>PURCHASED DATE:</td>
				<td>${product.purchaseDate}</td>
			</tr>
		</table>
		
		<a href="/SpringMVCAndMaven">Home Page</a>
	</body>
</html>