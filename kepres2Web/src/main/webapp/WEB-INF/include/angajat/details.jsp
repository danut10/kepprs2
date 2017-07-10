<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div>
<table>
	<tr>
		<td>Cod angajat</td>
		<td><input type="text" value="${record.cod}" disabled></td>
	</tr>
	<tr>
		<td>Nume angajat</td>
		<td><input type="text" value="${record.nume}" disabled></td>
	</tr>
</table>
</div>
