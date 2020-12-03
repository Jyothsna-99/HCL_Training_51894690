<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h2>Update user</h2> <br>
<form:form action="adduser" method="post" modelAttribute="userBean">
	
	<table>
			<tr>
				<td><form:hidden path = "uid" value = "${userBean.uid}" /></td>
			</tr>
			
			<tr>
				<td>Enter username:</td>
				<td><form:input path="username" readonly="true" /><form:errors path="password" class="error"></form:errors></td>
			</tr>
			
			<tr>
				<td>Enter password:</td>
				<td><form:input path="password" readonly="true" /><form:errors path="password" class="error"></form:errors></td>
			</tr>

			<tr>
				<td>Enter address:</td>
				<td><form:input path="address"  /><form:errors path="address" class="error"></form:errors></td>
			</tr>

			<tr>
				<td>Enter phone:</td>
				<td><form:input path="phone" /><form:errors path="phone" class="error"></form:errors></td>
			</tr>

			<tr>
				<td>Enter email:</td>
				<td><form:input path="email" /><form:errors path="email" class="error"></form:errors></td>
			</tr>
			
			<tr>
				<td>Enter userType:</td>
				<td><form:select path="userType" items="${usertype}"></form:select><form:errors path="userType" class="error"></form:errors></td>
			</tr>
			

			<tr>
				<td><input type="submit" value="update user" /></td>
			</tr>
		</table>
	
</form:form>

</body>
</html>