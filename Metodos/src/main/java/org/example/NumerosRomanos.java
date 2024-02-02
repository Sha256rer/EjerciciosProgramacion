package org.example;

import java.util.Scanner;

public class NumerosRomanos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  numero = scanner.nextInt();
        while (numero<=99&&numero>0){
            System.out.println(romano(numero));
            numero = scanner.nextInt();
        }
    }
    public static String romano(int numero){
        String ret = strdec(decenas(numero))+strud(unidades(numero));
        return ret;
    }
    public static int decenas(int numero){
        return numero/10;
    }
    public static int unidades(int numero){
        return numero%10;
    }
    public static String strud(int numero){
        String[] sr = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        return sr[numero-1];

    }
    public static String strdec(int numero){
        switch (unidades(numero)){
            case 1:
                return "X";
            case 2:
                return "XX";
            case 3:
                return "XXX";
            case 4:
                return "XL";
            case 5:
                return "L";
            case 6:
                return "LX";
            case 7:
                return "LXX";
            case 8:
                return "LXXX";
            case 9:
                return "XC";
            default:
                return "";
        }
    }
}
