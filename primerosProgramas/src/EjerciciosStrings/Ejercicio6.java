package EjerciciosStrings;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        String palabra;
        Scanner scanner = new Scanner(System.in);
        palabra = scanner.nextLine();
        StringBuilder sb1 = new StringBuilder(palabra);
        if(sb1.toString().equals(sb1.reverse().toString())){
            System.out.println("Es palindromo");
        }
        else{
            System.out.println("no");
        }
    }
}
