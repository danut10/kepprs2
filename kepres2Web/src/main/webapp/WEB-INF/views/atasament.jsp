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
</head>

<body>
	<h1>Pagina de atasamente</h1>
	
	<form method="POST" action="AtasamentUpload">
		Titlu: <input type="text" name="Titlu" ><br>
		Angajat: <input type="text" name="Angajat" ><br>
		Memo: <input type="text" name="Memo" ><br>
		<input type="file" id="myFile" ><br>
		<input type="submit" value="Submit" >
		
	</form>

	
	<c:forEach items="${recordList}" var="record">
		${record.titlu}<br>
	</c:forEach>
</body>

</html>
