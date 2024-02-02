package EjerciciosHojaBucles;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1 = Integer.valueOf(scanner.nextLine());
        int numero2 = Integer.valueOf(scanner.nextLine());
        int factor = 2;
        int mcm = 1;
        while(numero1!=1 && numero2!= 1){
            if(numero1%factor == 0 || numero2%factor == 0){
                if(numero1%factor==0){
                    numero1 = numero1/2;
                }
                else if(numero2%factor==0){
                    numero2 = numero2/2;
                }
                mcm *= factor;
                System.out.println(mcm);
            }
            else {
                factor++;
            }

        }
        
        /*int control = numero1;
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
        System.out.println(resultado);*/
        //dividir el numero mayor entre todos los divisores del menor
        // si no hay ninguna division con resto 0 (multiplo) el mcm es num1*num2
        //si las hay, multiplicaremos el segundo número por lo que quede del primero después de la división

    }
}

//no funciona puesto que hay un problema en la descomposición de foactores.