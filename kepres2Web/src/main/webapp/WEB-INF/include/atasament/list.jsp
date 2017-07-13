<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div>

	<table border="1">
		<tr>
			<th align="left">Data upload</th>
			<th align="left">Titlu </th>
	   		<th align="left">Url</th>
	 	</tr>
	 	

	 	<c:forEach var="atasament" items="${recordList}">
	 	<tr>
			<td align="left">
				<fmt:formatDate pattern = "dd.MM.yyyy" value = "${atasament.dtUpload}" />
			</td>
			<td align="left"><a href="view?id=${atasament.id}">${atasament.titlu}</a></td>
			<td align="left">${atasament.url}</td>
			
		</tr>
		</c:forEach>
	
	
	</table>
</div>
