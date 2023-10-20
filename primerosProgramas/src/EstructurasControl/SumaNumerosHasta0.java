package EstructurasControl;

import java.util.Scanner;

public class SumaNumerosHasta0 {
    public static void main(String[] args) {
        double numero;
        double acumulador = 0;
        double contador = 0;
        Scanner scanner = new Scanner(System.in);
        do{
            numero = Double.valueOf(scanner.nextLine());
            acumulador += numero;

        }while(numero!=0);
        System.out.println(acumulador);

        do{
            numero = Double.valueOf(scanner.nextLine());
            acumulador += numero;
            /*if (numero!=0){
                contador++;
            }*/
        }while(numero!=0);
        System.out.println(acumulador/(contador-1));
        //Como sabemos que solo entra un 0, restamos 1 para no tenerlo en cuenta en la media
        //Otra opción sería el if de arriba pero es menos eficiente.
    }
}
