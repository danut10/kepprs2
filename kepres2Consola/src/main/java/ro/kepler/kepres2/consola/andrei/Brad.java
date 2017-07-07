package ro.kepler.kepres2.consola.andrei;

public class Brad {

	private int nrRamuri;
	private int matriceBrad[][];

	public Brad(int nrRamuri) {
		this.nrRamuri = nrRamuri;
		matriceBrad = new int[((nrRamuri + 1) * (nrRamuri + 2)) / 2 + 1][2 * nrRamuri + 1];
		buildMatrice();
	}

	public int[][] getMatriceBrad() { return matriceBrad; }
	public int getNrRamuri() { return nrRamuri; }

	/*
	 * Private methods
	 */
	
	private void buildMatrice() {
		
		
		// desenare ramuri
		for (int i = 1; i <= nrRamuri; i++) {
			
			for (int j = 0; j <= i; j++) {
				
				for (int k = 0; k < nrRamuri - j; k++) {
					matriceBrad[i * (i + 1) / 2 - 1 + j][k] = 0;
				}
				
				for (int k = nrRamuri - j; k < nrRamuri + 1 + j; k++) { 
					matriceBrad[i * (i + 1) / 2 - 1 + j][k] = 1;
				}
				
				for (int k = nrRamuri - 1; k > j + nrRamuri + 1; k--) {
					matriceBrad[i * (i + 1) / 2 - 1 + j][k] = 0;
				}
				
			}
		}
		
		// desenare suport brad
		for (int i = (nrRamuri + 1) * (nrRamuri + 2) / 2 - 1; i < (nrRamuri + 1) * (nrRamuri + 2) / 2 + 1; i++) {
			for (int k = 0; k < nrRamuri; k++) {
				matriceBrad[i][k] = 0;
			}
			matriceBrad[i][nrRamuri] = 1;
			for (int k = nrRamuri + 1; k < 2 * nrRamuri + 1; k++) {
				matriceBrad[i][k] = 0;
			}
		}
	}


	

	
}
