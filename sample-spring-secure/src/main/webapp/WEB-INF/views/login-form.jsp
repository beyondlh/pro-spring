<%-- 
    Document   : login-form
    Created on : 26.04.2015, 18:41:53
    Author     : stikkas<stikkas@yandex.ru>
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Spring Security :: Login Form</title>
		<link rel="stylesheet" type="text/css" href="<c:url value='/resources/style.css'/>"/>
    </head>
    <body>
		<div class="login-form">
			<form action="<c:url value='/j_spring_security_check'/>" method="post">
				<label>Пользователь: <input name="username" type="text"/></label>
				<label>Пароль: <input name="password" type="password"/></label>
				<input type="submit" value="Войти">
				<input type="hidden" 
					   name="${_csrf.parameterName}" value="${_csrf.token}" />
			</form>
		</div>
    </body>
</html>
