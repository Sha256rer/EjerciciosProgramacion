package EjerciciosStrings;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String texto = scanner.nextLine();
        StringTokenizer trocear = new StringTokenizer(texto);
        StringBuilder sb = new StringBuilder("");
        int suma = 0;
        while (trocear.hasMoreTokens()) {
            String numerico =  trocear.nextToken();
            for (int i = 0; i <numerico.length() ; i++) {
                char temp = numerico.charAt(i);
                if(Character.isDigit(temp)){
                    sb.append(temp);
                    if(i<numerico.length()-1&&!Character.isDigit(numerico.charAt(i+1))){
                        sb.append(" ");
                    }
                }

            }
            System.out.println(sb);
            if(sb.indexOf(" ")!= -1){
                StringTokenizer trocear2 = new StringTokenizer(sb.toString());
                while (trocear2.hasMoreTokens()){
                    suma += Integer.valueOf(trocear2.nextToken());
                }
                sb = new StringBuilder();
            }
            else if(sb.indexOf("1") != -1){
                System.out.println("test");
                suma += Integer.valueOf(sb.toString());
                sb = new StringBuilder();
            }
            else {
                System.out.println(sb);
                sb = new StringBuilder();
            }
        }
        System.out.println(sb);
        System.out.println(suma);

    }
}
