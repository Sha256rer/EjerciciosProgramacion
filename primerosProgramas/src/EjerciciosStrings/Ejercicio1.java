package EjerciciosStrings;

import java.lang.module.FindException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        String frase = scanner.nextLine();
        for (int i = 0; i <frase.length() ; i++) {
            char curr = frase.charAt(i);
            if(Character.isLowerCase(curr)){
                contador++;
            }
        }
        frase.toUpperCase();
        System.out.println(contador);
    }
}
