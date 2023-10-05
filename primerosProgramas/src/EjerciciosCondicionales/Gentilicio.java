package EjerciciosCondicionales;

import java.util.Scanner;

public class Gentilicio {

	public static void main(String[] args) {
		System.out.println("Teclea el nombre de un pueblo:");
		Scanner scanner = new Scanner(System.in);
		String pueblo = scanner.nextLine();
		scanner.close();
		switch (pueblo) {
		case "Toledo": 
			System.out.println("Toledano");
			break;
		case "Pantoja": 
			System.out.println("Pantojano");
			break;
		case "Yuncos": 
			System.out.println("Yunquero");
			break;
		case "Mora":
			System.out.println("Moracho");
		default:
			System.out.println("Pringado");
			break;
		}

	}

}
