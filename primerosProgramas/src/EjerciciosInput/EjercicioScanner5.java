package EjerciciosInput;
import java.util.Scanner;

public class EjercicioScanner5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Cuantos segundos duró el concierto:");
		int segundosDuracion = Integer.valueOf(scan.nextLine());
		int minutos = segundosDuracion/60;
		int segundosFinal = segundosDuracion%60;
		int horas = minutos/60;
		int minutosFinal = minutos%60;
		
		System.out.printf("%02d:%02d:%02d", horas, minutosFinal, segundosFinal);
		/*
		 *%02d con printf. formatea el dígito de dos intergers, paddeando la tercera con 
		 *ceros. %tH:%tM:%tS parece no funcionar si no se usa un objeto time para ello
		 */
		
	
		
	}

}
