package EjerciciosStrings;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {
        String frase;
        String endresult;
        int iniciocurrent;
        Scanner scanner = new Scanner(System.in);
        frase = scanner.nextLine();
        frase = frase.concat(" ");
        StringBuilder sb = new StringBuilder(frase);
        int maslargo = sb.substring(0, frase.indexOf(" ")).length();
        endresult =  sb.substring(0, frase.indexOf(" "));
        iniciocurrent = sb.indexOf(" ");
        sb.delete(sb.indexOf(" "),sb.indexOf(" ")+1);
       while (sb.indexOf(" ") != -1){
           String current = sb.substring(iniciocurrent, sb.indexOf(" "));
           System.out.println(iniciocurrent + " " + sb.indexOf(" ")+ " " +current.length());
           if (current.length()>maslargo){
               endresult = current;
               maslargo =current.length();
           }
           iniciocurrent = sb.indexOf(" ");
           sb.delete(sb.indexOf(" "),sb.indexOf(" ")+1);
       }
        System.out.println(endresult);

        }


    }
    /*
    /versión ultra cutre. Introduces una frase y le une un espacio al final
    el programa coge la primera palabra como más larga y su longitud como mas larga por defecto
    borra el primer espacio y entre en el bucle. Compreuba si la siguiente palabra es más larga que
    la anterior. Si no lo es marca el inicio de la siguiente palabra en el index del espacio en ee que finaliza el
    substring current y posteriormente lo borra para poder encontrar el siguiente. 
     */

