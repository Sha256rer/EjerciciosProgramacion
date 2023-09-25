package primerosProgramas;

import java.util.Scanner;

public class EjercicioScanner3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int año = scan.nextInt();
		boolean bisiesto = (año%4 == 0 && año % 100 != 0) || año%400 == 0;;
		
		System.out.println(bisiesto);
		/*
		 * Testeado con el chatGPT, ta bien
		 */
	}

}
