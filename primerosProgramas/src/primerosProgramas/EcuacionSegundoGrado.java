package primerosProgramas;
import java.util.Scanner;
import java.lang.Math;
/* Cosas interesantes: Declarar variable double como objeto para utilizar metodo .isNaN().
 * .isNaN() para detectar si el resultado de una raiz cuadrada es un numero negativo.
 * @author Sharerp
 */

public class EcuacionSegundoGrado {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a, b, c;
		a=Double.valueOf(scan.nextLine());
		b=Double.valueOf(scan.nextLine());
		c=Double.valueOf(scan.nextLine());
		
		Double test = new Double(Math.sqrt(b*b-4*a*c));
		Double divisor = (2*a);
		if(test.isNaN()) {
			System.out.println("Negative sqrt");
		}
		else {
			double[] resultado = {(-b+test)/divisor,(-b-test)/divisor};
			System.out.println(resultado[0]+" , "+resultado[1]);
		}
		
			
		
		
	
		
		
		
	}

}
