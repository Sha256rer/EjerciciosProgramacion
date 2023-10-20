package EjerciciosHojaBucles;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero = Integer.valueOf(scan.nextLine());
        int fibo=0, fibo2=1,fibo3;

        for (int i = 0; i <numero ; i++) {

            fibo3= fibo+fibo2;
            System.out.print(fibo+" ");
            fibo = fibo2;
            fibo2 = fibo3;
        }
        //Inspirada por internet. Se introduce una tercera variable, que resulta en la suma de fibo1 + fibo2. fibo1 se convierte en fibo2
        //fibo2 se convierte en fibo3. f1-> 0 f2->1 f3-> 0+1 | f1->1 f2->1 f3-> 1+1 | f1->1 f2->2 f3->1+2


        /*for (int i = 0; i <=numero ; i++) {
            System.out.print(fibouno+" "+fibo2+" ");
            fibouno = fibouno + fibo2;
            fibo2 = fibouno +fibo2;
            Mi solucion original-> trabaja con 2 variables output. Empiezan en 0 y 1. Se va realizando var1 = var1 + var2
            Luego realiza la misma operación con el nuevo var1. var2 = var1 +var 2.
            ejemplo: var1-> 0 + 1. var1 = 1. var2 = 1 + 1 = 2. var 1-> 1+ 1 = 2. var2-> 2+ 1-> 3.
        }*/
    }
}
