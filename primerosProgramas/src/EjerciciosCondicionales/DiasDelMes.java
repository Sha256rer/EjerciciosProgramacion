package EjerciciosCondicionales;

import java.util.Scanner;

public class DiasDelMes {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		switch (numero) {
		case 1,3,5,7,8,10,12:
			System.out.println("31");
			break;
		case 4,6,9,11:
			System.out.println("30");
			break;
		case 2:
			System.out.println("28");

		default:
			break;
		}

	}

}
