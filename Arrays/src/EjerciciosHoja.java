import java.util.Arrays;

public class EjerciciosHoja {
    public void Ejercicio6() {
        int[][] a = new int [3][3];
        int[] b = new int [3];
        int[] c = new int [3];
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                a[i][j] = (int) (Math.random() *50);
            }
        }
        for (int[] is :a){
            System.out.println(Arrays.toString(is));
        }
        int sumafilas = 0;
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                sumafilas = a[i][j];
            }
            b[i] = sumafilas;
            sumafilas = 0;
        }
        int sumacolumnas = 0;
        for (int j = 0; j <a[0].length ; j++) {
            for (int i = 0; i <a.length; i++) {
               sumacolumnas += a[i][j];
            }
            b[j] = sumacolumnas;
            sumacolumnas = 0;
        }

    }
    public void Ejercicio7(){
        boolean magico = true;
        int[][] a = new int [5][5];
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                a[i][j] = 100;
            }
        }

      int sumafila = 0;
        int fila1 = 0;
        for (int i = 0; i <a.length ; i++) {
            for (int j = 0; j <a[i].length ; j++) {
                sumafila+=a[i][j];

            }
            if(i == 0){
                fila1 = sumafila;
            }
            if (fila1 != sumafila){
                System.out.println(fila1);
                magico = false;

            }
            sumafila = 0;


        }
        int sumacolumna = 0;
        int columna1 = 0;
        for (int j = 0; j <a[0].length ; j++) {
            for (int i = 0; i <a.length; i++) {
            sumacolumna += a[i][j];
            }
            if(j == 0){
                columna1 = sumacolumna;
            }
            if (columna1 != sumacolumna){
                magico = false;
            }
            sumacolumna = 0;
        }
        int n = 0;
        int diagonal = 0;
        int diagonal2 = 0;
        for (int i = 0; i <a.length ; i++) {
            diagonal += a[i][n];
            n++;
        }
        n = 4;
        for (int i = 0; i <a.length ; i++) {
            diagonal2 += a[i][n];
            n--;
        }
        if (diagonal2!=diagonal||diagonal!=fila1||diagonal2!=columna1){
            magico = false;
        }
        System.out.println(magico);

    }
    public void Ejercicio8(){
        int[] a = new int[5];
        int[] b = new int[5];
        int[]c;
        for (int i = 0; i <a.length ; i++) {
                a[i] = (int) (Math.random() *50);
                b[i] = (int) (Math.random() *50);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        c= Arrays.copyOf(a, a.length+b.length);
        System.out.println(Arrays.toString(c));
        int n = a.length;
        for (int i = 0; i <b.length ; i++) {
            c[n] = b[i];
            n++;
        }
        System.out.println(Arrays.toString(c));
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));

    }

    public void Ejercicio9() {
        boolean cua = false;
        int n = 0;
        int[][] array = new int [5][5];
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (n>=4){
                    cua = true;
                }
                if (cua){
                    array[i][j] = n;
                    n--;

                }
                else{
                    array[i][j] = n;
                    n++;
                }

            }
            cua = false;
            n = i+1;
        }
        System.out.println(Arrays.toString(array[4]));
    }

    public static void main(String[] args) {
        EjerciciosHoja ej = new EjerciciosHoja();

        ej.Ejercicio9();
    }

    }

