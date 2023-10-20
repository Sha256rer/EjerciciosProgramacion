package EstructurasControl;


import java.util.Scanner;

public class TablaDel7 {
    public static void main(String[] args) {
        int mult;
        for (int i = 0; i <11 ; i++) {
            mult = 7*i;
            System.out.println("7 x "+i+" = "+ mult);

        }
        int mult2;
        Scanner scn = new Scanner(System.in);
        int mult1 = Integer.valueOf(scn.nextLine());
        for (int i = 0; i <11 ; i++) {
            mult2 = mult1*i;
            System.out.println(mult1+" x "+i+" = "+ mult2);

        }
    }
}
