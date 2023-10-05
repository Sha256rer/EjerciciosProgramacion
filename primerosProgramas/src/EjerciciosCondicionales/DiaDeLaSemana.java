package EjerciciosCondicionales;

import java.util.Scanner;

public class DiaDeLaSemana {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		try {
			int numero = scanner.nextInt();
			switch (numero) {
			case 1:
				System.out.println("Lunes");
				break;
			case 2:
				System.out.println("Martes");
				break;
			case 3:
				System.out.println("Miercoles");
				break;
			case 4:
				System.out.println("Jueves");
				break;
			case 5:
				System.out.println("Viernes");
				break;
			case 6:
				System.out.println("Sábado");
				break;
			case 7:
				System.out.println("Domingo");
				break;
			default:
				System.out.println("Error");
				break;
			}
		} catch (Exception e) {
			System.out.println("Tu ere un maldito loco ");
		}

		// En caso de hacer este programa con if o else if hay que recordar una
		// característica de estas instrucciones. Else if fuinciona como un if dentro de
		// un else, quiere decir
		// que si tengo la solucion en el primer else if ya no se seguirá ejecutando el
		// programa como si lo hago todo con ifs.
	}
}
