import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Nivell1 {

	public static void main(String[] args) {
		// Fase 1

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

		// Fase 2

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

	}

}
