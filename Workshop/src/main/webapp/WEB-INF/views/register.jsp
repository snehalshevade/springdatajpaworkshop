<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
</head>
<body>
	<h1>Register</h1>
	<form:form method="post" action="/addcustomer"
		modelAttribute="customer">
	
	Name: <form:input path="custName" />
		<br>
	Password: <form:input path="custPass" />
		<br>
	Confirm Password: <form:input path="custConfPass" />
		<br>
	Email: <form:input path="email" />
		<br>
	Phone: <form:input path="phones" />
		<br>
	Alternate Phone(if u have): <form:input path="phones" />



		<br>
		<input type="submit" value="Add Customer">
	</form:form>
</body>
</html>