package EjerciciosStrings;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int veces;
        int co = 1;
        String frase;
        StringBuilder reversed = new StringBuilder("");
        System.out.println("String: ");
        frase = scanner.nextLine();
        StringBuilder sb1 = new StringBuilder(frase);
        System.out.println("Cuantas veces?: ");
        veces = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i <veces ; i++) { //veces que muevo una letra para delante
            for (int j = 0; j <sb1.length() ; j++) { //recorre el string para mover las letras
                if(j == (sb1.length()-1)){ //caso ultimo caracter pasando al primero
                    reversed = reversed.insert(0, String.valueOf(sb1.charAt(reversed.length())));
                }
                else { // demás casos
                    reversed = reversed.append(String.valueOf(sb1.charAt(j)));
                }
            }
            frase = reversed.toString();
            sb1 = new StringBuilder(reversed);
            System.out.println(frase);
            reversed = new StringBuilder("");

        }


    }
}
