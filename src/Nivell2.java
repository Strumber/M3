import javax.swing.*;

public class Nivell2 {
	/*
	 * En aquest exercici crearàs un array bidimensional on introduiràs 3 notes per
	 * a 5 alumnes. Es calcularà la nota mitjana de cada alumna i
	 * s'indicarà si han suspès o no. Crea un array bidimensional capaç de guardar 3
	 * notes de 5 alumnes. Omple l’array amb un bucle demanant els valors per
	 * pantalla (nota entre 0 i 10), has d’identificar per pantalla quan és una
	 * agrupació d’un alumne nou . Recorre l'array, fes la Mitjana aritmètica de les
	 * 3 notes i indica si l'alumne ha aprovat o suspès
	 */

	public static void main(String[] args) {
		String Alumne;
		float nota;
		float[][] notes = new float[5][3];
		String[] Alumnes = new String[5];
		float[] promig = new float[5];

		for (int n = 0; n < 5; n++) {
			Alumne = JOptionPane.showInputDialog("Introdueix Nom de l' alumen nº : " + (n + 1));
			Alumnes[n] = Alumne; // Crea un array amb el nom de cada alumne

			int cont = 0;

			for (int a = 0; a < 3; a++) {
				cont++;// id alumne
				do {// Introdueix les tres notes per cada un dels alumnes
					nota = Float.parseFloat(
							JOptionPane.showInputDialog("Introdueix la nota nº : " + cont + " alumne(" + Alumne + ")"));
					if (nota < 0 || nota > 10) {
						JOptionPane.showMessageDialog(null,
								"La nota introduïda no es correcte, el valor ha de ser entre 0 i 10");
					}
				} while (nota < 0 || nota > 10);

				notes[n][a] = nota;// omple l' array bidimensional amb cada una de les notes de cada alumne

			}
			promig[n] = (notes[n][0] + notes[n][1] + notes[n][2]) / 3;

		}
		for (int i = 0; i < 5; i++) { // Mostra per consola el resultat per a cada un dels alumnes

			System.out.println("La nota mitja de l' alumne " + Alumnes[i] + " es de : " + promig[i]);

			if (promig[i] >= 5) {
				System.out.println("HAS APROVAT !!!!");
			} else {
				System.out.println("Has suspès !!!!!!!!!!!!");
			}

		}

	}

}
