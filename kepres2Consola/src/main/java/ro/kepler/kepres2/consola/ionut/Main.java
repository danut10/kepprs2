package ro.kepler.kepres2.consola.ionut;

public class Main {
	public static void main(String[] args) {
		
		Consola console = new Consola();
		Tree tree = new Tree(console.citesteNrRamuri());
		
		console.showTree(tree);
		
	}

}
