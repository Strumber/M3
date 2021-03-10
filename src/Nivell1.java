import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Nivell1 {

	public static void main(String[] args) {
		System.out.println("Fase 1");

		// Crea sis variables tipu string buides.

		String ciutat1, ciutat2, ciutat3, ciutat4, ciutat5, ciutat6;

		// Demana per consola que s’introdueixin els noms.
		// Introdueix els següents noms de ciutats (Barcelona, Madrid, Valencia, Malaga,
		// Cadis, Santander) per teclat.

		Scanner ciutats = new Scanner(System.in);
		System.out.println("Introdueix el nom de la ciutat1");
		ciutat1 = ciutats.nextLine();
		System.out.println("Introdueix el nom de la ciutat2");
		ciutat2 = ciutats.nextLine();
		System.out.println("Introdueix el nom de la ciutat3");
		ciutat3 = ciutats.nextLine();
		System.out.println("Introdueix el nom de la ciutat4");
		ciutat4 = ciutats.nextLine();
		System.out.println("Introdueix el nom de la ciutat5");
		ciutat5 = ciutats.nextLine();
		System.out.println("Introdueix el nom de la ciutat6");
		ciutat6 = ciutats.nextLine();

		// Mostra per consola el nom de les 6 ciutats.

		System.out.println("Aquestes són les ciutats que has introduït : " + ciutat1 + " , " + ciutat2 + " , " + ciutat3
				+ " , " + ciutat4 + " , " + ciutat5 + " i " + ciutat6);

		System.out.println("Fase 2");

		// Un cop tenim els noms de les ciutats guardats en variables haurem de pasar
		// l’informacio a un array (arrayCiutats).

		ArrayList<String> arrayCiutats = new ArrayList<String>();

		arrayCiutats.add(ciutat1);
		arrayCiutats.add(ciutat2);
		arrayCiutats.add(ciutat3);
		arrayCiutats.add(ciutat4);
		arrayCiutats.add(ciutat5);
		arrayCiutats.add(ciutat6);

		// Quan tinguem l’array ple, haurem de mostrar per consola el nom de les ciutats
		// ordenadas per ordre alfabetic.

		Collections.sort(arrayCiutats);
		System.out.println("Ciutats per ordre alfabètic");
		for (String print : arrayCiutats) {
			System.out.println(print);
		}

		System.out.println("Fase 3");

		// Cambieu les vocals “a” dels noms de les ciutats per el numero 4 i guardeu els
		// noms modificats en un nou array(ArrayCiutatsModificades).
		// Mostreu per consola l’array modificat i ordenat per ordre alfabetic.

		ArrayList<String> arrayCiutatsModificades = new ArrayList<String>();
		ciutat1 =ciutat1.toUpperCase(); //converim l' string a majuscules
		ciutat1 = ciutat1.replace('A', '4');
		ciutat2=ciutat2.toUpperCase(); //converim l' string a majuscules
		ciutat2 = ciutat2.replace('A', '4');
		ciutat3=ciutat3.toUpperCase(); //converim l' string a majuscules
		ciutat3 = ciutat3.replace('A', '4');
		ciutat4=ciutat4.toUpperCase(); //converim l' string a majuscules
		ciutat4 = ciutat4.replace('A', '4');
		ciutat5=ciutat5.toUpperCase(); //converim l' string a majuscules
		ciutat5 = ciutat5.replace('A', '4');
		ciutat6=ciutat6.toUpperCase(); //converim l' string a majuscules
		ciutat6 = ciutat6.replace('A', '4');
		
		arrayCiutatsModificades.add(ciutat1);
		arrayCiutatsModificades.add(ciutat2);
		arrayCiutatsModificades.add(ciutat3);
		arrayCiutatsModificades.add(ciutat4);
		arrayCiutatsModificades.add(ciutat5);
		arrayCiutatsModificades.add(ciutat6);
		Collections.sort(arrayCiutatsModificades);
		System.out.println("Ciutats Modificades per ordre alfabètic");
		for (String print : arrayCiutatsModificades) {
			System.out.println(print);
		}
		
		
	

	}

}
