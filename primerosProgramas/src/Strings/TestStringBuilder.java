package Strings;
public class TestStringBuilder {
    public static void main(String[] args) {
        String s= "Hola que tal";
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Hola");
        StringBuilder sb3 = new StringBuilder(500);
        StringBuilder sb4 = new StringBuilder(s);
        System.out.println(sb1.capacity());
        System.out.println(sb2.capacity());
        System.out.println(sb3.capacity());
        System.out.println(sb4.capacity());
        String s1 = "Hola";
        String s2 = " que tal";
        s1 = s1.concat(s2);
        System.out.println("Sustituye string 1 por string 1 y concatenación con s2 "+ s1);
        sb1 = new StringBuilder("Hola");
        sb2 = new StringBuilder(" que tal");
        sb1.append(sb2);
        System.out.println("Expande el s1, no crea un nuevo string con una nueva dir de memoria bajo el mismo nombre  "+sb1);

    }
}
