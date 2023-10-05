package EjerciciosCondicionales;

import java.util.Scanner;

public class MayorDeDos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Teclea un numero:");
		int numero1 = Integer.valueOf(scanner.nextLine());
		System.out.println("Teclea un numero:");
		int numero2 = Integer.valueOf(scanner.nextLine());

		if (numero1 > numero2) {
			System.out.println("numero 1 es el mayor");
		} else if (numero1 == numero2) {
			System.out.println("Son iguales");
		} else {
			System.out.println("numero 2 es el mayor");
		}

		/*System.out.println("Teclea un numero:");
		int numero3 = Integer.valueOf(scanner.nextLine());
		System.out.println("Teclea un numero:");
		int numero4 = Integer.valueOf(scanner.nextLine());
		System.out.println("Teclea un numero:");
		int numero5 = Integer.valueOf(scanner.nextLine());
		scanner.close();
		if (numero4 > numero3 && numero4 > numero5) {
			System.out.println("numero 4 es el mayor");
		} else if (numero3 > numero4 && numero3 > numero5) {
			System.out.println("Numero 3 es el mayor");
		} else {
			if (numero3 == numero4 && numero3 == numero5) {
				System.out.println("Son iguales");

			} else {
				if(numero5>numero4&&numero5>numero3) {
				System.out.println("numero 5 es el mayor");
				}
				else {
					
				}
				
				/*
				 * A>B && A>C-> A es mayor B>A && B>C b es mayor.
				 * Si no-> si son todos iguales-> Son iguales. Si no-> C es el mayor
				 * Error de esta lógica=Si c es menor que A y B lo detecta como mayor
				 */
			}
		

	}


