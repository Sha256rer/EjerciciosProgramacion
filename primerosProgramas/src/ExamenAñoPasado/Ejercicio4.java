package ExamenAñoPasado;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, primernumero,cifraprev,cifracurr;
        numero = scanner.nextInt();
        cifracurr = numero%10;
        numero = numero/10;
        cifraprev = cifracurr;
        if(numero<10&&!(cifracurr > numero)){
           numero = 0;
        }
        while(numero>10) {
            if (numero < 100) {
                primernumero = numero/ 10;
                cifracurr = numero % 10;
                numero = primernumero;
                if (!(cifraprev >= cifracurr) || !(cifracurr >= primernumero)) {
                    numero = 0;
                    System.out.println("test");
                }
            } else {
                cifracurr = numero % 10;
                numero = numero / 10;
                if (!(cifraprev >= cifracurr)) {
                    numero = 0;
                }
                cifraprev = cifracurr;
            }
        }
        System.out.println(numero);
        if (numero == 0) {
            System.out.println("no estan en orden");
        } else {
            System.out.println("Lo estan");
        }
    }
}
