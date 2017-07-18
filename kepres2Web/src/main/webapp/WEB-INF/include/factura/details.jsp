<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<div>
<form:form id="frmDetails" modelAttribute="record" method="POST">
<form:hidden path="id"/>
<table>
<tr>
		 <td>Data Emitere</td>
		<td>
			<c:if test="${screenStatus == 'view'}">
			 	<input type="text" value="<fmt:formatDate pattern = "dd.MM.yyyy" value = "${record.dtEmitere}" />" disabled>
			</c:if>
			<c:if test="${screenStatus != 'view'}">
				<form:input path="dtEmitere"/>
			</c:if>
		</td>
		</tr> 
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
		<tr>
		<td>Suma</td>
		<td>
			<c:if test="${screenStatus == 'view'}">
				<input type="text" value="${record.suma}" disabled>
			</c:if>
			<c:if test="${screenStatus != 'view'}">
				<form:input path="suma"/>
			</c:if>
		</td>
	</tr>
		<tr>
		<td>Tva</td>
		<td>
			<c:if test="${screenStatus == 'view'}">
				<input type="text" value="${record.tva}" disabled>
			</c:if>
			<c:if test="${screenStatus != 'view'}">
				<form:input path="tva"/>
			</c:if>
		</td>
		</tr>
		<tr>
		<td>Total</td>
		<td>
			<c:if test="${screenStatus == 'view'}">
				<input type="text" value="${record.total}" disabled>
			</c:if>
			<c:if test="${screenStatus != 'view'}">
				<form:input path="total"/>
			</c:if>
		</td>
		</tr>
		<tr>
		<td>Moneda</td>
		<td>
			<c:if test="${screenStatus == 'view'}">
				<input type="text" value="${record.moneda.nume}" disabled>
			</c:if>
			<c:if test="${screenStatus != 'view'}">
				<form:input path="moneda"/>
			</c:if>
			
		</td>
	</tr>
		<tr>
		<td>Draft</td>
		<td>
			<c:if test="${screenStatus == 'view'}">
				<input type="checkbox" value="${record.draft}" disabled>
			</c:if>
			<c:if test="${screenStatus != 'view'}">
				<form:input path="draft"/>
			</c:if>
		</td>
	</tr>
	
	<tr>
		<td>Data Scadenta</td>
		<td>
			<c:if test="${screenStatus == 'view'}">
				<input type="text" value="<fmt:formatDate pattern = "dd.MM.yyyy" value = "${record.dtScadenta}" />" disabled>
			</c:if>
			<c:if test="${screenStatus != 'view'}">
				<form:input path="dtScadenta"/>
			</c:if>
		</td>
		</tr>
	<tr>
		<td>Memo</td>
			</tr>
	</table>
		<p>
			<c:if test="${screenStatus == 'view'}">
			<!-- <input type="text" value="${record.memo}" disabled> -->
				<textarea placeholder="${record.memo}" rows="12" cols="37" disabled></textarea>
			</c:if>
			<c:if test="${screenStatus != 'view'}">
				<!-- <form:input path="memo"/> -->
				<form:textarea rows="12" cols="37" path="memo"/>
			</c:if>
		</p> 

</form:form>
</div>

