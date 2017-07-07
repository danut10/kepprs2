package ro.kepler.kepres2.consola.andrei;

import java.util.Scanner;

public class Consola {
	private char fg = '*';
	private char bg = ' ';
	
	public int citire()
	{
		System.out.print("Cate ramuri doresti sa aiba bradul? ");
		Scanner sc=new Scanner(System.in);
		int x = sc.nextInt();
		
		if(x <= 0)
		{
			System.out.print("ERROARE");
			sc.close();
			return 0;
		}
		else {
			sc.close();
		    return x;
		}
		     
	}
	
	public void afisare(Brad brad) {
		int ramuri = brad.getNrRamuri();
		int[][] matrice = brad.getMatriceBrad();
		
		for (int i = 0; i < ((ramuri + 1) * (ramuri + 2)) / 2 + 1; i++) {

			for (int j = 0; j < 2 * ramuri + 1; j++) {
				if (matrice[i][j] == 0) { 
					System.out.print(bg); 
				} else {
					System.out.print(fg); 
				}
				//System.out.print(a[i][j] + " ");
			}
			System.out.println();
			

		}
		
		afisareRamuri(ramuri);

	}
	
	/*
	 * Private methods 
	 */
	
	private void afisareRamuri(int nrRamuri) {
		System.out.println("\nNumarul de ramuri ale bradului este: " +nrRamuri);
	}

}
