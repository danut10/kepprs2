<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%


int nrRamuri;

int nrLinii, nrColoane;
char matrice[][];
nrRamuri = 3;
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

for (int i = 0; i < nrLinii+2; i++) {
	for (int j = 0; j < nrColoane; j++)
		out.print(matrice[i][j]);
	out.print("<br>");
}

%>
<body>

</body>
</html>