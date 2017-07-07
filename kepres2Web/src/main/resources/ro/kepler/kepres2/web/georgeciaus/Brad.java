
public class Brad {
	private int nrRamuri;

	public int nrLinii, nrColoane;
	public char matrice[][];

	public Brad(int nrRamuri) {
		this.nrRamuri = nrRamuri;
		nrLinii = (nrRamuri + 1) * (nrRamuri + 2) / 2 - 1;
		nrColoane = 2 * nrRamuri + 1;
		creareBrad();
	}

	private void creareBrad() {
		matrice = new char[nrLinii + 2][nrColoane];
		for (int k = 1; k <= nrRamuri; k++) {
			int x = k * (k + 1) / 2 - 1;
			for (int i = 0; i <= k; i++) {
				for (int j = 0; j <= i; j++) {
					matrice[x + i][nrRamuri + j] = '*';
					matrice[x + i][nrRamuri - j] = '*';
				}
			}
		}
		matrice[nrLinii + 1][nrRamuri] = '*';
		matrice[nrLinii][nrRamuri] = '*';

	}
}
}
