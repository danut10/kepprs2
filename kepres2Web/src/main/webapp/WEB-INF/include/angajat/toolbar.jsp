<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div>
	<c:if test="${screenStatus == 'list'}">
		<input type="button" value="Adauga">
	</c:if>
	
	<c:if test="${screenStatus == 'view'}">
		<input type="button" value="Editare">
		<input type="button" value="Stergere">
		<input type="button" value="Lista">
	</c:if>
	
	<c:if test="${screenStatus == 'edit'}">
		<input type="submit" value="Salvare">
		<input type="button" value="Renuntare">
	</c:if>
	
	<c:if test="${screenStatus == 'add'}">
		<input type="submit" value="Salvare">
		<input type="button" value="Renuntare">
	</c:if>
</div>
