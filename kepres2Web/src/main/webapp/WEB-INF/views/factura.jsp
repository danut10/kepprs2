<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>

<head>
	<title>Facturi</title>
	<meta name="decorator" content="decorator-main">
</head>

<body>
	<jsp:include page="/WEB-INF/include/factura/title.jsp"/>
	<jsp:include page="/WEB-INF/include/factura/toolbar.jsp"/>
	<br>
 	<c:if test="${screenStatus == 'list'}">
		<jsp:include page="/WEB-INF/include/factura/list.jsp"/>
	</c:if>
 	<c:if test="${screenStatus != 'list'}">
		<jsp:include page="/WEB-INF/include/factura/details.jsp"/>
	</c:if>
</body>

</html>
