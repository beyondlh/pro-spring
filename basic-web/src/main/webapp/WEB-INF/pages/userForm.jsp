<%-- 
    Document   : userForm
    Created on : 06.04.2015, 13:02:59
    Author     : Благодатских С.
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="mvc" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
		<h2>User Registration Form</h2>
	<mvc:form modelAttribute="user" action="result.mvc">
		<table>
			<tr>
				<td><mvc:label path="name">Name</mvc:label></td>
			<td><mvc:input path="name" /></td>
			</tr>
			<tr>
				<td><mvc:label path="lastname">Last Name</mvc:label></td>
			<td><mvc:input path="lastname" /></td>
			</tr>
			<tr>
				<td><mvc:label path="password">Password</mvc:label></td>
			<td><mvc:password path="password" /></td>
			</tr>
			<tr>
				<td><mvc:label path="detail">Detail</mvc:label></td>
			<td><mvc:textarea path="detail" /></td>
			</tr>
			<tr>
				<td><mvc:label path="birthDate">Birth Date</mvc:label></td>
			<td><mvc:input path="birthDate" /></td>
			</tr>
			<tr>
				<td><mvc:label path="gender">Gender</mvc:label></td>
			<td><mvc:radiobuttons path="gender" items="${genders}" /></td>
			</tr>
			<tr>
				<td><mvc:label path="country">Country</mvc:label></td>
			<td><mvc:select path="country" items="${countries}" /></td>
			</tr>
			<tr>
				<td><mvc:label path="nonSmoking">Non Smoking</mvc:label></td>
			<td><mvc:checkbox path="nonSmoking" /></td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="Submit" />
				</td>
			</tr>
		</table>
	</mvc:form>
</body>
</html>
