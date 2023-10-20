package EjerciciosHojaBucles;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int ceros = 0;
        int numero;
     /*   while(ceros<5){
        numero = Integer.valueOf(scanner.nextLine());
        if(numero == 0){
                ceros++;
            }
        suma+=numero;
        }*/
    /*    do{
            numero = Integer.valueOf(scanner.nextLine());
            if(numero == 0){
                ceros++;
            }
            suma+=numero;
        }while (ceros<5);*/

        System.out.println(suma);
        //Este progrma solo funciona pq 0 no aumenta la suma. En cualquier otro caso habría que cambiar el método.
    }
}
