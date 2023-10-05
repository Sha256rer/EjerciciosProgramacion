package EjerciciosCondicionales;

import java.util.Scanner;

public class EstadoCivil {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char letra = scanner.nextLine().charAt(0);

		if (letra == 's' || letra == 'S') {
			System.out.println("Soltero");

		}

		else if (letra == 'c' || letra == 'C') {
			System.out.println("Casado");

		} else if (letra == 'V' || letra == 'v') {
			System.out.println("Viudo");

		} else if (letra == 'd' || letra == 'D') {
			System.out.println("Divorciado");

		}

		char letra2 = scanner.nextLine().charAt(0);
		switch (letra2) {
		case 's', 'S':
			System.out.println("Soltero");
			break;
		case 'c', 'C':
			System.out.println("Casado");
			break;
		case 'v', 'V':
			System.out.println("Viudo");
			break;
		case 'd', 'D':
			System.out.println("Divorciado");
			break;
		}

	}
}
