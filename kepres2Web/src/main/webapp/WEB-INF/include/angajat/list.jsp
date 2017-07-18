<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div>

	<table class="tblGrid">
		<tr>
			<th align="left">Cod angajat</th>
	   		<th align="left">Nume</th>
	   		<th></th>
	 	</tr>
	 	

	 	<c:forEach var="angajat" items="${recordList}">
	 	<tr>
			<td align="left"><a href="view?id=${angajat.id}">${angajat.cod}</a></td>
			<td align="left"><a href="view?id=${angajat.id}">${angajat.nume}</a></td>
			<td align="right">
				<img title="view" style="cursor: pointer;" src="${pageContext.request.contextPath}/img/actions/view.png"> &nbsp;
				<img title="edit" style="cursor: pointer;" src="${pageContext.request.contextPath}/img/actions/edit.png"> &nbsp;
				<img title="delete" style="cursor: pointer;" src="${pageContext.request.contextPath}/img/actions/delete.png">				
			</td>
		</tr>
		</c:forEach>
	
	
	</table>
</div>
