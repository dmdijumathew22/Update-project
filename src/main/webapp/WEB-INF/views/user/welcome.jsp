<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Information</title>
</head>
<body>
	<div align="center">
		<form id="update"
			action="${pageContext.request.contextPath }/user/update"
			method="post" modelAttribute="user">
			<table style="with: 50%">
				<tr>
					<td>ID</td>
					<td><input type="text" name="id" value="${id}" readonly></td>
				</tr>
				<tr>
					<td>First Name</td>
					<td><input type="text" name="firstName" value="${firstName}" /></td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><input type="text" name="lastName" value="${lastName}" /></td>
				</tr>
				<tr>
					<td>UserName</td>
					<td><input type="text" name="userid" value="${userid}"
						readonly /></td>
				</tr>
				<tr>
					<td>Email Address</td>
					<td><input type="text" name="email" value="${email}" /></td>
				</tr>
			</table>
			<input type="submit" value="Update" />
		</form>
	</div>
</body>
</html>