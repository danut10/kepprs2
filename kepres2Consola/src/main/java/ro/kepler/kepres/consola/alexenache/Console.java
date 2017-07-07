package ro.kepler.kepres.consola.alexenache;

import java.util.Scanner;

import ro.kepler.kepprt.app.alexenache.DataTree;
import ro.kepler.kepprt.app.alexenache.NormalTree;
import ro.kepler.kepprt.app.alexenache.Tree;
import ro.kepler.kepprt.app.alexenache.TriangularTree;

public class Console {

	public Tree getPreferences() {
		
		Scanner sc = new Scanner(System.in);

		int type = 0;
		while(type != 1 && type != 2) {
			System.out.println("Alege tipul bradului! 1) Brad normal. 2) Brad triunghiular");
			
			try	{
				type = sc.nextInt();
			}
			catch (Exception e) {
				sc.nextLine();
				System.out.println("Va rog sa alegeti doar 1 sau 2!");
			}
		}
		
		
		System.out.println("Care este inaltimea bradului?");
		
		int n;
		while(true) {
			
			try {
				n = sc.nextInt();
				
				if(n <= 0) {
					System.out.println("Inaltime incorecta! Introduceti o inaltime pozitiva!");
				}
				else {
					break;
				}
			}
			catch (Exception e) {
				sc.nextLine();
				System.out.println("Va rog sa introduceti o inaltime corecta!");
			}
			
			
		}
		
		sc.close();
		
		if(type == 1) {
			return new NormalTree(n);
		}
		else {
			return new TriangularTree(n);
		}
	}
	
	public void showTree(Tree tree) {
			
		DataTree dataTree = tree.getDataTree();
		byte[][] treeMatrix = dataTree.getTreeMatrix();
		
		for(int i = 0; i < dataTree.getHeigth(); ++i) {
			
			for(int j = 0; j < dataTree.getWidth(); ++j) {
				
				if(treeMatrix[i][j] == 0) {
					System.out.print(dataTree.getBackground());
				}
				else {
					System.out.print(dataTree.getForeground());
				}
			}
			System.out.println("");
		}
	}

}
