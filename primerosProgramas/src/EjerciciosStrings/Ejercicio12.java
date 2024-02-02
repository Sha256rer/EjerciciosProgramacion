package EjerciciosStrings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio12 {
    public static void main(String[] args) {
        String frase;
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce una frase: ");
        frase = scanner.nextLine();
        StringTokenizer trocear = new StringTokenizer(frase);
        StringBuilder sb  = new StringBuilder();
        while (trocear.hasMoreTokens()){
            String curr = trocear.nextToken();
            System.out.println(curr);
            if(curr.length()>2){
                sb.append(curr); // no podemos poner otra vez el next token aqui pq intentará coger el siguiente cuando no hay más IMPORTANTE
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}
