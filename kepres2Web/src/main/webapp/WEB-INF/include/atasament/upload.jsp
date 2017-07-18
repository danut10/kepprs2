<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<h1>Ecran upload</h1>
<form method="POST" modelAttribute="record" action="upload" enctype="multipart/form-data">
	File to upload: <input type="file" name="filecontent"><br><br>
	<input type="submit" value="Upload"> Press here to upload the file!
</form>	