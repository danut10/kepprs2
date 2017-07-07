
package ro.kepler.kepres2.consola.george;

public class Main {
	public static void main(String[] args) {
		Consola consola = new Consola();
		Brad brad = new Brad(consola.nrRamuri());
		consola.afisare(brad);
	}
}
