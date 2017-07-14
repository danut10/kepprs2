<%@ page language="java" contentType="text/html; charset=ISO-8859-2" pageEncoding="ISO-8859-2"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div>
<form:form id="frmDetails" modelAttribute="record" method="POST">
<form:hidden path="id"/>
<table>
	
	<tr>
		<td>Titlu</td>
		<td>
			<c:if test="${screenStatus == 'view'}">
				<input type="text" value="${record.diacritice}" size="30" disabled>
			</c:if>
			<c:if test="${screenStatus != 'view'}">
				<form:input path="diacritice" size="30" />
			</c:if>
			
		</td>
	</tr>

</table>


</form:form>
</div>
