package EjerciciosCondicionalesHoja;

import java.util.Scanner;

public class Numero789 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int unidades1, decenas1, centenas1, miles1;
		System.out.println("Teclea un numero:");
		int numero1 = Integer.valueOf(scanner.nextLine());
		if (numero1 < 10) {
			System.out.println("Una cifra");
			System.out.println("No competen ni capicua ni cifras al reves");
		} else if (numero1 < 100) {
			System.out.println("Dos cifras");
			decenas1 = numero1 % 10;
			unidades1 = numero1 / 10;
			System.out.println(decenas1 + "" + unidades1);
			if ((decenas1*10+unidades1) == numero1) {
				System.out.println("Es capicua");
			}
		}
		else if(numero1<1000) {
			System.out.println("Tres cifras");
			centenas1 = numero1%10;
			decenas1 = (numero1/10)%10;
			unidades1 = numero1/100;
			System.out.println(centenas1+""+decenas1+""+unidades1);
			if ((centenas1*100+decenas1*10+unidades1) == numero1) {
				System.out.println("Es capicua");
			}
			
		}
		else if(numero1<10000) {
			System.out.println("Cuatro cifras");
			miles1 = numero1%10;
			centenas1 = (numero1/10)%10;
			decenas1 = (numero1/100)%10;
			unidades1 = numero1/1000;
			System.out.println(miles1+""+centenas1+""+decenas1+""+unidades1);
			if ((miles1*1000+centenas1*100+decenas1*10+unidades1) == numero1) {
				System.out.println("Es capicua");
			}
			
		}
	}

}
