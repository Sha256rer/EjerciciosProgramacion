import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int numeropalabras =  0;
        int longitudpalabra= 0;
        System.out.println("Introduce una frase:");
        String frase = scanner.nextLine();
        StringTokenizer trocear = new StringTokenizer(frase);
        while (trocear.hasMoreTokens()){
            String current = trocear.nextToken();
            longitudpalabra += current.length();
            numeropalabras++;
    }
        /*
        / Este programa es muy simple. Creo un contador de palabras y una suma de la longitud de las palabras
        cuento la cantidad de palabras que hay y las divido entre la cantidad de letras que tienen todas juntas
        divido estoss dos numeros convertidos en float para mostrar un resultado con decimales
         */
        System.out.println((float)longitudpalabra/(float)numeropalabras);
}
}
