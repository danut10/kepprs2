
<html>
<head><link rel="stylesheet" type="text/css" href="style.css"></head>
<body>

	<h2>Bradulet</h2>


	<%@ page import="ro.kepler.kepres2.web.alextoma.Bradulet" %>

	
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
