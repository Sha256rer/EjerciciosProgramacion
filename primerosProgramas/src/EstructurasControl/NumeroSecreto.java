package EstructurasControl;

import java.util.Scanner;

public class NumeroSecreto
{
    public static void main(String[] args) {
        int secreto = (int)(Math.random()*100);
        Scanner scanner = new Scanner(System.in);
        int i, contador=0;
        do {
            i = Integer.valueOf(scanner.nextLine());
            if(i>secreto){
                System.out.println("El número es más pequeño");
            }
            else{
                System.out.println("El número es mayor");
            }
            contador++;
        }while(i!=secreto && contador<10);
        if(secreto==i) {System.out.println("El n secreto es " + i);}
        else{
            System.out.println("Has fallado");
        }
        System.out.println("Has necesitado "+contador+" intentos");
        }

    }
