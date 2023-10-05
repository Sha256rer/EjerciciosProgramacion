package EjerciciosCondicionalesHoja;
import java.util.Scanner;
public class DiaSiguiente {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dia, mes, año;
		System.out.println("Dia");
		dia = Integer.valueOf(scanner.nextLine());
		System.out.println("Mes");
		mes = Integer.valueOf(scanner.nextLine());
		System.out.println("Año");
		año = Integer.valueOf(scanner.nextLine());
		boolean bisiesto = ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0));
		switch (mes) {
		case 1:
			dia += 1;
			if (dia > 31) {
				mes += 1;
				dia = 1;
			}
			System.out.println(dia + " " + mes + " " + año);
			break;
		case 2:
			dia += 1;
			if ((dia > 28) && bisiesto == false) {
				mes += 1;
				dia = 1;
			} else if ((dia > 29) && bisiesto == true) {
				mes += 1;
				dia = 1;
			}
			System.out.println(dia + " " + mes + " " + año);
			break;
		case 3:
			dia += 1;
			if (dia > 31) {
				mes += 1;
				dia = 1;
			}
			System.out.println(dia + " " + mes + " " + año);
			break;
		case 4:
			dia += 1;
			if (dia > 30) {
				mes += 1;
				dia = 1;
			}
			System.out.println(dia + " " + mes + " " + año);
			break;
		case 5:
			dia += 1;
			if (dia > 31) {
				mes += 1;
				dia = 1;
			}
			System.out.println(dia + " " + mes + " " + año);
			break;
		case 6:
			dia += 1;
			if (dia > 30) {
				mes += 1;
				dia = 1;
			}
			System.out.println(dia + " " + mes + " " + año);
			break;
		case 7:
			dia += 1;
			if (dia > 31) {
				mes += 1;
				dia = 1;
			}
			System.out.println(dia + " " + mes + " " + año);
			break;
		case 8:
			dia += 1;
			if (dia > 31) {
				mes += 1;
				dia = 1;
			}
			System.out.println(dia + " " + mes + " " + año);
			break;
		case 9:
			dia += 1;
			if (dia > 30) {
				mes += 1;
				dia = 1;
			}
			System.out.println(dia + " " + mes + " " + año);
			break;
		case 10:
			dia += 1;
			if (dia > 31) {
				mes += 1;
				dia = 1;
			}
			System.out.println(dia + " " + mes + " " + año);
			break;
		case 11:
			dia += 1;
			if (dia > 30) {
				mes += 1;
				dia = 1;
			}
			System.out.println(dia + " " + mes + " " + año);
			break;
		case 12:
			dia += 1;
			if (dia > 31) {
				mes = 1;
				dia = 1;
				año += 1;
			}
			System.out.println(dia + " " + mes + " " + año);
			break;
		}
	}
}

