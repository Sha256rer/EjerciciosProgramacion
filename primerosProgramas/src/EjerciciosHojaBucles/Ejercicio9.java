package EjerciciosHojaBucles;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int control = numero;
        int contador = 0;
        boolean flag = false;
        while (numero>1) {
                //System.out.print(numero % 2);
                numero = numero / 2;
                contador++;
        }
    numero = control;

        while (contador>0) {
            for (int i = contador-1; i>0 ; i--) {
                control = control/2;
            }
            if(!flag){
                System.out.print(control/2);
            }
            System.out.print(control%2);
            contador--;
            control = numero;
            flag = true;
        }
    }
}

