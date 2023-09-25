package primerosProgramas;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
/*
 * Usado para testear varios métodos de redondeo
 * Metodo 1: Uso  text.DecimalFormat y creo una instancia
 * del objeto decimal format, utilizando como parametro 0.00.
 * Además añado el rounding mode de java.math para que este decimal 
 * format redondee de la manera en que yo quiero
 * 
 * Metodo 2: String.format("String + %.nf", variable). Printea el decimal
 * en el formato indicado pero no se puede decidir el modo de redondeo
 */

public class EjercicioScanner4 {
	private static final DecimalFormat redondeo = new DecimalFormat("0.00");
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		Double peso = Double.valueOf(scanner.nextLine());
		Double pesoLuna = (peso/9.8)*1.62;
		redondeo.setRoundingMode(RoundingMode.DOWN);
		System.out.println(redondeo.format(pesoLuna) +"Kg");
		System.out.println(String.format("Rounded: %.2fKg", pesoLuna));
	}

}
