<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>

<head>
	<title>Diacritice</title>
</head>

<body>
	<input type="submit" value="Adauga" form="frmDetails" onclick="create">
	<input type="submit" value="Editeaza" form="frmDetails" formaction="update">
	<br>
	<form:form id="frmDetails" modelAttribute="record" method="POST">
		ID: <form:input path="id" />
		<br>
		Text diacritice: 
		<form:input path="diacritice" />
		<input type="text" value="${record.diacritice}">
	</form:form>
</body>

</html>