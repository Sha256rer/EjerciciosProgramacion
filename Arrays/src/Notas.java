import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.function.ToDoubleFunction;
import java.util.stream.DoubleStream;

public class Notas {
    public static void main(String[] args) {
        int[] notas = {8,6,10,3,5,7};
        int index = 0;
        String[] modulos = {"LM", "ING", "PROG", "BDD", "FOL", "SISI"};
        System.out.println("APROBADOS");
        for (int nota:notas){
            if (nota>=5){
                System.out.print(modulos[index]+ " ");
            }
            index++;
        }
        System.out.println();
        System.out.println("MODULO FAVORITO");
        int maxima = notas[0];
        int posicion = 0;
        for (int i = 1; i < notas.length ; i++) {
            if(notas[i]>maxima){
                maxima = notas[i];
                posicion = i;
            }
        }
        System.out.println(modulos[posicion] +  " Nota: " + maxima);
        OptionalDouble average = Arrays.stream(notas).average();
        double media = average.getAsDouble();
        for (int i = 0; i <notas.length ; i++) {
            if(notas[i]>media){
                System.out.print(modulos[i]+ " " + notas[i]+ " ");
            }
        }

    }
}

