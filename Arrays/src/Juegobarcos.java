import com.sun.source.tree.WhileLoopTree;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Juegobarcos {
    public static void main(String[] args) {
        int vidas = 5;
        System.out.println("Introduce altura y anchura");
        Scanner scanner = new Scanner(System.in);
        int alt = Integer.valueOf(scanner.nextLine());
        int anch = Integer.valueOf(scanner.nextLine());
        String [][] tablero = new String [alt][anch];
        int barcos = 0;
        System.out.println("Introduce el numero de barcos");
        int maxbarcos = scanner.nextInt();
        for (int i = 0; i <tablero.length ; i++) {
            for (int j = 0; j <tablero[i].length ; j++) {
                tablero[i][j] = "A";
            }
        }
        while(barcos<maxbarcos) {
            int randalt = (int)((Math.random() * (alt)));
            int randanch = (int)((Math.random() * (anch)));
            tablero[randalt][randanch] = "X";
            barcos++;
        }
        System.out.println(Arrays.deepToString(tablero));

       while (vidas>0&&barcos>0) {
           System.out.println("Di una altura entre 0 y max");
           int alto = scanner.nextInt();
           System.out.println("Di una anchura entre 0 y max");
           int ancho = scanner.nextInt();
           System.out.println(Arrays.deepToString(tablero));
           try {
               tablero[alto][ancho].length();
           }
           catch (Exception e){
               System.out.println("Numero invalido");
               continue;
           }

           if (tablero[alto][ancho].equals("X")) {
               System.out.println("Aciertas");
               tablero[alto][ancho] = "A";
               barcos -= 1;
           } else {
               System.out.println("Error");
               vidas -= 1;
           }
           System.out.println("Quedan: "+ barcos);
           System.out.println("Vidas: "+ vidas);
       }
       if (vidas==0){
           System.out.println("Has perdido");
       }
       else{
           System.out.println("Has ganado");
       }
    }
}
