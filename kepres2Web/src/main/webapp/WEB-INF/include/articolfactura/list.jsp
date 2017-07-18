<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div>

	<table border="1">
		<tr>
		    
		    <th align="left">Factura</th>
			<th align="left">NrCrt</th>
	   		<th align="left">UM</th>
	   		<th align="left">Cantitatea</th>
	   		<th align="left">Pret Unitar</th>
	   		<th align="left">Suma</th>
	   		<th align="left">TVA</th>
	   		<th align="left">Total</th>
	   		<th align="left">Descriere</th>
	   	
	 	</tr>
	 	

	 	<c:forEach var="articolfactura" items="${recordList}">
	 	<tr>
			<td align="left"><a href="view?id=${articolfactura.factura}">${articolfactura.factura}</a></td>
			<td align="left">${articolfactura.nrCrt}</td>
			<td align="left">${articolfactura.um}</td>
			<td align="left">${articolfactura.cantitatea}</td>
			<td align="left">${articolfactura.pret_unitar}</td>
			<td align="left"><fmt:formatNumber type="number" minFractionDigits="2" maxFractionDigits="2" value="${articolfactura.suma}" /></td>
			<td align="left"><fmt:formatNumber type="number" minFractionDigits="2" maxFractionDigits="2" value="${articolfactura.tva}" /></td>
			<td align="left"><fmt:formatNumber type="number" minFractionDigits="2" maxFractionDigits="2" value="${articolfactura.total}" /></td>
			<td align="left">${articolfactura.descriere}</td>
            
		</tr>
		</c:forEach>
	
	
	</table>
</div>