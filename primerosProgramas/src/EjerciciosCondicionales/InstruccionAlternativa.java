package EjerciciosCondicionales;

public class InstruccionAlternativa {

	public static void main(String[] args) {
		//instrucción alternativa simple y doble
		/*
		 * Simple
		 * 
		 * 	si(condición)
		 * 		instrucciones
		 * 	fisi
		 */
		
		boolean condicion = true;
		if(condicion) {
			System.out.println("La condición es verdadera");
		}
		/*
		 * Doble 
		 * 
		 * 	si(condicio)
		 * 		instrucciones
		 * 	sino
		 * 		instrucciones 
		 * 	finsi
		 */
		if (condicion) {
			System.out.println("La condición es verdadera");
		} else {
			System.out.println("La condición es falsa");
		}
		
	}

}
