<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div>

	<table border="1">
		<tr>
			<th align="left">Titlu atasament</th>
	   		<th align="left">Memo</th>
	 	</tr>
	 	

	 	<c:forEach var="atasament" items="${recordList}">
	 	<tr>
			<td align="left"><a href="view?id=${atasament.id}">${atasament.titlu}</a></td>
			<td align="left">${atasament.memo}</td>
			
		</tr>
		</c:forEach>
	
	
	</table>
</div>
