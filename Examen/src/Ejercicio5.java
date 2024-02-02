import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int contador = 0;
    System.out.println("Introduce una frase:");
    String frase = scanner.nextLine();
    String vocales = "aeiou";
    StringTokenizer trocear = new StringTokenizer(frase);
    StringBuilder sb = new StringBuilder();
    //creo un string vocales con todo en minuscula, un tokenizer para dividir la frase
        // un stringbuilder para la nueva frase y un contador para contar las repetiiones de vocales
    while(trocear.hasMoreTokens()){
        String current = trocear.nextToken();
        String currentcopia = current;
        current = current.toLowerCase();
        for (int i = 0; i <current.length() ; i++) {
         if(vocales.indexOf(current.charAt(i))!= -1){
             contador++;
             vocales = vocales.replace(current.charAt(i), ' ');
         }
         //Leo caracter a caracter y compruebo si es una vocal, habiendo pasado la palabra a todo minusculas
            //si lo es elimino la vocal de mi string vocales para que no se vuelva a comprobar. Aumento un contador
        }
        if (contador>=3){
            sb.append(currentcopia);
            sb.append(" ");
        }
        //como el contador comprueba vocales no repetidas, si es mayor o igual que 3 habrá 3 vocales no repetidas
        //uno la palabra y un espacio al nuevo String, teniendo en cuenta añadir la palabra con su capitalizacion original
        vocales = "aeiou";
        contador = 0;
    }
        System.out.println("Resultado(Palabras con mas de 3 vocales distintas): " + sb);
    }
}
