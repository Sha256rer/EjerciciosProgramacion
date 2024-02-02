package EjerciciosStrings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio9 {
    public static void main(String[] args) {
        String buscar, frase;
        int contador = 0;
        System.out.println("Introduce un string: ");
        Scanner scanner = new Scanner(System.in);
        buscar = scanner.nextLine();
        System.out.println("Frase: ");
        frase = scanner.nextLine();
        StringTokenizer trocear = new StringTokenizer(frase);
        while(trocear.hasMoreTokens()){
            String current = trocear.nextToken();
            if (current.equalsIgnoreCase(buscar)){
                contador++;
            }
        }
        System.out.println(contador);
    }
}
