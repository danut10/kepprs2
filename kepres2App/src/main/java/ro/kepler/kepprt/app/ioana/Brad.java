package ro.kepler.kepprt.app.ioana;

public class Brad {

	private int nrRamuri;
	private int varfR;

	public int linii, coloane; 
	public byte matrice[][];
	
	public Brad (int nrRamuri) {
		this.nrRamuri = nrRamuri;
		linii = (nrRamuri + 1) * (nrRamuri + 2) / 2 - 1;
		coloane = 2 * nrRamuri + 1;
		varfR = nrRamuri;
		buildBrad();
	}
	
	private void buildBrad() {
		matrice = new byte [linii + 2][coloane];
		for(int k = 1; k <= nrRamuri; k++) {
			int x = k * (k + 1) / 2 - 1;	// de aici incep stelutele
			for(int i = 0; i <= k; i++) {
				for(int j = 0; j <= i; j++) {
					matrice[x + i][varfR + j] = 1;
					matrice[x + i][varfR - j] = 1;
				}
			}
		}
		matrice[linii+1][varfR] = matrice[linii][varfR] = 1;
	}
	
}
