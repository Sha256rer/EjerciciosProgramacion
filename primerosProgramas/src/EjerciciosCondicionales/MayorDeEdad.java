package EjerciciosCondicionales;

import java.util.Scanner;

public class MayorDeEdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Teclea tu edad: ");
		int edad = Integer.valueOf(scanner.nextLine());
		scanner.close();
		boolean condition = edad >= 18;
		if (condition) {
			System.out.println("Eres mayor de edad");

		} else {
			System.out.println("No lo eres");

		}
	}

}
