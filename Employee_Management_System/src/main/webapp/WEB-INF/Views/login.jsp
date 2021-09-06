<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Emplpoyee's Register Form</h1>
<form action="./getDetails" method="POST"  >
			<table style="with: 50%"  >
				<tr>
					<td>Employee ID</td>
					<td><input type="number" name="empid" /></td>
				</tr>
				<tr>
					<td>EmployeeName</td>
					<td><input type="text" name="empname" /></td>
				</tr>
				<tr>
					<td>address</td>
					<td><input type="text" name="address" /></td>
				</tr>
					<tr>
					<td>Password</td>
					<td><input type="password" name="password" /></td>
				</tr>
					<tr>
						<td><input type="submit" value="Submit" align="center"/></td>
					</tr>	
				</table>
</form>
</body>
</html>