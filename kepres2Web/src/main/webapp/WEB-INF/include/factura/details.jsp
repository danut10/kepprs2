<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div>
<form:form id="frmDetails" modelAttribute="record" method="POST">
<form:hidden path="id"/>
<table>
	<tr>
		<td>Serie factura</td>
		<td>
			<c:if test="${screenStatus == 'view'}">
				<input type="text" value="${record.serie}" disabled>
			</c:if>
			<c:if test="${screenStatus != 'view'}">
				<form:input path="serie"/>
			</c:if>
			
		</td>
	</tr>
	<tr>
		<td>Numar factura</td>
		<td>
			<c:if test="${screenStatus == 'view'}">
				<input type="text" value="${record.numar}" disabled>
			</c:if>
			<c:if test="${screenStatus != 'view'}">
				<form:input path="numar"/>
			</c:if>
		</td>
	</tr>
</table>
</form:form>
</div>