package EjerciciosStrings;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = scanner.nextLine();
        for (int i = 0; i <frase.length() ; i++) {
            int valor;
            char current = frase.charAt(i);
            valor = frase.charAt(i);
            valor += 1;
            frase = frase.replace(current,(char)valor);
        }
        System.out.println(frase);
    }
}
