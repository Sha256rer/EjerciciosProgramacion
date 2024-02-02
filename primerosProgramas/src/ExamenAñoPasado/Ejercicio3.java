package ExamenAñoPasado;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad");
        int edad = scanner.nextInt();
        System.out.println("Porcentaje de pérdida de pelo");
        float porcentaje = scanner.nextFloat();
        float pelototal = 100;

        while(pelototal>5){
            float porcentajeactual;
            porcentajeactual= (pelototal*porcentaje/100);
            pelototal = pelototal- porcentajeactual;
            System.out.println(pelototal);
            edad++;
        }
        System.out.println("Edad "+edad + "Pelo total"+pelototal);
    }
}
