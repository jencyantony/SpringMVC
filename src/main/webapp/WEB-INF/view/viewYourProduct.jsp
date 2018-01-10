<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<%@ page isELIgnored="false" %>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>View Your Product</title>
	</head>
	<body>
		<form:form action="/SpringMVCAndMaven/viewYourProduct" modelAttribute="product" method="post">
			<h2>Please enter the product registration id:</h2>
			<form:input path="registrationId"/>
			<form:button name="Submit"> SUBMIT</form:button>
		</form:form>
	</body>
</html>