<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/atasament/style.css">
</head>

<body>

	<ul>
		<li><a class="active" href="#home">Lista Atasamente</a></li>
		<li><a href="/">Adaugare Atasament</a></li>
	</ul>
	
	<form method="POST" action="AtasamentUpload">
		
		Titlu: <input type="text" name="Titlu" ><br>
		Angajat: <input type="text" name="Angajat" ><br>
		Memo: <input type="text" name="Memo" ><br>
		<input type="file" id="myFile" ><br>
		<input type="submit" value="Submit" >
		
	</form>

</body>

</html>