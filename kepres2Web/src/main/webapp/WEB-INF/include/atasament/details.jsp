<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div>
<form:form id="frmDetails" modelAttribute="record" method="POST">
<form:hidden path="id"/>
<table>
	<tr>
		<td>Titlu Atasament</td>
		<td>
			<c:if test="${screenStatus == 'view'}">
				<input type="text" value="${record.titlu}" size="30" disabled>
			</c:if>
			<c:if test="${screenStatus != 'view'}">
				<form:input path="titlu" size="30" />
			</c:if>
			
		</td>
	</tr>
	<tr>
		<td>Memo</td>
		<td>
			<c:if test="${screenStatus == 'view'}">
				<textarea placeholder="${record.memo}" rows="10" cols="32" disabled></textarea>
			</c:if>
			<c:if test="${screenStatus != 'view'}">
				<form:textarea rows="10" cols="30" path="memo"/>
			</c:if>
		</td>
	</tr>
	<c:if test="${screenStatus != 'add'}">
		<tr>
			<td>Data Upload</td>
			<td>
				<input type="text" value="${record.dtUpload}" size="30" disabled>
			</td>
		</tr>
	</c:if>
	<c:if test="${screenStatus == 'add'}">
		<tr>
			<td>Fisier</td>
			<td>
				<input type="file" value="choosse file">
			</td>
		</tr>			
	</c:if>
	
</table>
</form:form>
</div>
