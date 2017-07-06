package ro.kepler.kepres2.consola.alextoma;


public class Bradulet {
	
	int ramura, nivel, poz, frunza, lin=1,n;
	byte mat[][];

	public Bradulet(int n){
		this.n = n;
	}
	
	public void creareBrad() {

		
		mat = new byte[ 100 ][ 100 ];
		for (ramura = 1; ramura <= n; ramura++) {
			for (nivel = 1; nivel <= ramura + 1; nivel++) {
				frunza = 0;
				for (poz = 1; poz <= 2 * nivel - 1; poz++)
					frunza++;
				for (poz = 1; poz <= (2 * n + 1 - frunza) / 2; poz++)
					//System.out.print(" ");
					mat[ lin ][ poz ] = 0;
				for (poz = (2 * n + 1 - frunza) / 2 + 1; poz <= (2 * n + 1 - frunza) / 2 + frunza; poz++) {
					//System.out.print("*");
					mat[ lin ][ poz ] = 1;
				}
				//System.out.print("\n");
				lin++;
			}
		}
		mat[ lin ][ n + 1 ] = 1;
		mat[ lin + 1 ][ n + 1 ] = 1;
		
	}


}
