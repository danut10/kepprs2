
package ro.kepler.kepprt.consola.georgeciaus;

public class Main {
	public static void main(String[] args) {
		Consola consola = new Consola();
		Brad brad = new Brad(consola.nrRamuri());
		consola.afisare(brad);
	}
}
