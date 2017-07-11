<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div>
<form:form id="frmDetails" modelAttribute="record" method="POST">
<form:hidden path="id"/>
<table>
	<tr>
		<td>Titlu Atasament</td>
		<td>
			<c:if test="${screenStatus == 'view'}">
				<input type="text" value="${record.titlu}" disabled>
			</c:if>
			<c:if test="${screenStatus != 'view'}">
				<form:input path="titlu"/>
			</c:if>
			
		</td>
	</tr>
	<tr>
		<td>Memo</td>
		<td>
			<c:if test="${screenStatus == 'view'}">
				<input type="text" value="${record.memo}" disabled>
			</c:if>
			<c:if test="${screenStatus != 'view'}">
				<form:input path="memo"/>
			</c:if>
		</td>
	</tr>
</table>
</form:form>
</div>
