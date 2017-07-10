<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div>

	<table>
		<tr>
			<th align="left">Cod angajat</th>
	   		<th align="left">Nume</th>
	 	</tr>
	 	

	 	<c:forEach var="angajat" items="${recordList}">
	 	<tr>
			<td align="left">${angajat.cod}</td>
			<td align="left">${angajat.nume}</td>
		</tr>
		</c:forEach>
	
	
	</table>
</div>
