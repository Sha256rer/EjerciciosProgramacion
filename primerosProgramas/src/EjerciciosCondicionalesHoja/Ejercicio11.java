package EjerciciosCondicionalesHoja;

import java.util.Scanner;

public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Teclea un numero:");
		int numero = Integer.valueOf(scanner.nextLine());
		if (numero < 100) {
			if (numero > 10 && numero < 15) {
				switch (numero) {
				case 11:
					System.out.println("Once");
					break;
				case 12:
					System.out.println("Doce");
					break;
				case 13:
					System.out.println("Trece");
					break;
				case 14:
					System.out.println("Catorce");
					break;
				case 15:
					System.out.println("Quince");
					break;
				}
			}else {
			
			int decenas = numero / 10;
			int unidades = numero % 10;
			String unidadesf, decenasf;
			switch (unidades) {
			case 0:
				unidadesf = "";
				break;
			case 1:
				unidadesf = "Uno";
				break;
			case 2:
				unidadesf = "Dos";
				break;
			case 3:
				unidadesf = "Tres";
				break;
			case 4:
				unidadesf = "Cuatro";
				break;
			case 5:
				unidadesf = "Cinco";
				break;
			case 6:
				unidadesf = "Seis";
				break;
			case 7:
				unidadesf = "Siete";
				break;
			case 8:
				unidadesf = "Ocho";
				break;
			case 9:
				unidadesf = "Nueve";
				break;
			default:
				unidadesf = "ERROR";
				break;
			}
			switch (decenas) {
			case 1:
				decenasf = "Diez";
				break;
			case 2:
				decenasf = "Veinti";
				break;
			case 3:
				decenasf = "Treinta";
				break;
			case 4:
				decenasf = "Cuarenta";
				break;
			case 5:
				decenasf = "Cincuenta";
				break;
			case 6:
				decenasf = "Sesenta";
				break;
			case 7:
				decenasf = "Setenta";
				break;
			case 8:
				decenasf = "Ochenta";
				break;
			case 9:
				decenasf = "Noventa";
				break;
			default:
				decenasf = "ERROR";
				break;
			}
		if (decenas==2 && unidades != 0) {
				System.out.println(decenasf + "" + unidadesf);
				}
		if(decenas==2 && unidades == 0) {
			System.out.println("Veinte");
		}
			
		if (unidades != 0 && decenas != 2) {
				System.out.println(decenasf + " y " + unidadesf);
		
		}else if (decenas == 0) {

				System.out.println(unidadesf);
			
		} else if(decenas != 2) {
			System.out.println(decenasf);
		}
			}
				
	}
	}
}
