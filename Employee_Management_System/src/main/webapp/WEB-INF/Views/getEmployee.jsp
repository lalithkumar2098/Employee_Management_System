<%@page import="com.technoelevate.employeedetails.DTO.EmployeeInformation"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% EmployeeInformation std=(EmployeeInformation)request.getAttribute("myEmp");
   String msg=(String) request.getAttribute("msg");
%>

<%=msg %>
<%=std %>
</body>
</html>