<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
<head>
	<title>Tree</title>
</head>
<body>

<p> Please type a natural number of branches and choose a valid type of tree: </p>
<p> 1) Normal </p>
<p> 2) Triangular </p>

<form action = "ServletClass" method = "post">
	<br> Number of branches <input type = "text" name = "numberOfBranches" />
	<br> Type of tree <input type = "text" name = "typeOfTree" />
	<br> <input type = "submit" />
</form>


</body>
</html>
