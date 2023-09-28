package EjerciciosInput;

import java.util.Scanner;

public class EjercicioScanner9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Numero a invertir: ");
		int numero = Integer.valueOf(scanner.nextLine());
		//StringBuilder numero1 = new StringBuilder(Integer.toString(numero)).reverse();
		int calc1 = numero/10;
		int cifra1 = numero%10;
		int calc2 = calc1/10;
		int cifra2 = calc1%10;
		int calc3 = calc2/10;
		int cifra3 = calc2%10;
		int calc4 = calc3/10;
		int cifra4 = calc3%10;
		String numeroe = cifra1 +""+cifra2 +""+ cifra3 +""+ cifra4 +""+ calc4;
		numeroe = numeroe.replaceAll("0*$", "");
		Integer numeroo = Integer.valueOf(numeroe);
		System.out.println(numeroo);
		
		
	
		
		
		/*
		 * Este programa es muy interesante. 
		 * No soy capaz de hacerlo sin que me queden 0 a la derecha del numero inverido
		 * Cosas intentadas-> Concatenar en un string las cifras del numero invertido.
		 * Multiplcar las cifras del numero invertido por 1, 10 etc hasta 10000 y sumar.
		 * Como invertir un numero-> dividir entre 10 el numero continuamente e ir dividiendo el resultado entre 10
		 * Los restos seran el numero invertido en orden ascendente (primer resto->primera cifra...)
		 * Otra posibilidad-> Sabemos que es un número hasta 99999. Dividir x 10000, 1000... etc. Los resultados serían 
		 * el número en orden descendente.
		 * La única manera que he conseguido para sacar esto sin los 0 al final es con if else. Se puede con bucles y con 
		 * un switch tambien, quizas más bonito en este caso.
		 * Metodo alternativo con el que se puede resolve, aunque implica fumadas de strings. 
		 * Crear un Strng Builder(Lo mismo que un string pero viene con una serie de métodos y es resizable. 
		 * Utilizas un reverse y le da la vuelta al string.
		 */
		//Intentando nuevo metodo, utilizar printf. De momento no sale nada
	}

	

}
