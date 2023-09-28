package primerosProgramas;


public class Ejercicio1 {
	public static void main(String[] args) {
		int a = 1, b=4, c=10, resultado;
		
		resultado = 5*(a*a) + 3*a - 6;
		boolean inec = resultado>= 0;
		System.out.println(inec);
		
		resultado = (a-b)/a + (c-b)/b;
		boolean inec2 = resultado> b/a;
		System.out.println(inec2);
		
		boolean inec3 = a+b <= c && c < c + b;
		System.out.println(inec3);
		
		
	}

}
