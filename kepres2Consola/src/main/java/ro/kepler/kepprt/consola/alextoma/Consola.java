package ro.kepler.kepprt.consola.alextoma;

import java.util.Scanner;

import ro.kepler.kepprt.app.alextoma.Bradulet;


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

		for (int x = 1; x <= b.getLin() + 1; x++) {
			for (int y = 1; y <= 2 * b.getLin() + 1; y++)
				if (b.getMat()[x][y] == 0)
					System.out.print(" ");
				else
					System.out.print("*");
			System.out.print("\n");
		}
	}
}
