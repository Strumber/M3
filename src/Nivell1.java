import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Nivell1 {

	public static void main(String[] args) {
		System.out.println("\nFase 1\n");

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

		System.out.println("\nFase 2\n");

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

		System.out.println("\nFase 3\n");

		// Cambieu les vocals “a” dels noms de les ciutats per el numero 4 i guardeu els
		// noms modificats en un nou array(ArrayCiutatsModificades).
		// Mostreu per consola l’array modificat i ordenat per ordre alfabetic.

		ArrayList<String> arrayCiutatsModificades = new ArrayList<String>();
		ciutat1 = ciutat1.toUpperCase(); // converim l' string a majuscules
		String C1 = ciutat1.replace('A', '4');
		ciutat2 = ciutat2.toUpperCase(); // converim l' string a majuscules
		String C2 = ciutat2.replace('A', '4');
		ciutat3 = ciutat3.toUpperCase(); // converim l' string a majuscules
		String C3 = ciutat3.replace('A', '4');
		ciutat4 = ciutat4.toUpperCase(); // converim l' string a majuscules
		String C4 = ciutat4.replace('A', '4');
		ciutat5 = ciutat5.toUpperCase(); // converim l' string a majuscules
		String C5 = ciutat5.replace('A', '4');
		ciutat6 = ciutat6.toUpperCase(); // converim l' string a majuscules
		String C6 = ciutat6.replace('A', '4');

		arrayCiutatsModificades.add(C1);
		arrayCiutatsModificades.add(C2);
		arrayCiutatsModificades.add(C3);
		arrayCiutatsModificades.add(C4);
		arrayCiutatsModificades.add(C5);
		arrayCiutatsModificades.add(C6);
		Collections.sort(arrayCiutatsModificades);
		System.out.println("Ciutats Modificades per ordre alfabètic");
		for (String print : arrayCiutatsModificades) {
			System.out.println(print);
		}

		System.out.println("\nFase 4\n");
		System.out.println("Ciutats Invertides");
		// Creeu un nou array per cada una de les ciutats que tenim. La mida dels nous
		// arrays sera la llargada de cada string ( string nomCiutat.Length).
		// Ompliu els nous arrays lletra per lletra.
		// Mostreu per consola els nous arrays amb els noms invertits (Ex: Barcelona -
		// anolecraB).

		ArrayList<Character> arrayCiutat1 = new ArrayList<Character>();
		ArrayList<Character> arrayCiutat2 = new ArrayList<Character>();
		ArrayList<Character> arrayCiutat3 = new ArrayList<Character>();
		ArrayList<Character> arrayCiutat4 = new ArrayList<Character>();
		ArrayList<Character> arrayCiutat5 = new ArrayList<Character>();
		ArrayList<Character> arrayCiutat6 = new ArrayList<Character>();

		// Ciutat 1
		for (int i = ciutat1.length() - 1; i >= 0; i--) {
			arrayCiutat1.add(ciutat1.charAt(i));

		}

		for (char i : arrayCiutat1) {
			System.out.print(i);

		}
		System.out.println("\n");

		// Ciutat 2
		for (int i = ciutat2.length() - 1; i >= 0; i--) {
			arrayCiutat2.add(ciutat2.charAt(i));

		}

		for (char i : arrayCiutat2) {
			System.out.print(i);

		}
		System.out.println("\n");

		// Ciutat 3
		for (int i = ciutat3.length() - 1; i >= 0; i--) {
			arrayCiutat3.add(ciutat3.charAt(i));

		}

		for (char i : arrayCiutat3) {
			System.out.print(i);

		}
		System.out.println("\n");
		// Ciutat 4
		for (int i = ciutat4.length() - 1; i >= 0; i--) {
			arrayCiutat4.add(ciutat4.charAt(i));

		}

		for (char i : arrayCiutat4) {
			System.out.print(i);

		}
		System.out.println("\n");

		// Ciutat 5
		for (int i = ciutat5.length() - 1; i >= 0; i--) {
			arrayCiutat5.add(ciutat5.charAt(i));

		}

		for (char i : arrayCiutat5) {
			System.out.print(i);

		}
		System.out.println("\n");

		// Ciutat 6
		for (int i = ciutat6.length() - 1; i >= 0; i--) {
			arrayCiutat6.add(ciutat6.charAt(i));

		}

		for (char i : arrayCiutat6) {
			System.out.print(i);

		}
		System.out.println("\n");
	}

}
