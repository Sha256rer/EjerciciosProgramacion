package primerosProgramas;

import java.util.Scanner;
import java.lang.Math;

public class Doble {

	public static void main(String[] args) {
		/*
		 * Programa que pida al usuario que teclee un numero y nosotros imprimimos el
		 * doble de ese numero
		 * 
		 * @author Sharerp
		 */
		
		try{
		Scanner scan = new Scanner(System.in); // Instancio el objeto scanner
		double numero, doble; // variables para el número y su doble
		System.out.print("Teclea un número: ");// print estandar para que el número se teclee en la misma línea
		numero = Double.valueOf(scan.nextLine()); // asigno input a la variable número
		doble = numero * 2; // Hago el doble
		System.out.println("Este es el doble: " + doble); // Muestro el resultado
		scan.close(); // Cierro el scanner para prevenir memory leaking.
		}
		catch (Exception e) {
			System.out.println("El numero no es valido");
		}
	}

}
