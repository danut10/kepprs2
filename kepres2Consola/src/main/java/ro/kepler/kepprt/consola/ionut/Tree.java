package ro.kepler.kepprt.consola.ionut;

public class Tree {

	public int nrLinii, nrColoane;
	public byte tree[][];

	private int nrRamuri, centru;

	public Tree(int nrRamuri) {
		this.nrRamuri = nrRamuri;

		nrLinii = (nrRamuri + 1) * (nrRamuri + 2) / 2 - 1;
		nrColoane = nrRamuri * 2 + 1;
		centru = nrRamuri;
		tree = new byte[nrLinii + 2][nrColoane];
		buildTree();
	}

	private void buildTree() {

		// initializez matricea cu 0
		for (int i = 0; i < nrLinii + 2; i++) {
			for (int j = 0; j < nrColoane; j++) {
				tree[i][j] = 0;
			}

		}

		// desenez ramurile
		for (int k = 1; k <= nrRamuri; k++) {

			int start = k * (k + 1) / 2 - 1;

			for (int i = 0; i <= k; i++) {
				for (int j = 0; j <= i; j++) {

					tree[start + i][centru + j] = 1;
					tree[start + i][centru - j] = 1;
				}

			}
		}
		
		// desenez trunchi
		tree[nrLinii + 1][centru] = tree[nrLinii][centru] = 1;

	}

}
