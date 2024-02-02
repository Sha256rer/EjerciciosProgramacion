package EjerciciosStrings;

import java.util.Scanner;

public class Ejercicio13B {
    public static void main(String[] args) {
        String frase;
        String endresult;
        int lastindex;
        Scanner scanner = new Scanner(System.in);
        frase = scanner.nextLine();
        frase=  frase.concat(" ");
        StringBuilder sb1 = new StringBuilder();
        String first = frase.substring(0,frase.indexOf(" "));
        lastindex = frase.indexOf(" ")+1;
        while ((frase.indexOf(" ",lastindex)!= -1)){
            String current =  frase.substring(lastindex, frase.indexOf(" ",lastindex));
            System.out.println( current+" "+ lastindex);
            if(first.length()<current.length()) {
               first = current;
            }
            lastindex = frase.indexOf(" ", lastindex)+1;
        }

        System.out.println(first);
    }
}
