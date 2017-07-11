<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div>

	<table border="1">
		<tr>
		    
			<th align="left">Serie factura</th>
	   		<th align="left">Numar</th>
	   		<th align="left">Suma</th>
	   		<th align="left">Angajat</th>
	   	
	 	</tr>
	 	

	 	<c:forEach var="factura" items="${recordList}">
	 	<tr>
			<td align="left"><a href="view?id=${factura.id}">${factura.serie}</a></td>
			<td align="left">${factura.numar}</td>
			<td align="left">${factura.suma}</td>
			<td align="left">${factura.angajat.nume}</td>
		</tr>
		</c:forEach>
	
	
	</table>
</div>