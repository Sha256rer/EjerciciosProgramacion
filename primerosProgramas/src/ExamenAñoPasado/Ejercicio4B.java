package ExamenAñoPasado;

import java.util.Scanner;

public class Ejercicio4B {
    public static void main(String[] args) {
        int numero, anterior, cifra;
        boolean ordenado = true;
        Scanner scanner = new Scanner(System.in);
        numero = scanner.nextInt();
        anterior = numero % 10;
        numero /=10;
        while (ordenado == true) {
        cifra = numero % 10;
        numero /= 10;
        if(cifra>anterior){
            ordenado = false;
        }
        anterior = cifra;
        }
    }
}


