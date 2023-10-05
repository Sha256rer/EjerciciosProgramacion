package EjerciciosCondicionalesHoja;

import java.util.Scanner;

public class MedidaDeTiempo {

	public static void main(String[] args) {
		int a, b, c;
		Scanner scanner = new Scanner(System.in);
		a = Integer.valueOf(scanner.nextLine());
		b = Integer.valueOf(scanner.nextLine());
		c = Integer.valueOf(scanner.nextLine());
		if (c>=60) {
			b += (c/60);
			c = c%60;
		}
		if (b>=60) {
				a += (b/60);
				b = b%60;
		}
		
		System.out.printf("%02d:%02d:%02d", a,b,c);

	}

	}
	
