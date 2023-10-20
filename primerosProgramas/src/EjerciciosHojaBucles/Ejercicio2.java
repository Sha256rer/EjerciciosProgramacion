package EjerciciosHojaBucles;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int contador3=0;
        int contador5=0;
        int contadornada=0;
        for (int i=0; i<5; i++){
            numero = scanner.nextInt();
         /*   if(numero%5!=0&&numero%3!=0){
                contadornada++;
            }
            if(numero%3==0){
                contador3++;
            }
            if(numero%5==0){
                contador5++;
            }*/
            if(numero%5==0){
                contador5++;
                if(numero%3==0){
                    contador3++;
                }
            }
           else if(numero%3==0){
                contador3++;
                if(numero%5==0){
                    contador5++;
                }
            }
            else{
                contadornada++;
            }

        }
        System.out.println(contador3+" Múltiplos de 3");
        System.out.println(contador5+" Múltiplos de 5");
        System.out.println(contadornada+" Múltiplos de nada");

    }
}
