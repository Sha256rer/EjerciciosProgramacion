package primerosProgramas;

import java.util.Scanner;

public class EjercicioScanner1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Cual es tu edad?: ");
		int edad = scanner.nextInt();
		boolean mayorDeEdad = (edad>18);
		System.out.println(mayorDeEdad);
	}

}
