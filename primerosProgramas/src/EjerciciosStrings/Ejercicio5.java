package EjerciciosStrings;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero;
        int partent;
        numero = scanner.nextDouble();
        String numeroS;
        String parteD;
        int lastindex = 0 ;
        numeroS = String.valueOf(numero);
        parteD = numeroS.substring(numeroS.indexOf("."));// para coger el caracter posterior a la coma y no la coma
        numeroS = numeroS.replace(parteD, "");
        System.out.println(numeroS);
        partent = Integer.valueOf(numeroS);
        numeroS= String.format("%,d", partent).replace('.', ',');
        for (int i = 0; i <parteD.length() ; i++) {
            char curr = parteD.charAt(i);
            if (curr != '0'){
                lastindex = i;
            }
            else{
                continue;
            }
        }
        StringBuilder sb = new StringBuilder(parteD);
        parteD = sb.delete(lastindex+1, sb.length()).toString(); //
        if (parteD.equals(".")){
            numeroS = numeroS.substring(0 ,numeroS.length());

        }
        else {
            numeroS = numeroS.concat(parteD);

        }
        System.out.println(numeroS);

    }
}
