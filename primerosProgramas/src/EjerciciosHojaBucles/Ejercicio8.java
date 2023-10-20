package EjerciciosHojaBucles;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = Integer.valueOf(scanner.nextLine());
        int divisor;
        for (int i = 2; i <=numero ; i++) {
            if(numero%i==0) {
                divisor = i;
                System.out.println(divisor);
                numero = numero / i;
                i = 2;
            }
        }
    }
}
