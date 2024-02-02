package Strings;

public class PruebaVelocidad {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        String s = "s";
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i <100000 ; i++) {
            s = s.concat("Lunes");
        }
        long fin = System.currentTimeMillis();
        System.out.println("tiempo de string: " + (fin-inicio));
        inicio = System.currentTimeMillis();
        for(int i = 0; i<100000; i++){
            sb.append("Lunes");
        }
        fin = System.currentTimeMillis();
        System.out.println("tiempo de string: " + (fin-inicio));
        // String builder crea un hueco en memoria para el string
        //String crea un hueco en memoria con los espacios justos del string que hemos escrito
        //si añadimos o quitamos algo de un string se buscará una nueva dirección de memoria y se
        //creará el espacio de la cantidad de caracteres que tenga el string
        //con string builder simplemente se amplía el espacio
    }
}
