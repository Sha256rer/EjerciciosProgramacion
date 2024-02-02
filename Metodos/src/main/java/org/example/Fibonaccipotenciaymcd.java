package org.example;

import javax.lang.model.type.ErrorType;
import java.util.StringTokenizer;

public class Fibonaccipotenciaymcd {
    public static void main(String[] args) {
       /* for (int i = 1  ; i <15 ; i++) {
            System.out.println(Fibonacci(i));
            System.out.println(Potencia(3,2));

        }*/
        System.out.println(mcd(43,10));
        System.out.println(repiterec("abc",4));
        System.out.println(cifrado("abz"));
        System.out.println(quitafaltas("hola. soy tonto"));
        System.out.println(tipo("planta","agua"));

    }
    public static int Fibonacci(int numero){
        if (numero==1){
            return 0;
        }
        if (numero==2){
            return 1;
        }
        else{
           return Fibonacci(numero-1)+Fibonacci(numero-2);
        }
    }
    public static int Potencia(int base, int exponente){
        if (exponente==0) {
            return 1;
        }
        else {
            return base*Potencia(base, exponente-1);
        }
    }
    public static int mcd(int num1, int num2){
        int max = Math.max(num1,num2);
        int min = Math.min(num1,num2);
        if (max==min){
            return max;
        }
        else{
           return mcd(max-min, min);
        }

    }
    public static double redondear(double numero, int decimales){
      int parteent =   (int)numero;
      double parted = (numero/(float)parteent);
        System.out.println(parted);
      double cifrafinal = parted*(10*(decimales-1));
        System.out.println(cifrafinal);
      double cifrafinal2 = cifrafinal-(int)cifrafinal;
      if(cifrafinal2>=0.5){
          cifrafinal = cifrafinal+1;
      }

      parted = cifrafinal/(10*(decimales-1));
      System.out.println(parted);
      return parteent+parted;
    }
    public static String repite(String frase, int numero){
        String frase2 = frase;
        for (int i = 1; i <numero ; i++) {
            frase = frase+frase2;
        }
        return frase;
    }
    public static String repiterec(String frase, int numero){
        if(numero==1){
            return frase;
        }
        else {
           return frase+repiterec(frase, numero-1);
        }
    }
    public static String cifrado(String frase){
        StringBuilder sr = new StringBuilder();
        int inicial = 95;
        for (int i = 0; i <frase.length(); i++) {
            char curr = frase.charAt(i);
            if (curr>121){
                curr = (char)((curr-28)+2);
            }
            curr +=2;
            sr.append(curr);
        } //faltan las mayusculas y corregir fallos
        return sr.toString();
    }
    public static String quitafaltas(String frase){
        StringTokenizer st = new StringTokenizer(frase, ".");
        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()){
            String curr = st.nextToken();
            curr = Remplazador(curr);
            sb.append(curr+ ".");
        }

        return sb.toString();
    }
    public static int Charcheck(String frase){
        for (int i = 0; i <frase.length(); i++) {
            if (Character.isAlphabetic(frase.charAt(i))&&Character.isLowerCase(frase.charAt(i))){
                return i;
            }
        }
       return 0;
    }
    public static String Remplazador(String curr){
        int number = Charcheck(curr);
        String sr = String.valueOf(curr.charAt(number));
        sr = sr.toUpperCase();
        char ch =  sr.charAt(0);
        curr = curr.replace(curr.charAt(number), ch);

        return curr;
    }
    public static String tipo(String nombre, String contrario){
        double[][] arr= {{1,0.5,2},{2,1,0.5},{0.5,2,1}};
        int currenttipo, currentcontrario;
        currenttipo= 0;
        currentcontrario = 0;
        String[] nombres = {"fuego", "agua", "planta"};
        for (int i = 0; i < 2 ; i++) {
        for (int j = 0; j < nombres.length ; j++) {
            if(nombre.equalsIgnoreCase(nombres[j])&&i==0){
            currenttipo = j;
            }
            if(contrario.equalsIgnoreCase(nombres[j])&&i==1){
            currentcontrario = j;
                System.out.println(j);
            }
        }
        }
        return nombres[currenttipo]+ " hace el siguiente daño a "+ nombres[currentcontrario]+ " " +arr[currenttipo][currentcontrario];
    }

}
