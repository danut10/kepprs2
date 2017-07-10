<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<head>
	<title>Atasamente</title>
	<script>
		function upload() {
		    var x = document.getElementById("myFile");
		    x.disabled = true;
		}
	</script>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/atasament/style.css">
</head>

<body>
	
	
	<ul>
		<li><a class="active" href="#atasament.jsp">Lista Atasamente</a></li>
		<li><a href="#adaugareAtasament.jsp">Adaugare Atasament</a></li>
	</ul>
	
	<h1>Pagina de atasamente</h1><br>
	
	

	<table>
		<tr>
			<th>Titlu Atasament</th>
			<th>Data upload</th>
		</tr>
		<c:forEach items="${recordList}" var="record">
			<tr>
				<th>${record.titlu}</th>
				<th>${record.dtUpload}</th>
			</tr>
		</c:forEach>
	</table>
</body>

</html>
