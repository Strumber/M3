import java.util.Scanner;

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
		
		System.out.print(" Aquestes són les ciutats que has introduït : " + ciutat1 +" , "+ciutat2+" , "+ciutat3+" , "+ ciutat4+" , "+ciutat5+" i "+ciutat6);
		

	}

}
