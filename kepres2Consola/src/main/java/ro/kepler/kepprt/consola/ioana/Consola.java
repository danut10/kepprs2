package ro.kepler.kepprt.consola.ioana;

import ro.kepler.kepprt.app.ioana.Brad;

public class Consola {
	private char fg = '*';
	private char bg = ' ';
	
	public void afisareBrad(Brad brad) {
		for (int i = 0; i < brad.linii + 2; i++) {
			for (int j = 0; j < brad.coloane; j++) {
				if ( brad.matrice[i][j] == 1 ) {
					System.out.print(fg);
				}
				else {
					System.out.print(bg);
				}
			}
			System.out.println();
		}
	}

}
