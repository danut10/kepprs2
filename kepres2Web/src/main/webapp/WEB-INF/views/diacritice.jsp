<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>

<head>
	<title>Diacritice</title>
</head>

<body>
	
		<jsp:include page="/WEB-INF/include/diacritice/toolbar.jsp"/>
 	<c:if test="${screenStatus == 'list'}">
		<jsp:include page="/WEB-INF/include/diacritice/list.jsp"/>
	</c:if>
 	<c:if test="${screenStatus != 'list'}">
		<jsp:include page="/WEB-INF/include/diacritice/details.jsp"/>
	</c:if>


	
</body>

</html>