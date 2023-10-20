package EjerciciosHojaBucles;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introcue un numero");
        int numero = scanner.nextInt();
          for (int i = 0; i <=numero; i++) {
            System.out.printf("\n");
              for (int j = 0; j <=i ; j++) {
                  System.out.print(" "+j);
              }

        }
    }
}

/*     for (int i = 0; i <=numero; i+=2) {
             System.out.printf("\n");
             for (int k = numero; k>=i ; k-=2) {
             System.out.print(" ");
             }
             for (int j = 0; j <=i ; j++) {
             System.out.print(j);
             }*/
