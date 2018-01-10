<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Register Product</title>
		<style type="text/css">
			.error{
				color:red;
			}
			/* .errorblock{
				color: #000;
				background-color: #ffEEEE;
				border: 3px solid #ff000;
				padding: 8px;
				margin:16px;
			} */
		</style>
	</head>
	<body>
		<h2>Online Product Registration</h2>
		<form:form action="/SpringMVCAndMaven/registerProduct" method="post" modelAttribute="registerProduct">
		<%-- <form:errors path="*" cssClass="errorblock" element="div"/> --%>
		<table>
			<tr>
				<td>LAST NAME:</td>
				<td><form:input path="lastname"/></td>
				<td><form:errors path="lastname" cssClass="error"/></td>
			</tr>
			<tr>
				<td>FIRST NAME:</td>
				<td><form:input path="firstname"/></td>
				<td><form:errors path="firstname" cssClass="error"/></td>
			</tr>
			<tr>
				<td>EMAIL:</td>
				<td><form:input path="email"/></td>
				<td><form:errors path="email" cssClass="error"/></td>
			</tr>
			<tr>
				<td>PHONE NUMBER:</td>
				<td><form:input path="phoneNumber"/></td>
				<td><form:errors path="phoneNumber" cssClass="error"/></td>
			</tr>
			<tr>
				<td>ADDRESS LINE1:</td>
				<td><form:input path="addressLine1"/></td>
				<td><form:errors path="addressLine1" cssClass="error"/></td>
			</tr>
			<tr>
				<td>ADDRESS LINE2:</td>
				<td><form:input path="addressLine2"/></td>
				<td><form:errors path="addressLine2" cssClass="error"/></td>
			</tr>
			<tr>
				<td>CITY:</td>
				<td><form:input path="city"/></td>
				<td><form:errors path="city" cssClass="error"/></td>
			</tr>
			<tr>
				<td>STATE:</td>
				<td><form:input path="state"/></td>
				<td><form:errors path="state" cssClass="error"/></td>
			</tr>
			<tr>
				<td>ZIPCODE:</td>
				<td><form:input path="zipCode"/></td>
				<td><form:errors path="zipCode" cssClass="error"/></td>
			</tr>
			<tr>
				<td>COUNTRY:</td>
				<td><form:input path="country"/></td>
				<td><form:errors path="country" cssClass="error"/></td>
			</tr>
			<tr>
				<td>PRODUCT MODEL NAME:</td>
				<td><form:input path="modelName"/></td>
				<td><form:errors path="modelName" cssClass="error"/></td>
			</tr>
			<tr>
				<td>PRODUCT MODEL ID:</td>
				<td><form:input path="modelId"/></td>
				<td><form:errors path="modelId" cssClass="error"/></td>
			</tr>
			<tr>
				<td>PRODUCT PURCHASED FROM:</td>
				<td><form:input path="purchasedFrom" /></td>
				<td><form:errors path="purchasedFrom" cssClass="error"/></td>
			</tr>
			<tr>
				<td>PURCHASED DATE:</td>
				<td><form:input path="purchaseDate" type="date"/></td>
				<td><form:errors path="purchaseDate" cssClass="error"/></td>
			</tr>
			<tr>
				<td><form:button name="Submit">SUBMIT</form:button></td>
			</tr>
		</table>
		</form:form>
	</body>
</html>