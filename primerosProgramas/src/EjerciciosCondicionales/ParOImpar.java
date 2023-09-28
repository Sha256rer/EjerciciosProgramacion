package EjerciciosCondicionales;

import java.util.Scanner;

public class ParOImpar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Da un número: ");
		int numero = Integer.valueOf(scanner.nextLine());
		boolean condición = numero % 2 == 0;
		scanner.close();
		if (condición) {
			System.out.println("Es par");
		} else {
			System.out.println("No es par");
		}

	}

}
