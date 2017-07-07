package ro.kepler.kepres2.consola.alextoma;

import ro.kepler.kepprt.app.alextoma.Bradulet;
import ro.kepler.kepres2.consola.alextoma.Consola;

public class Main {



	public static void main(String[] args) {
		
		Consola ramuri = new Consola();
		Bradulet brad = new Bradulet(ramuri.valid());
		brad.creareBrad();
		Consola afis = new Consola();
		afis.afisare(brad);
	}
}
