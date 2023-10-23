import java.util.ArrayList;
import java.util.Scanner;

public class arraysdinamicos {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        Scanner scn = new Scanner(System.in);
        int numero;
        numero = scn.nextInt();
        a.add(numero);
        while(numero!=0){
            if (!a.contains(numero)){
           a.add(numero);
         }
            numero = scn.nextInt();

        }
        System.out.println(a);
    }
}
