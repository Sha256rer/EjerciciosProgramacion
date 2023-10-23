public class Matriz
{
    public static void main(String[] args) {
        int[][] notas =
                {{1, 2, 3, 5, 6, 7, 8},
                {1, 2, 3, 5, 6, 7, 8},
                {1, 2, 3, 5, 6, 7, 8}};
        String[] ev = {"1º EV", "2º EV", "3ºEV"};
        String[] modulos = {"LM", "ING", "PROG", "BDD", "FOL", "SISI", "RLL"};
        int aprobadas = 0;
        double media = 0;
        double mediaf = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println(ev[i]);
            for (int j = 0; j < notas[i].length; j++) {
                if(notas[i][j]>=5){
                    aprobadas++;
                    System.out.print(modulos[j]+ " ");
                }
                media += notas[i][j];
            }
            System.out.println();
            System.out.println(media/notas[i].length);
            double curr = media / notas[i].length;
            mediaf+= curr;
            media = 0;
        }
        System.out.println("Aprobadas en total: "+ aprobadas);
        media = 0;
        int pos = 0;
        double mejor = 0;
        for (int j = 0; j < notas[0].length ; j++) {
            for (int i = 0; i < notas.length ; i++) {
                media += notas[i][j];
            }
            if(media/notas.length>mejor){
            mejor = media/notas.length;
            pos = j;
            }
            System.out.println(modulos[j]+" " + media/ notas.length);
            media = 0;
        }
        System.out.println(mejor);
        System.out.println("aprobadas");
        aprobadas = 0;
        for (int j = 0; j < notas[0].length ; j++) {
            for (int i = 0; i < notas.length ; i++) {
                if(notas[i][j]>=5){
                    aprobadas++;
                }

            }
            System.out.println(aprobadas);
            if (aprobadas== 0){
                System.out.println(modulos[j]+ " aprobado");
            }
            else{
                System.out.println(modulos[j]+ " suspenso");
            }
            aprobadas = 0;
        }
    }



}
