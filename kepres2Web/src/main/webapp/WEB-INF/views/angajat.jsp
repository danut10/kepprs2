<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>

<head>
	<title>Atasamente</title>
	<meta name="decorator" content="decorator-main">
</head>

<body>
	<jsp:include page="/WEB-INF/include/angajat/title.jsp"/>
	<jsp:include page="/WEB-INF/include/angajat/toolbar.jsp"/>
 	<c:if test="${screenStatus == 'list'}">
		<jsp:include page="/WEB-INF/include/angajat/filter.jsp"/>
		<jsp:include page="/WEB-INF/include/angajat/list.jsp"/>
	</c:if>
 	<c:if test="${screenStatus != 'list'}">
		<jsp:include page="/WEB-INF/include/angajat/details.jsp"/>
	</c:if>
</body>

</html>
