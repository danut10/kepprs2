<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="divFilter">
	<table>
		<tr>
			<td>Nume client</td>
			<td><input type="text" name="nume" value="${filter.nume}"></td>
			<td>&nbsp;</td>
			<td>Email client</td>
			<td><input type="text" name="email" value="${filter.email}"></td>
		</tr>		
	</table>		
</div>
