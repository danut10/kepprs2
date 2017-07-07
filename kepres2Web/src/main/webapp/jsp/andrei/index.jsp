<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="ro.kepler.kepprt.app.andrei.Brad" %>

<html>
<head>
    <title>Bradut</title> 
    
</head>    
<body>
   
   <div id="brad">
   <%
   int n=4;
   Brad brad = new Brad(n);
   int[][] matrice = brad.getMatriceBrad();
   for(int ramuri=0; ramuri < ((brad.getNrRamuri() + 1) * (brad.getNrRamuri() + 2)) / 2 + 1; ramuri++ ){
	   for(int i=0;i<2 * brad.getNrRamuri() + 1;i++){
		   if(matrice[ramuri][i] == 0)
			   out.print("&nbsp&nbsp");
		   else
			   out.print("*");
	   }
	   out.print("<br>");
		   
   }
   
   %>
   </div>
  
  </body>
</html>
