package Strings;

public class CompararSb {
    public static void main(String[] args) {
        String a = "a";
        String b = "a";
        StringBuilder sb1 = new StringBuilder("a");
        StringBuilder sb2 = new StringBuilder("a");
        if(a.equals(b)){
            System.out.println("Son iguales");
        }
        else{
            System.out.println("No lo son");
        }

        if(sb1.equals(sb2)){
            System.out.println("Son iguales");
        }
        else{
            System.out.println("No lo son");
        }

        if(sb1.toString().equals(sb2.toString())){
            System.out.println("Son iguales");
        }
        else{
            System.out.println("No lo son");
        }
    }
}
