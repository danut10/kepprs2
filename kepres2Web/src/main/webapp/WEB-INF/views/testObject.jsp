<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
	<title>Diacritice</title>
</head>

<body>
	<input type="submit" value="Adauga" form="frmDetails" formaction="create">
	<input type="submit" value="Editeaza" form="frmDetails" formaction="update">
	<br>
	<form:form id="frmDetails" modelAttribute="record" method="POST">
		ID: <form:input path="id" />
		<br>
		Text é diacritice: 
		
		<form:textarea rows="10" cols="38" path="text" />
		
		<textarea placeholder="${record.text}" rows="10" cols="32" ></textarea>
		
	</form:form>
</body>

</html>