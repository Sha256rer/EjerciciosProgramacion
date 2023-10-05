package EjerciciosCondicionales;

import java.util.Scanner;

public class ReciboAgua {

	public static void main(String[] args) {
		// Pedimos m3 de agua-> Hasta 10 valen 1 euro, entre 12 y 20 4 euros cada 1, a partir de 20 cada 1 10 euros
		Scanner scanner = new Scanner(System.in);
		int preciob=1, preciom=4, precioc=10;
		int limite1 = 10, limite2 = 20;
		int dineros;
		int metros = scanner.nextInt();
		if(metros<=limite1) {
			dineros = metros*preciob;
		}
		else if(metros<=20) {
			dineros = (limite1*preciob)+(metros-limite1)*preciom;
		}
		else {
			dineros = (limite1*preciob)+((limite2-limite1)*preciom)+(metros-(limite1+limite2))*precioc;
			
		}
		System.out.println(dineros);

	}

}
