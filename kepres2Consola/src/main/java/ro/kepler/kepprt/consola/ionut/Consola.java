package ro.kepler.kepprt.consola.ionut;

import java.util.Scanner;

public class Consola {

	public void showTree(Tree t) {

		for (int i = 0; i < t.nrLinii + 2; i++) {
			for (int j = 0; j < t.nrColoane; j++)
				if (t.tree[i][j] == 1)
					System.out.print('*');
				else
					System.out.print(' ');
			System.out.println();

		}
	}
	
	public int citesteNrRamuri() {
		Scanner s = new Scanner(System.in);
		System.out.println("Dati numarul de ramuri al bradutului: ");
		String line = s.nextLine();
		int nrRamuri=0;
		try{
			nrRamuri=Integer.parseInt(line);
			s.close();
		}catch(Exception e){
			System.out.println("Introduceti un numar intreg pozitiv ");
		}
		
		return nrRamuri;
	}
}
