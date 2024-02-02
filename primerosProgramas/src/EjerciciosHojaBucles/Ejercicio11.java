package EjerciciosHojaBucles;

public class Ejercicio11 {
    public static void main(String[] args) {
      /*  for (int i = 0; i < 5; i++) {
            System.out.printf("\n");
            for (int k = 7; k >= i * 2; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2; j++) {
                if (j == 0) {
                    continue;
                }
                System.out.print("*");
                System.out.print(" ");
            }

            }
        for (int l = 0; l < 3; l++) {
            System.out.printf("\n");
            for(int k = -2; k<l*2; k++){
                System.out.print(" ");
            }

            for (int j = 5; j > l*2 ; j--) {
                System.out.print("*");
                System.out.print(" ");

            }

        }
*/
        for (int i = 1; i <= 7; i+=2) {
            System.out.printf("\n");
            for (int k = 7; k > i ; k-=2) {
                System.out.print(" ");
            }
            for (int j = 0; j < i ; j++) {
                System.out.print("*");
            }

        }
        //printa estrellas siguiendo el patron de aumento del bucle con i
        //1,3,5,7...
        //printa espacios disminuyendo desde 7 a 1 5 a 3
        for (int i = 5; i>0; i -=2){
            System.out.printf("\n");
            for (int k = 7; k > i ; k-=2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
        }
        }
    }



