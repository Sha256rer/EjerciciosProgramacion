package primerosProgramas;
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
		
		//La lógica es esta, si me ape investigar como dejar el resultado en un formato bonito. 
		//Posible forma, si min o sec < 10 añadir un 0 la izq con Int.toString. Muy cutre
		
	}

}
