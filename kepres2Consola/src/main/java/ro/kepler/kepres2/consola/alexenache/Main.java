package ro.kepler.kepres2.consola.alexenache;
public class Main {

	public static void main(String[] args) throws Exception {
		
		Console console = new Console();
		Tree tree = console.getPreferences();
		console.showTree(tree);
	}

}
