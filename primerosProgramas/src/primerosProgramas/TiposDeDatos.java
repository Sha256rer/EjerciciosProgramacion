package primerosProgramas;

public class TiposDeDatos {
	public static void main(String[] args) {
		/*
		 * Programa donde probar los distintos tipos de datos
		 * Crearemos variables de todos ellos 
		 */
		//declaro una variable del tipo boolean
		boolean tieneCarnetDeConducir;
		//guardo un dato en la variable
		tieneCarnetDeConducir = true;
		//se puede hacer en una sola linea
		boolean hayToner = false;
		System.out.println(tieneCarnetDeConducir);
		
		/*
		 * tipos char y String
		 * 
		 */
		char letra = 'A';
		System.out.println(letra);
		System.out.println((int)letra);
		letra = '\t'; //guardo la tecla tabulador
		letra = '\n'; //tecla intro(linejump)
		
			
		String frase = "Buenos días clase";
		String vacio = ""; 
		
		byte pequeña;
		short mediana;
		int grande;
		long familiar;
		
		pequeña = 127;
		mediana = 32000;
		grande = 383874848;
		familiar = 392349284823743374l;
		
		mediana = (short) (32000 + pequeña); //typecast a short
		System.out.println(familiar);
		
		/*
		 * variables con decimales
		 */
		double muchaPrecision = 2249234.3949495;
		float pocaPrecision = 29394.2949495F;
		System.out.println(pocaPrecision + muchaPrecision);
		System.out.println((int)(pocaPrecision+ muchaPrecision));
		
	
	
		
	}
		
	}


