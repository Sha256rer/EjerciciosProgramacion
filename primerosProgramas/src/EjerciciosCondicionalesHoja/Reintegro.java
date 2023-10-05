package EjerciciosCondicionalesHoja;

import java.util.Scanner;
import java.util.Random;

public class Reintegro {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int premiado, tuyo;
		//System.out.println("Introduce el premiado:");
		premiado = (int)(Math.random()*100000); 
		//multiplicamos por 100.000 pq te da un número entre 10.000 y 99.999, pudiendo ser uno de ellos 000.000
		//Math.random() genera un número de x cifras entre 0 y 1 siempre 0.nnnn....
		System.out.println("Introduce el tuyo:");
		tuyo = Integer.valueOf(scanner.nextLine());
		String compara1, compara2;
		compara1 = Integer.toString(premiado);
		compara2 = Integer.toString(tuyo);
		if(compara2.charAt(0) == (compara1.charAt(0)) || compara2.charAt(4) == (compara1.charAt(4))) {
			System.out.println("Décimo Premiado");
		}
		
			
		
	}

}
 