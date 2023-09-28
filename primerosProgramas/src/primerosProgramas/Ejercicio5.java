package primerosProgramas;
import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	int a,b,c,d, resultado;
	
	a = Integer.valueOf(scanner.nextLine());
	b = Integer.valueOf(scanner.nextLine());
	c = Integer.valueOf(scanner.nextLine());
	d = Integer.valueOf(scanner.nextLine());
	resultado = ((b+c)/2*a)/(a-b)*(c+d);
	resultado = (a+b)/(3*a);
	

}
}