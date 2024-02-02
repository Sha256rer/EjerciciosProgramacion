package EjerciciosHojaBucles;

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introcue un numero");
        int numero = scanner.nextInt();
        for (int i = 1; i <=numero; i++) {
            System.out.printf("\n");
            for (int k = numero; k>=i ; k--) {
                System.out.print("  ");
            }
            for (int j = 1; j <i ; j++) {
                System.out.print(j);
                System.out.print(" ");
            }
            for (int j = i; j >0 ; j--) {
                System.out.print(j);
                System.out.print(" ");

                }
            }

    }


    }

