<%@ page language="java" contentType="text/html; charset=ISO-8859-2" pageEncoding="ISO-8859-2"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div>
<form:form id="frmDetails" modelAttribute="record" method="POST">
<form:hidden path="id"/>
<table>
	<c:if test="${screenStatus != 'add'}">
		<tr>
			<td>Data Upload</td>
			<td>
				<fmt:formatDate type="both" value="${record.dtUpload}"/>
			</td>
		</tr>
	</c:if>
	<tr>
		<td>Titlu</td>
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
		<td>Url</td>
		<td>
			<c:if test="${screenStatus == 'view'}">
				<input type="text" value="${record.url}" size="30" disabled>
			</c:if>
			<c:if test="${screenStatus != 'view'}">
				<form:input path="url" size="30" />
			</c:if>
		</td>
	</tr>
	<c:if test="${screenStatus == 'add'}">
		<tr>
			<td>Fisier</td>
			<td>
				<input type="file" value="choose file"><br>
				<input type="button" value="Upload" onclick="window.location='upload'">
			</td>
		</tr>			
	</c:if>
	<tr>
		<td>Memo</td>
	</tr>
</table>

	<p>
		<c:if test="${screenStatus == 'view'}">
			<textarea placeholder="${record.memo}" rows="10" cols="32" disabled></textarea>
		</c:if>
		<c:if test="${screenStatus != 'view'}">
			<form:textarea rows="10" cols="38" path="memo"/>
		</c:if>
	</p>
</form:form>
</div>
