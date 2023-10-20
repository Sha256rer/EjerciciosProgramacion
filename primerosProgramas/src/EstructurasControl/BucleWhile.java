package EstructurasControl;

import java.util.Scanner;

public class BucleWhile {
    public static void main(String[] args) {
        int numero;
        Scanner scanner = new Scanner(System.in);
       /* while (numero!=0){
            numero = scanner.nextInt();
        }*/
        do{
            numero = scanner.nextInt();
        }while (numero!=0);
        /*este progrma es interesante,
        puesto que nos enseña la manera de
        hacer un bucle en el que no necesitemos
        inventarnos un valor para el número que queremos pedir por teclado al usuario.
        Un do while nos permite pedir un número al ususario previo a comprobar la condición*/
    }
}
