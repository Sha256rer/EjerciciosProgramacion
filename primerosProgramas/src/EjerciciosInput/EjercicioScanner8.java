package EjerciciosInput;

import java.util.Scanner;

public class EjercicioScanner8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double longitud, area,radio;
		System.out.println("Da un radio:");
		radio = Double.valueOf(scanner.nextLine());
		longitud = radio*2;
		area = (radio*radio)*Math.PI;
		System.out.printf("%.02f", longitud );
		System.out.println("");
		System.out.printf("%.02f", area);
		
		

	}

}
