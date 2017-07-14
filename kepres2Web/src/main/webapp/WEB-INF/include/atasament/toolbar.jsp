<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div>
	<c:if test="${screenStatus == 'list'}">
		<input type="button" value="Adauga" onclick="window.location='upload'">
	</c:if>
	
	<c:if test="${screenStatus == 'upload' }">
		<input type="submit" value="Salvare" form="frmDetails" formaction="add?url=${record.url}">
		<input type="button" value="Renuntare" onclick="window.location='list'">
	</c:if>
	
	<c:if test="${screenStatus == 'view'}">
		<input type="button" value="Editare" onclick="window.location='edit?id=${record.id}'">
		<input type="button" value="Stergere" onclick="window.location='delete?id=${record.id}'">
		<input type="button" value="Lista" onclick="window.location='list'">
		<input type="button" value="Download" onclick="window.location='download?id=${record.id}'">
	</c:if>
	
	<c:if test="${screenStatus == 'edit'}">
		<input type="submit" value="Salvare" form="frmDetails" formaction="update">
		<input type="button" value="Renuntare" onclick="window.location='view?id=${record.id}'">
	</c:if>
	
	<c:if test="${screenStatus == 'add'}">
		<input type="submit" value="Salvare" form="frmDetails" formaction="create?url=${record.url}">
		<input type="button" value="Renuntare" onclick="window.location='list'">
	</c:if>
	
</div>
