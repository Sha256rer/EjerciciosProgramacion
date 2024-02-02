package EjerciciosStrings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vocales = "aeiouAEIOUáéíóú";
        String frase = scanner.nextLine();
        String remplazo = "";
        for (int i = 0; i <frase.length() ; i++) {
            if(vocales.indexOf(frase.charAt(i)) ==-1){
                char curr = frase.charAt(i);
                remplazo = remplazo.concat(String.valueOf(curr));
            }
        }
        System.out.println(remplazo);
        StringTokenizer trocear = new StringTokenizer(remplazo);
        while (trocear.hasMoreTokens()){
            System.out.print(trocear.nextToken());
            System.out.print(" ");
        }
    }
}
