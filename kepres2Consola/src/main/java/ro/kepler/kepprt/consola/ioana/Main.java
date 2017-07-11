package ro.kepler.kepprt.consola.ioana;

import java.util.*;

import ro.kepler.kepprt.app.ioana.Brad;

public class Main {
	public static void main(String[] args) {
		Scanner s = null;
		try {
		 s = new Scanner(System.in);
		 System.out.println("Introduceti numarul de ramuri: ");
		 int numarRamuri = s.nextInt();
		 Brad brad = new Brad(numarRamuri);
		 
		 Consola cons = new Consola();
			cons.afisareBrad(brad);
		} catch (Exception e) {
			System.out.println("Introduceti un numar natural!");
		} finally {
			s.close();
		}	
	}
}
