package primerosProgramas;

import java.util.Scanner;
import java.time.LocalDate;

public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Formato D/M/A en distintas lineas");
		int d, m , a;
		System.out.println("D: ");
		d = Integer.valueOf(scanner.nextLine());
		String dia = Integer.toString(d);
		System.out.println("M: ");
		m = Integer.valueOf(scanner.nextLine());
		String mes = Integer.toString(m);
		if(d<10) {
			dia = "0"+dia;
			System.out.println(dia);
		}
		if(m<10) {
			mes = "0"+mes;
		}	
		System.out.println("A: ");
		a = Integer.valueOf(scanner.nextLine());
		LocalDate date = LocalDate.now();
		String testing = date.toString();
		String usuario = Integer.toString(a+20)+
		"-"+mes+"-"+dia;
		System.out.println(usuario +" "+testing);
		
		
	if (testing.equals(usuario)){
		System.out.println("Feliz Cumpleaños!");
	}
	else {
		System.out.println("Nada pa ti");
	}
		
		
	}

}
