package EjerciciosCondicionalesHoja;

import java.util.Scanner;

public class LetraDNI {

	public static void main(String[] args) {
		int a, numeroletra;
		Scanner scanner = new Scanner(System.in);
		a = Integer.valueOf(scanner.nextLine());
		if (a>10000000 && a<999999999) {
		numeroletra = a%23;
		switch (numeroletra) {
	    case 0:
            System.out.println("The calculated DNI letter is: T");
            break;
        case 1:
            System.out.println("The calculated DNI letter is: R");
            break;
        case 2:
            System.out.println("The calculated DNI letter is: W");
            break;
        case 3:
            System.out.println("The calculated DNI letter is: A");
            break;
        case 4:
            System.out.println("The calculated DNI letter is: G");
            break;
        case 5:
            System.out.println("The calculated DNI letter is: M");
            break;
        case 6:
            System.out.println("The calculated DNI letter is: Y");
            break;
        case 7:
            System.out.println("The calculated DNI letter is: F");
            break;
        case 8:
            System.out.println("The calculated DNI letter is: P");
            break;
        case 9:
            System.out.println("The calculated DNI letter is: D");
            break;
        case 10:
            System.out.println("The calculated DNI letter is: X");
            break;
        case 11:
            System.out.println("The calculated DNI letter is: B");
            break;
        case 12:
            System.out.println("The calculated DNI letter is: N");
            break;
        case 13:
            System.out.println("The calculated DNI letter is: J");
            break;
        case 14:
            System.out.println("The calculated DNI letter is: Z");
            break;
        case 15:
            System.out.println("The calculated DNI letter is: S");
            break;
        case 16:
            System.out.println("The calculated DNI letter is: Q");
            break;
        case 17:
            System.out.println("The calculated DNI letter is: V");
            break;
        case 18:
            System.out.println("The calculated DNI letter is: H");
            break;
        case 19:
            System.out.println("The calculated DNI letter is: L");
            break;
        case 20:
            System.out.println("The calculated DNI letter is: C");
            break;
        case 21:
            System.out.println("The calculated DNI letter is: K");
            break;
        case 22:
            System.out.println("The calculated DNI letter is: E");
            break;
		default:
			break;
		}
		}
		else {
			System.out.println("Numero no válido");
		}

	}

}
