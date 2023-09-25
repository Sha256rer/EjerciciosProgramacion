package primerosProgramas;

import java.util.Scanner;

public class EjercicioScanner7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		a = Integer.valueOf(scanner.nextLine());
		b = Integer.valueOf(scanner.nextLine());
		c = Integer.valueOf(scanner.nextLine());
		boolean grande = (a>b)&&(b>c);
		System.out.println(grande);
	}

}
