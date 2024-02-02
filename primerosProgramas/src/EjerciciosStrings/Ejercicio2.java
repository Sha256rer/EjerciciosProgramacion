package EjerciciosStrings;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1;
        String separador = ",. ";
        String frase = scanner.nextLine();
        for (int i = 0; i <frase.length() ; i++) {
            char curr = frase.charAt(i);
            if(separador.indexOf(curr) != -1){ //problemas con poner coma despues de un espacio,etc
                contador++;
            }
        }
        System.out.println(contador);
    }
}
