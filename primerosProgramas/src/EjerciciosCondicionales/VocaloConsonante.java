package EjerciciosCondicionales;

import java.util.Scanner;

public class VocaloConsonante {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char letra;
		letra = scanner.nextLine().charAt(0);
		scanner.close();
		if(letra == 'a'||letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.println("Es vocal");
		}
		else {
			System.out.println("Consontante");
		}

	}

}
