<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="divFilter">
	<div style="margin-left: 5px; margin-top: 2px; margin-bottom: 5px; border-bottom: solid 1px silver; font-size: 9pt; padding-bottom: 4px;">
		Conditii de filtrare: 	
	</div>
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
