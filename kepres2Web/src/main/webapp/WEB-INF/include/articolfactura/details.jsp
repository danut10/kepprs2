<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>

<div>
<form:form id="frmDetails" modelAttribute="record" method="POST">
<form:hidden path="id"/>
<table>
<tr>
		 <td>Articol Factura</td>
		<td>
			<c:if test="${screenStatus == 'view'}">
				<input type="text" value="${record.serie}" disabled>
			</c:if>
			<c:if test="${screenStatus != 'view'}">
				<form:input path="factura"/>
			</c:if>
		</td>
		</tr> 
	<tr>
		<td>NrCrt</td>
		<td>
			<c:if test="${screenStatus == 'view'}">
				<input type="text" value="${record.serie}" disabled>
			</c:if>
			<c:if test="${screenStatus != 'view'}">
				<form:input path="nrCrt"/>
			</c:if>
			
		</td>
	</tr>
	<tr>
		<td>UM</td>
		<td>
			<c:if test="${screenStatus == 'view'}">
				<input type="text" value="${record.numar}" disabled>
			</c:if>
			<c:if test="${screenStatus != 'view'}">
				<form:input path="um"/>
			</c:if>
		</td>
	</tr>
	<tr>
		<td>Cantitatea</td>
		<td>
			<c:if test="${screenStatus == 'view'}">
				<input type="text" value="${record.numar}" disabled>
			</c:if>
			<c:if test="${screenStatus != 'view'}">
				<form:input path="cantitatea"/>
			</c:if>
		</td>
	</tr>
	<tr>
		<td>Pret Unitar</td>
		<td>
			<c:if test="${screenStatus == 'view'}">
				<input type="text" value="${record.numar}" disabled>
			</c:if>
			<c:if test="${screenStatus != 'view'}">
				<form:input path="pret_unitar"/>
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
		<td>Descriere</td>
		<td>
			<c:if test="${screenStatus == 'view'}">
				<input type="text" value="${record.numar}" disabled>
			</c:if>
			<c:if test="${screenStatus != 'view'}">
				<form:input path="descriere"/>
			</c:if>
		</td>
	</tr>	
	</table>
		<p>
			<c:if test="${screenStatus == 'view'}">
			<!-- <input type="text" value="${record.memo}" disabled> -->
				<textarea placeholder="${record.memo}" rows="12" cols="37" disabled></textarea>
			</c:if>
			<c:if test="${screenStatus != 'view'}">
				<!-- <form:input path="memo"/> -->
				<form:textarea rows="12" cols="37" path="descriere"/>
			</c:if>
		</p> 

</form:form>
</div>

