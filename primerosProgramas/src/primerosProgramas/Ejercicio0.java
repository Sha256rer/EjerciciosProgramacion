package primerosProgramas;

public class Ejercicio0 {
	public static void main(String[] args) {
		int x = 1, y= 4, z=10;
		final double PI=3.141592f;
		final double E = 2.718281f;
		System.out.println(2*x+0.5*y-(1/5f*z)); //castear o multiplicar la division pq si no 1/5 da 0 por estar operando con enteros. 
		System.out.println(PI*x*x>y||2*PI*x<=z);
		System.out.println(x-y+z+PI-E+2.576689);
		System.out.println(-3*x+2*y-(1/2f*z));
		System.out.println(x > 3 && y == 4 || x + y <= z);
		System.out.println(x > 3 && (y == 4 || x + y <= z));
		System.out.println(!(2*x==y/2||(PI-E)*z>y));
		System.out.println(!(2*x==y/2||(PI-E)*z>y)==(!(y/2==2*x)&&!(y<(PI-E)*z)));
		/*
		 * Este ejercicio enseña a tener cuidaddo con el orden de los operadores 
		 * y con hacer las divisiones que sean menores a 0 o tengan decimales casteando
		 * las variables de dividendo y divisor o multiplicando por 1.0
		 */
		
		
		
				
		
		
	}

}
