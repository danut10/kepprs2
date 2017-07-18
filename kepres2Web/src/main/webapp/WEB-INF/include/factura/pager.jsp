<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<div id="divPager">
	<table style="width: 100%">
	<tr>
		<td>Record count: ${pager.recordCount}</td>
		<td align="center"> 
			<a href="#" onclick="changePage(1);">&laquo;</a> &nbsp;	
			<c:forEach var="pageNo" items="${pager.visiblePages}">
				<c:if test="${pager.pageNo == pageNo}">
					<a href="#" onclick="changePage(${pageNo});" style="font-size: 15pt;">${pageNo}</a> 
				</c:if>
				<c:if test="${pager.pageNo != pageNo}">
					<a href="#" onclick="changePage(${pageNo});">${pageNo}</a>
				</c:if>
				&nbsp;
			</c:forEach>
			<a href="#" onclick="changePage(${pager.pageCount});">&raquo;</a>
		</td>
		<td align="right">Current page: ${pager.pageNo} din ${pager.pageCount}</td>
	
	</tr>	
	</table>
	
</div>
