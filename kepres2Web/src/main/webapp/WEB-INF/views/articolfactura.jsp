<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>

<head>
	<title>Articol Factura</title>
</head>

<body>
	<jsp:include page="/WEB-INF/include/articolfactura/toolbar.jsp"/>
	<br>
 	<c:if test="${screenStatus == 'list'}">
		<jsp:include page="/WEB-INF/include/articolfactura/list.jsp"/>
	</c:if>
 	<c:if test="${screenStatus != 'list'}">
		<jsp:include page="/WEB-INF/include/articolfactura/details.jsp"/>
	</c:if>
</body>

</html>