<%@ page language="java" contentType="text/html; charset=ISO-8859-2" pageEncoding="ISO-8859-2"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div>

	<table border="1">
		<tr>
			<th align="left">Diacritice </th>
	 	</tr>
	 	

	 	<c:forEach var="diacritice" items="${recordList}">
	 	<tr>
			<td align="left"><a href="view?id=${diacritice.id}">${diacritice.diacritice}</a></td>
			
		</tr>
		</c:forEach>
	
	
	</table>
	
</div>
