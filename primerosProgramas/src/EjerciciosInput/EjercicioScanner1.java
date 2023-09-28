package EjerciciosInput;

import java.util.Scanner;

public class EjercicioScanner1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.print("Cual es tu edad?: ");
		byte edad = scanner.nextByte();
		boolean mayorDeEdad = (edad>=18);
		System.out.println("Múltiplo de 7" +mayorDeEdad);
		scanner.close();
	}

}
