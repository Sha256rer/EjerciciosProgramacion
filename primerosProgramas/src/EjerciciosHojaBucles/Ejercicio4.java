package EjerciciosHojaBucles;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salida = false;
        int numero, numeroant;
        System.out.println("Introduce un numero");
        numero = scanner.nextInt();
        numeroant = numero;
        //esta técnica se llama lectura anticipada, introducir el primer tecleado directamente en el anterior
        //para no darle un valor arbitrario.
        while (numero > 0) {
            System.out.println("Introduce un numero");
            numero = scanner.nextInt();
            if (numero == numeroant) {
                salida = true;
            }
            numeroant = numero;
        }
        System.out.println(salida);
        //No es necesario añadir control de vuelta final x si se introduce un numero negativo ya que el programa solo cuenta repeticiones


    }
}

