package primerosProgramas;

import java.util.Scanner;

public class EjercicioScanner2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numero = scanner.nextInt();
		boolean multiploDeSiete = numero%7==0;
		System.out.println(multiploDeSiete);
	}

}
