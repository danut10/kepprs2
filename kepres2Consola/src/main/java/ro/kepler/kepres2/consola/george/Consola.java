package ro.kepler.kepres2.consola.george;

import java.util.Scanner;

public class Consola {
	public int nrRamuri() {
		Scanner s = new Scanner(System.in);
		int a;
		System.out.print("Introduceti numarul de ramuri: ");
		a = s.nextInt();
		s.close();
		return a;
	}

	public void afisare(Brad b) {
		for (int i = 0; i <= b.nrLinii; i++) {
			for (int j = 0; j <= b.nrColoane; j++)
				System.out.print(b.matrice[i][j]);
			System.out.println();
		}
	}
}
