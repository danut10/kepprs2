<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div>
<form:form id="frmDetails" modelAttribute="record" method="POST">
<form:hidden path="id"/>
<table>
	<tr>
		<td>Cod angajat</td>
		<td>
			<c:if test="${screenStatus == 'view'}">
				<input type="text" value="${record.cod}" disabled>
			</c:if>
			<c:if test="${screenStatus != 'view'}">
				<form:input path="cod"/>
			</c:if>
			
		</td>
	</tr>
	<tr>
		<td>Nume angajat</td>
		<td>
			<c:if test="${screenStatus == 'view'}">
				<input type="text" value="${record.nume}" disabled>
			</c:if>
			<c:if test="${screenStatus != 'view'}">
				<form:input path="nume"/>
			</c:if>
		</td>
	</tr>
</table>
</form:form>
</div>
