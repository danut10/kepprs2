<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div>

<form:form id="frmDetails" modelAttribute="record" method="POST" enctype="multipart/form-data">
<form:hidden path="id"/>

<c:if test="${screenStatus != 'upload'}">
	<table>
		<c:if test="${screenStatus != 'add'}">
			<tr>
				<td>Data Upload</td>
				<td>
					<!--<fmt:formatDate pattern="dd.MM.yyyy" value="${atasament.dtUpload}" /> -->
					<input type="text" value="<fmt:formatDate type="both" pattern="dd.MM.yyyy" value="${record.dtUpload}"/>" size="30" disabled>
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
				<input type="text" value="${record.url}" size="30" disabled>
			</td>
		</tr>
		<tr>
			<td>Memo</td>
		</tr>
	</table>

	<p>
		<c:if test="${screenStatus == 'view'}">
			<textarea placeholder="${record.memo}" rows="10" cols="45" disabled></textarea>
		</c:if>
		<c:if test="${screenStatus != 'view'}">
			<form:textarea rows="10" cols="45" path="memo"/>
		</c:if>
	</p>
</c:if>

</form:form>
 


	<input type="file" name="file"><br> 
	<input type="button" value="Upload" onclick="window.location='uploadFile'">
		


</div>
