<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="divToolbar">
	<c:if test="${screenStatus == 'list'}">
		<button>
			<img title="Filtrare" src="${pageContext.request.contextPath}/img/actions/search3.png">
		</button>
		<button>
			<img title="Clear filter" src="${pageContext.request.contextPath}/img/actions/unsearch3.png">
		</button>
		<button onclick="window.location='add'">
			<img title="Adaugare" src="${pageContext.request.contextPath}/img/actions/add.png">
		</button>
	</c:if>
	
	<c:if test="${screenStatus == 'view'}">
		<button onclick="window.location='edit?id=${record.id}'">
			<img title="Editare" src="${pageContext.request.contextPath}/img/actions/edit.png">
		</button>
		<button onclick="window.location='delete?id=${record.id}'">
			<img title="Stergere" src="${pageContext.request.contextPath}/img/actions/delete.png">
		</button>
		<button onclick="window.location='list'">
			<img title="Back to list" src="${pageContext.request.contextPath}/img/actions/list2.png">
		</button>
		<input type="button" value="Download" onclick="window.location='download?id=${record.id}'">
		<input type="button" value="Excel" onclick="window.location='excel?id=${record.id}'">
		<input type="button" value="View" onclick="window.open('download?id=${record.id}')">
	</c:if>
	
	<c:if test="${screenStatus == 'edit'}">
		<button title="Salvare" type="submit" form="frmDetails" formaction="update" >
			<img src="${pageContext.request.contextPath}/img/actions/save.png">
		</button>
		<button title="Renuntare" onclick="window.location='view?id=${record.id}'">
			<img src="${pageContext.request.contextPath}/img/actions/cancel.png">
		</button>
	</c:if>
	
	<c:if test="${screenStatus == 'add'}">
		<button title="Salvare" type="submit" form="frmDetails" formaction="create" >
			<img src="${pageContext.request.contextPath}/img/actions/save.png">
		</button>
		<button onclick="window.location='list'">
			<img title="Back to list" src="${pageContext.request.contextPath}/img/actions/list2.png">
		</button>
	</c:if>
	
</div>
