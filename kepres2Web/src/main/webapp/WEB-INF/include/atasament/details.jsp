<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div>

<form:form id="frmDetails" modelAttribute="record" method="POST">
	<form:hidden path="id"/>
	<table>
		<tr>
			<td>Data Upload</td>
			<td>
				<fmt:formatDate var="dtUpload" pattern="dd.MM.yyyy" value="${record.dtUpload}" />
				<input type="text" value="${dtUpload}" disabled />
			</td>
		</tr>
		
		<tr>
			<td>Titlu</td>
			<td>
				<c:if test="${screenStatus == 'view'}"><input type="text" value="${record.titlu}" disabled></c:if>
				<c:if test="${screenStatus != 'view'}"><form:input path="titlu" /></c:if>
			</td>
		</tr>
		
		<tr>
			<td>Url</td>
			<td><input type="text" value="${record.url}" disabled></td>
		</tr>
		
		<tr>
			<td>Memo</td>
		</tr>
		
		<tr>
			<td colspan="2">
				<c:if test="${screenStatus == 'view'}"> <textarea disabled>${record.memo}</textarea></c:if>
				<c:if test="${screenStatus != 'view'}"> <form:textarea path="memo"/></c:if>			
			</td>
		</tr>
	
	</table>
	
</form:form>
</div>
