<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div>

	<table border="1">
		<tr>
		    
		    <th align="left">Data emitere</th>
			<th align="left">Serie factura</th>
	   		<th align="left">Numar</th>
	   		<th align="left">Suma</th>
	   		<th align="left">TVA</th>
	   		<th align="left">Total</th>
	   		<th align="left">Moneda</th>
	   		<th align="left">Draft</th>
	   		<th align="left">Responsabil</th>
	   		<th align="left">Data scadenta</th>
	   		<!-- <th align="left">Memo</th>  -->
	   	
	 	</tr>
	 	

	 	<c:forEach var="factura" items="${recordList}">
	 	<tr>
			<td align="left"><a href="view?id=${factura.id}"><fmt:formatDate pattern = "dd.MM.yyyy" value = "${factura.dtEmitere}" /></a></td>
			<td align="left">${factura.serie}</td>
			<td align="left">${factura.numar}</td>
			<td align="left">${factura.suma}</td>
			<td align="left">${factura.tva}</td>
			<td align="left">${factura.total}</td>
			<td align="left">${factura.moneda.nume}</td>
            <td align="left"><input type="checkbox" value="${factura.draft}"></td>
			<td align="left">${factura.angajat.nume}</td>
			<td align="left"><fmt:formatDate pattern = "dd.MM.yyyy" value = "${factura.dtScadenta}" /></td>
		<!--<td align="left">${factura.memo}</td> -->
		</tr>
		</c:forEach>
	
	
	</table>
</div>