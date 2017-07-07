<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="ro.kepler.kepprt.app.alextoma.*" %>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>

<head>
		<link rel="stylesheet" href="${pageContext.request.contextPath}/css/alextoma/style.css">
</head>

<body>

	<h2>Bradulet</h2>



	
	<div id="brad">
	<% 
	int n=5;
	Bradulet brad = new Bradulet(n);
	brad.creareBrad();
	byte m[][] = brad.getMat();
	for(int linie = 1; linie <= brad.getLin() + 1; linie++){
		for(int col = 1; col <= 2 * n + 1; col++)
			if(m[ linie ][ col ] == 0)
				out.print("&nbsp");
			else 
				out.print("*");
		out.print("<br>");
		}
	%> 
	</div>
	 
</body>
</html>
