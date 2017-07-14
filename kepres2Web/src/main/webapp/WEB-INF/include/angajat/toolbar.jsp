<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="divToolbar">
	<c:if test="${screenStatus == 'list'}">
		<button onclick="window.location='add'">
			<img title="view" src="${pageContext.request.contextPath}/img/actions/add.png">
		</button>
		<button>
			<img title="filter" src="${pageContext.request.contextPath}/img/actions/view.png">
		</button>
	</c:if>
	
	<c:if test="${screenStatus == 'view'}">
		<input type="button" value="Editare" onclick="window.location='edit?id=${record.id}'">
		<input type="button" value="Stergere" onclick="window.location='delete?id=${record.id}'">
		<input type="button" value="Lista" onclick="window.location='list'">
	</c:if>
	
	<c:if test="${screenStatus == 'edit'}">
		<input type="submit" value="Salvare" form="frmDetails" formaction="update">
		<input type="button" value="Renuntare" onclick="window.location='view?id=${record.id}'">
	</c:if>
	
	<c:if test="${screenStatus == 'add'}">
		<input type="submit" value="Salvare" form="frmDetails" formaction="create">
		<input type="button" value="Renuntare" onclick="window.location='list'">
	</c:if>
</div>
