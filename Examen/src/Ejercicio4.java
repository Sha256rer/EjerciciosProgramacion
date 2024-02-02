import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un número de cuatro cifras: ");
        int numero = scanner.nextInt();
        while(numero>9999||numero<1000){
            System.out.println("El número es inválido, introduce uno nuevo");
            numero = scanner.nextInt();
        //Comprouebo que el numero esta en el rango indicado, y pide otro en caso contrario
       String numerostring =  String.valueOf(numero);
       String straight = numerostring.substring(2);
       StringBuilder sb = new StringBuilder(numerostring.substring(0,2));
       String reversed = sb.reverse().toString();
       //paso el número a string, lo divido en 2 substrings, siendo el primero un
        // stringbuilder para darle la vuelta. El segundo un string normal
       int parterev = Integer.parseInt(reversed);
       int partenor = Integer.parseInt(straight);
       if(partenor*parterev==numero){
           System.out.println("Es un número vampiro");
       }
       else{
           System.out.println("No lo es");
       }
        }
       //paso las dos partes a entero, las multiplico y compruebo si es igual al número
        // si lo es, vampiro, si no, no.
    }
}
