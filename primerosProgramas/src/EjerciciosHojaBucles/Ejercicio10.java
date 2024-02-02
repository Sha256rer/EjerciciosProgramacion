package EjerciciosHojaBucles;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int decenas, centenas, unidades, suma;
        for(int i=numero; i<1000; i++){
            unidades = i%10;
            decenas = (i/10)%10;
            centenas = i/100;
            suma = (int)(Math.pow(unidades, 3) + Math.pow(decenas, 3) + Math.pow(centenas, 3));
           if(i == suma){
               System.out.println(i);
           }
        }
    }
}

