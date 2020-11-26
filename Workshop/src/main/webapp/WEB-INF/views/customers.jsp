<%@page import="com.cybage.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome Customer</h1>
<a href="register">Add Customer</a>
    <table border="1">
        <tr>
            <th>Customer Id</th>
            <th>Customer Name</th>
            <th>Customer Email</th>
            <th>Customer Phone</th>
        </tr>
        <c:forEach var="cust" items="${customers}">
            <tr>
            <td><c:out value="${cust.custId}"></c:out></td>
            <td><c:out value="${cust.custName}"></c:out></td>
             <td><c:out value="${cust.email}"></c:out></td>
            <td><c:out value="${cust.phones}"></c:out></td>
            <td><a href="deletecustomer/${cust.custId}">Delete</a></td>
               <td><a href="editcustomer/${cust.custId}">Update</a></td>
            </tr>
        </c:forEach>
       
    </table>
</body>
</html>