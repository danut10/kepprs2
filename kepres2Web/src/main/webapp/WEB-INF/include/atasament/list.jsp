<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div>

	<table class="tblGrid">
		<tr>
			<th align="left">Data upload</th>
			<th align="left">Titlu </th>
	   		<th align="left">Url</th>
	 	</tr>
	 	

	 	<c:forEach var="atasament" items="${recordList}">
		 	<tr>
				<td align="left">
					<a href="view?id=${atasament.id}"><fmt:formatDate pattern = "dd.MM.yyyy" value = "${atasament.dtUpload}" /></a>
				</td>
				<td align="left"><a href="view?id=${atasament.id}">${atasament.titlu}</a></td>
				<td align="left"><a href="view?id=${atasament.id}">${atasament.url}</a></td>
				<td align="right">
					<img title="view" style="cursor: pointer;" src="${pageContext.request.contextPath}/img/actions/view.png"> &nbsp;
					<img title="edit" style="cursor: pointer;" src="${pageContext.request.contextPath}/img/actions/edit.png"> &nbsp;
					<img title="delete" style="cursor: pointer;" src="${pageContext.request.contextPath}/img/actions/delete.png">				
				</td>	
			</tr>
		</c:forEach>
	
	
	</table>
	
</div>
