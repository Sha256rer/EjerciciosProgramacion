package EstructurasControl;
import java.util.Scanner;
public class Pedir5Numeros {
    public static void main(String[] args) {
        int numero;
        int acumulador = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<5;i++){
            numero = Integer.valueOf(scanner.nextLine());
            acumulador +=numero;
        }
    }
}
