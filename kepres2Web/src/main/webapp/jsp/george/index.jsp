<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<html>

<body>

<h2>Hello World!</h2>

<%
int nrRamuri;
int nrLinii, nrColoane;
char matrice[][];
nrRamuri = 4;
nrLinii = (nrRamuri + 1) * (nrRamuri + 2) / 2 - 1;
nrColoane = 2 * nrRamuri + 1;
matrice = new char[nrLinii + 2][nrColoane];
for (int k = 1; k <= nrRamuri; k++) {
	int x = k * (k + 1) / 2 - 1;
	for (int i = 0; i <= k; i++) {
		for (int j = 0; j <= i; j++) {
			matrice[x + i][nrRamuri + j] = '*';
			matrice[x + i][nrRamuri - j] = '*';
		}
	}
}
matrice[nrLinii + 1][nrRamuri] = '*';
matrice[nrLinii][nrRamuri] = '*';
for (int i = 0; i < nrLinii + 2; i++) {
	for (int j = 0; j < nrColoane; j++)
		if(matrice[i][j] != '*')
			out.print("&nbsp&nbsp");
		else
		out.print(matrice[i][j]);
	out.print("<br>");
}

%>

</body>

</html>
