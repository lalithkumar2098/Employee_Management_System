<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String msg=(String) request.getAttribute("msg"); %>
<c:forEach var="emp" items="${myEmp}"
    ${emp}>
    </c:forEach>
<body>
<%=msg %>
</body>
</html>