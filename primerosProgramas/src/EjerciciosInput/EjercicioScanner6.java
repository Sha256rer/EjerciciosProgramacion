package EjerciciosInput;

import java.util.Scanner;

public class EjercicioScanner6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Teclea la cantidad de euros:");
		int dinero = Integer.valueOf(scan.nextLine());
		
		int billetes500 =dinero/500, resto1=dinero%500;
		int billetes200 = resto1/200, resto2 = resto1%200;
		int billetes100 = resto2/100, resto3 = resto2%100;
		int billetes50 = resto3/50, resto4 = resto3%50;
		int billetes20 = resto4/20, resto5 = resto4%20;
		int billetes10 = resto5/10,  resto6 = resto5%10;
		int billetes5 = resto6/5;
		System.out.println(billetes500+" "+billetes200);
		System.out.println(billetes100+" "+billetes50);
		System.out.println(billetes20+" "+billetes10);
		System.out.println(billetes5);
		
		/*
		 * Me provocó ciertas dificultades, solucionado abordando las divisiones siguiendo el procedimiento 
		 * como en una hoja de papel, hasta quedarnos sin billetes más pequeños 3450/500=6 r: 450/200 = 2
		 * r = 50/100 0 r: 50/50=1; 6 billetes de 500, 2 de 200 y uno de 50.
		 */
		
	}

}
