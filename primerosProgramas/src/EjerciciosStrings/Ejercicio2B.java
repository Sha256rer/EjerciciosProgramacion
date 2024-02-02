package EjerciciosStrings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String separador = ",. ";
        String frase = scanner.nextLine();
        StringTokenizer trocear = new StringTokenizer(frase, separador);
        System.out.println(trocear.countTokens());
    }
}
