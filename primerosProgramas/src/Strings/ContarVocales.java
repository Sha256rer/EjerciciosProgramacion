package Strings;

import java.util.Scanner;

public class ContarVocales {
    public static void main(String[] args) {
        String frase;
        int contador = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Frase: ");
        String vocales = "AEIOUaeiouáéíóú";
        frase = scanner.nextLine();
        StringBuilder sb = new StringBuilder(vocales);
        for (int i = 0; i <frase.length() ; i++) {
         /*   String test = String.valueOf(frase.charAt(i));
            switch (test){
                case "a", "e", "i", "o", "u", "A", "E", "I", "O", "U":
                    contador++;
                    break;
                default: break;
            }*/
            if(vocales.indexOf(frase.charAt(i)) != -1){
                contador++;
            }
        }
        System.out.println(contador);
    }
}
