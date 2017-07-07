package ro.kepler.kepres2.web.ionut;

import java.io.PrintWriter;

public class Consola {

	public void showTree(Tree t, PrintWriter out) {

		
		
		for (int i = 0; i < t.nrLinii + 2; i++) {
			for (int j = 0; j < t.nrColoane; j++)
				if (t.tree[i][j] == 1)
					out.print('*');
				else
					out.print("&nbsp;&nbsp;");
			out.println("<br>");

		}
	}
	
	/*public int citesteNrRamuri() {
		Scanner s = new Scanner(System.in);
		System.out.println("Dati numarul de ramuri al bradutului: ");
		String line = s.nextLine();
		int nrRamuri=0;
		try{
			nrRamuri=Integer.parseInt(line);
		}catch(Exception e){
			System.out.println("Introduceti un numar intreg pozitiv ");
		}
		return nrRamuri;
	}*/
}
