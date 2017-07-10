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
	<style>
		ul {
		    list-style-type: none;
		    margin: 0;
		    padding: 0;
		    overflow: hidden;
		    background-color: #333;
		}
		
		li {
		    float: left;
		}
		
		li a {
		    display: block;
		    color: white;
		    text-align: center;
		    padding: 14px 16px;
		    text-decoration: none;
		}
		
		li a:hover {
		    background-color: #111;
		}
</style>
</head>

<body>
	
	
	<ul>
		<li><a class="active" href="#home">Lista Atasamente</a></li>
		<li><a href="#news">Adaugare Atasament</a></li>
	</ul>
	
	<h1>Pagina de atasamente</h1><br>
	
	<form method="POST" action="AtasamentUpload">
		
		Titlu: <input type="text" name="Titlu" ><br>
		Angajat: <input type="text" name="Angajat" ><br>
		Memo: <input type="text" name="Memo" ><br>
		<input type="file" id="myFile" ><br>
		<input type="submit" value="Submit" >
		
	</form>

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
