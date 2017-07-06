package ro.kepler.kepres2.consola.alextoma;

import java.util.Scanner;

public class Consola {

	public int valid() {
		Scanner sc = new Scanner(System.in);
		int m;
		do {
			System.out.print("Introduceti numarul de ramuri: ");
			while (!sc.hasNextInt()) {
				System.out.print("Va rog introduceti o cifra! ");
				sc.next();
			}
			m = sc.nextInt();
		} while (m <= 0);
		sc.close();
		return m;
	}
	

	public void afisare(Bradulet b) {

		for (int x = 1; x <= b.lin + 1; x++) {
			for (int y = 1; y <= 2 * b.n + 1; y++)
				if (b.mat[x][y] == 0)
					System.out.print(" ");
				else
					System.out.print("*");
			System.out.print("\n");
		}
	}
}
