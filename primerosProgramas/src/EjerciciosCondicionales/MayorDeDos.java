package EjerciciosCondicionales;

import java.util.Scanner;

public class MayorDeDos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Teclea un numero:");
		int numero1 = Integer.valueOf(scanner.nextLine());
		System.out.println("Teclea un numero:");
		int numero2 = Integer.valueOf(scanner.nextLine());
		scanner.close();
		if (numero1 > numero2) {
			System.out.println("numero 1 es el mayor");
		} else if (numero1 == numero2) {
			System.out.println("Son iguales");
		} else {
			System.out.println("numero 2 es el mayor");
		}

	}

}
