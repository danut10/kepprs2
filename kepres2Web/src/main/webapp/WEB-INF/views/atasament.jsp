<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>

<head>
	<title>Atasamente</title>
	<link rel="stylesheet" href="css/atasamente/style.css">
</head>

<body>
	
	<jsp:include page="/WEB-INF/include/atasament/toolbar.jsp"/>
 	<c:if test="${screenStatus == 'list'}">
		<jsp:include page="/WEB-INF/include/atasament/list.jsp"/>
	</c:if>
 	<c:if test="${screenStatus != 'list'}">
		<jsp:include page="/WEB-INF/include/atasament/details.jsp"/>
	</c:if>

	
</body>

</html>