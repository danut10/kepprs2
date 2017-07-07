package ro.kepler.kepres2.consola.ioana;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		try{
		 Scanner s = new Scanner(System.in);
		 System.out.println("Introduceti numarul de ramuri: ");
		 int numarRamuri = s.nextInt();
		 Brad brad = new Brad(numarRamuri);
		 
		 Consola cons = new Consola();
			cons.afisareBrad(brad);
		} catch (Exception e) {
			System.out.println("Introduceti un numar natural!");
		  }	
	}
}
