package ro.kepler.kepres.consola.alexenache;

import ro.kepler.kepprt.app.alexenache.Tree;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Console console = new Console();
		Tree tree = console.getPreferences();
		console.showTree(tree);
	}

}
