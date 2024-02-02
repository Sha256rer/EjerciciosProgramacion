package Strings;

import java.util.Scanner;

public class ContarLetra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 0;
        String letra = scanner.nextLine();
        String frase = scanner.nextLine();
        //Character.isLowerCase(); Saber si una letra es mayuscula o minuscula para contar mayusc y minusc x separado
        letra = letra.toUpperCase();
        frase = frase.toUpperCase(); //guardarlo en la variable para que no se pierda la conversion
        for (int i = 0; i <frase.length() ; i++) {
            if(letra.indexOf(frase.charAt(i)) != -1){
                // tmb es posible frase.charAt(i) == letra
                contador++;
            }
        }
        System.out.println(contador);
    }
}
