<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="ro.kepler.kepprt.app.ioana.Brad" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Brad</title>
</head>
<body>
<%
	char fg = '*';
	char bg = ' ';
	Brad brad = new Brad(3);
	for (int i = 0; i < brad.linii + 2; i++) {
		for (int j = 0; j < brad.coloane; j++) {
			if ( brad.matrice[i][j] == 1 ) {
				out.print("*");
			}
			else {
				out.print("&nbsp&nbsp");
			}
		}
		out.print("<br>");
	}
%>
  
</body>
</html>