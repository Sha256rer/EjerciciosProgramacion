package primerosProgramas;

public class Operadores {
	public static void main(String[] args) {
		/*
		 * Probando operadores
		 */
		
		int a = 7, b = 5;
		System.out.println("Suma: "+a +b);
		System.out.println("División" +(a /b));
		System.out.println("Resto: "+(a%b));
		
		//operador incremento
		a++; //Si ponemos el operador detras de la variable el incremento se hace después de las ordenes de los demás operadores
		++a; // De esta manera se hace primero.
		//operador decremento
		b--;
		System.out.println("Suma con ++ previo a sumando b"+a + ++b);
		System.out.println("Suman con ++ después de sumando b" +a + b++);
		System.out.println((a>b)+"," + " Comparación entre operadores\n, a>b resultando en un boolean" );
		boolean hayToner, hayPapel, resultado;
		
		hayToner = true;
		hayPapel = true;
		
		resultado = hayToner && hayPapel; 
		/*
		 * diferencia entre & y &&. 
		 * El simple constanta ambos elementos incluso si el primero es false, el segundo ahorra tiempo
		 * y solo comprueba que la primera es falsa
		 */
		System.out.println("Podemos imprimir "+ resultado);
		
		boolean familiaNumerosa=true , bajosIngresos= false, beca;
		beca = familiaNumerosa || bajosIngresos; //se puede poner singular 
		System.out.println((beca) + "Muestra el resultado de familiaNumerosa ||(or) \n y de bajosIngresos");
	}

}
