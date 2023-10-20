package EstructurasControl;

import java.util.Scanner;

public class Ejerciciorepeticion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        while(numero%11!=0){
            numero = scanner.nextInt();
        }
    }
}
// Si un un numero /11 tiene resto 0 sus cifras siempre serán repetidas siempre que sean números de dos cifraas.