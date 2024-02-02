package EjerciciosStrings;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        char letra;
        String palabra;
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce una palabra: ");
        palabra = scanner.nextLine();
        StringBuilder sb  = new StringBuilder();
        for (int i = 0; i <palabra.length() ; i++) {
            sb.append("_");
        }
        System.out.println(sb);
        for (int i = 0; i <7 ; i++) {
            if (palabra.equals(sb.toString())){
                break;
            }
            System.out.println("Introduce una letra: ");
            letra = scanner.next().charAt(0); // pìlla el primer char de lo que introduzcamos
            if(palabra.indexOf(letra) != -1){
                for (int j = 0; j <palabra.length() ; j++) {
                    if(letra==palabra.charAt(j)){
                        System.out.println(j);
                        sb.setCharAt(j, letra);
                        System.out.println(sb);
                    }
                }
            }

        }
    }
}
