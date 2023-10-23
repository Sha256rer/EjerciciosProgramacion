package EjerciciosHojaBucles;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1 = Integer.valueOf(scanner.nextLine());
        int numero2 = Integer.valueOf(scanner.nextLine());
        int control = numero1;
        int control2 = numero2;
        boolean flag = true;
        numero1 = Math.max(numero1, numero2);
        numero2 = Math.min(control, control2);
        for (int i = 2; i <=numero2 ; i++) {
            if(numero2%i==0){
                if(numero1%i != 0){
                    continue;
                }
                System.out.println(numero1+" " +numero1%i);
                numero1 = numero1/i;
                numero2 = numero2/i;
                flag = false;
            }

        }
        System.out.println(flag);
        int resultado;
        if(!flag){
            resultado =  control * numero1;
        }
        else{
            resultado = control2*control;
        }
        System.out.println(resultado);
        //dividir el numero mayor entre todos los divisores del menor
        // si no hay ninguna division con resto 0 (multiplo) el mcm es num1*num2
        //si las hay, multiplicaremos el segundo número por lo que quede del primero después de la división
/*
        int control = numero2;
        int multiplicador = 1;
        for (int i = numero1-1; i>1 ; i--) {
            boolean numeromayor = true;
            if(numero1%i== 0){ //Saca primer divisor del primer numero
                numero1 = numero1/i;
                System.out.println(i + " NUM MAIN");
                for (int j = numero2-1; j >1 ; j--) { //Este bucle sirve para comparar el primer divisor del 1 numero con todos los del segundo
                    if (numero2%j == 0){ //Saca divisor del segundo numero
                        numero2 = numero2/j;
                        System.out.println(j%i);
                         if(j>i && j%i == 0 || i == j){
                             // Si se da esta condición quiere decir que uno de los divisores del primer número es igual al del segundo
                             // o que es un múltiplo mayor suyo. Esto nos permite hacer que no se multipliquen en el mcm
                             //El método solo pillara los números unicos del numero1 que no tengan múltiplos o iguales en el dos
                             //para posteriormente multiplicar por el número 2 de golpe y sacar el mcm
                             System.out.println(j);
                             numeromayor = false;
                            continue;
                        }

                    }
                }
                if(numeromayor){
                    multiplicador *= i;
                }
                numero2 = control;

            }

        }
        multiplicador = multiplicador*numero2;
        System.out.println(multiplicador);*/
    }
}

//no funciona puesto que hay un problema en la descomposición de foactores.