package caixaForta;

import java.util.Scanner;

public class caixaForta {

	static Scanner lector = new Scanner(System.in);

	static caixaForta programa = new caixaForta();

	static String opcio = "";
	static float quantitatDisponible;

	public static void main(String[] args) {

		while (opcio.compareTo("S") != 0) {

			programa.menu();
			System.out.println(" ");
			programa.opcio();
		}

	}

	public static void menu() {

		System.out.println("BENVINGUT AL CONTE BANCARI! ");
		System.out.println("*****************************");
		System.out.println("*****************************");
		System.out.println("TRII L'OPCIÓ DESITJADA: ");
		System.out.println("*****************************");
		System.out.println("[C] Consultar el compte ");
		System.out.println("[T] Treure diners del compte ");
		System.out.println("[A] Afagir diners al compte ");
		System.out.println("[S] Sortir ");

	}

	public static void opcio() {

		opcio = lector.nextLine();

		switch (opcio) {

		case "C":

			quantitatDisponible = programa.consultarCompte(quantitatDisponible);
			break;

		case "T":

			quantitatDisponible = programa.treureDiners(quantitatDisponible);
			break;

		case "A":

			quantitatDisponible = programa.afegirDiners(quantitatDisponible);
			break;

		case "S":
			break;

		default:

			programa.menu();
			/*System.err.println("Opció erronia!");*/
			
			System.out.println(" ");
			System.out.println(" ");
			break;

		}

	}

	public float consultarCompte(float quantitatDisponible) {

		System.out.println("Al seu compte hi ha: " + quantitatDisponible + "€.");
		System.out.println(" ");

		return quantitatDisponible;
	}

	public float treureDiners(float quantitatDisponible) {

		System.out.println("Quina quantitat desitja retirar?");
		float dinersATreure = lector.nextFloat();

		if ((dinersATreure > 0) && (dinersATreure < quantitatDisponible)) {

			quantitatDisponible = quantitatDisponible - dinersATreure;

			System.out.println("L'operació s'ha completat correctament.");
			System.out.println(" ");

		} else {

			System.out.println("La quantitat a retirar és superior a la disponible.");
			System.out.println(" ");
		}

		return quantitatDisponible;
	}

	public float afegirDiners(float quantitatDisponible) {

		System.out.println("Introdueixi la quantitat a ingressar: ");
		float quantitatIngressar = lector.nextFloat();

		quantitatDisponible = quantitatDisponible + quantitatIngressar;
		
		System.out.println("L'operació s'ha completat correctament.");
		System.out.println(" ");

		return quantitatDisponible;
	}

}
