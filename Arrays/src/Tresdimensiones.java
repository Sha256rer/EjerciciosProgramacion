public class Tresdimensiones {
    public static void main(String[] args) {
        int[][][]  datos =
                {{{90, 52}, {42, 46}, {56, 38}, {35, 51}},
                        {{27,62},{40,17},{32, 56}, {11, 51}},
                        {{47,62},{40,17},{72, 56}, {33, 11}},
                        {{77,42},{42,17},{32, 56}, {41, 51}},
                        {{37,22},{40,17},{52, 56}, {95, 22}}};

        String[] grados = {"Derecho", "Informatica", "Magisterio","Fisica", "ADE"};
        String[] años = {"Primero", "Segundo", "Tercero","Cuarto"};
        String[] sexo = {"Mujer", "Hombre"};
        int suma = 0;
        int sumacurso = 0;
        System.out.println(datos[0].length);
        for (int i = 0; i <datos.length ; i++) {
            for (int j = 0; j < datos[i].length ; j++) {
                for (int k = 0; k <datos[i][j].length ; k++) {
                    suma += datos[i][j][k];
                }
            }
        }
        for (int j = 0; j <datos[0].length ; j++) {
            for (int i = 0; i < datos.length ; i++) {
                for (int k = 0; k <datos[i][j].length ; k++) {
                    sumacurso += datos[i][j][k];
                }
            }
            System.out.println(años[j]+" tiene: "+ sumacurso);
            sumacurso = 0;
        }
       int sumasexo = 0;
        for (int k = 0; k <datos[0][0].length ; k++) {
            for (int i = 0; i < datos.length ; i++) {
                for (int j = 0; j <datos[i].length ; j++) {
                    sumasexo += datos[i][j][k];
                }
            }
            System.out.println(sexo[k]+" tiene: "+ sumasexo);
            sumasexo = 0;
        }
        suma = 0;
        for (int i = 0; i <datos.length ; i++) {
            System.out.println(grados[i] +": " );
            for (int j = 0; j < datos[i].length ; j++) {
                for (int k = 0; k <datos[i][j].length ; k++) {
                    suma += datos[i][j][k];
                }
                System.out.println(años[j]+ ": " + suma);
                suma = 0;
            }
        }

        int diferencia = 0;
        int diferenciaant = 0;
        int diferenciamax = 0;
        for (int i = 0; i <datos.length ; i++) {
            for (int j = 0; j < datos[i].length ; j++) {
                    diferencia =  datos[i][j][0]-datos[i][j][1];
                    System.out.println(Math.abs(diferencia));
                }
                // Mucho más simple que el mio. Como la 3 dimensión solo tiene dos utilizamos los ínidces directamente
                // sin crear un tercer bucle. No es escalable a diferentes arrays tho.
                if(Math.abs(diferencia)>diferenciamax){
                    diferenciamax = diferencia;
                }
            }
        System.out.println(Math.abs(diferenciamax));
    }
    }

