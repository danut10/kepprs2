package ro.kepler.kepprt.consola.andrei;

import ro.kepler.kepprt.app.andrei.Brad;

public class Main {

	public static void main(String[] args) {

		Consola cons = new Consola();
		Brad brad = new Brad(cons.citire());
		cons.afisare(brad);
	}

}
