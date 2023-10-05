package EjerciciosCondicionalesHoja;

import java.util.Scanner;

public class Triángulo {

	public static void main(String[] args) {
		int a, b, c;
		Scanner scanner = new Scanner(System.in);
		a = Integer.valueOf(scanner.nextLine());
		b = Integer.valueOf(scanner.nextLine());
		c = Integer.valueOf(scanner.nextLine());
		if (a >= (b + c)) {
			System.out.println("No es un triángulo");
		} else if (Math.pow(a, 2) > Math.pow(c, 2) + Math.pow(b, 2)) {
			System.out.println("Rectángulo");
		} else if (Math.pow(a, 2) == Math.pow(c, 2) + Math.pow(b, 2)) {
			System.out.println("Obtusángulo");
		} else if (Math.pow(a, 2) < Math.pow(c, 2) + Math.pow(b, 2)) {
			System.out.println("Acutángulo");
		}

	}

}
