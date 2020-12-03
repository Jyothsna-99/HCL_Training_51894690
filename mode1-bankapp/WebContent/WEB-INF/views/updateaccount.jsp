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
<form:form action="addaccount" method="post" modelAttribute="AccountBean">
	<form:hidden path="accountId" value="${addAccountBean.accountId}"/>
	<table>
		<tr>
			<td>Enter name</td>
			<td><form:input path="name" readonly="true"/><form:errors path="name" class="error"/></td>
		</tr>
		<tr>
			<td>Enter balance</td>
			<td><form:input path="balance" readonly="true"/><form:errors path="balance" class="error"/></td>
		</tr>
		<tr>
			<td>Enter address</td>
			<td><form:input path="address"/><form:errors path="address" class="error"/></td>
		</tr>
		<tr>
			<td>Enter phone</td>
			<td><form:input path="phone"/><form:errors path="phone" class="error"/></td>
		</tr>
		<tr>
			<td>Enter email</td>
			<td><form:input path="email"/><form:errors path="email" class="error"/></td>
		</tr>
		<tr>
			<td>Enter aadharCard</td>
			<td><form:input path="aadharNumber" readonly="true"/><form:errors path="aadharNumber" class="error"/></td>
		</tr>
		
		<tr>
			<td>Enter panNumber</td>
			<td><form:input path="panNumber" readonly="true"/><form:errors path="panNumber" class="error"/></td>
		</tr>
		
		<tr>
			<td><input type="submit"></td>
		</tr>
	</table>
</form:form>

</body>
</html>