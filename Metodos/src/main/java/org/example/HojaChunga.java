package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class HojaChunga {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(bidimensional()));
        int[] arr = {1,2,3,4,5,6,7,8,1, 2, 3, 4, 5};
        ArrayList<Double> cartas2 = new ArrayList<Double>();
        for (int i = 0; i <40 ; i++) {
            cartas2.add((double)((int)(Math.random()*7)));
            if (cartas2.get(i)==0){
                cartas2.set(i, 0.5);
            }
        }

        int arr3[][] = {{1,2,3,4},{2,3,5,7},{1,2,4,7},{1,4,5,7}};
        printarr(arr3);
        System.out.println();
        System.out.println();
        diagonal(arr3);
        System.out.println();
        System.out.println(valfasedos("4542RMD"));




     /*   insert2(arr, 5, 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }*/


    }

    public static int[][] bidimensional() {
        int arr[][] = new int[3][5];
        int base = 10;
        for (int i = 0; i < 3; i++) {
            arr[i][0] = base * (i + 1) + 1;
            for (int j = 1; j < 5; j++) {
                arr[i][j] = base * (i + 1) + (j + 1);
            }
        }
        return arr;
    }

    public static int[] insert(int[] array, int valor, int posicion) {
        try {
            array[posicion] = valor;
            return array;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return array;
        }

    }

    public static int[] insert2(int[] array, int valor, int posicion) {
        int valornext = array[posicion];
        array[posicion] = valor;
        valor = valornext;
        for (int i = posicion + 1; i < array.length; i++) {
            valornext = array[i];
            array[i] = valor;
            valor = valornext;
        }
        return array;
    }

    public static ArrayList secuencia(int array[]) {
        int inicial = array[0];
        int size = 1;
        int index = 0;
        int maxsize = 0;
        int maxindex = 0;
        ArrayList retorno = new ArrayList();
        for (int i = 1; i < array.length; i++) {
            if(array[i]>inicial){
                if(size==1){
                    System.out.println(i);
                    index = i-1;
                }
                size++;
                if(size>maxsize){
                    maxsize = size;
                    maxindex = index;
                    System.out.println(index);
                }
            }
            else{
                size = 1;
                index = 0;
            }
            if(i==array.length-1){
                retorno.add(maxindex);
                retorno.add(maxsize);
            }
            inicial = array[i];
        }
        return retorno;
    }
    public static ArrayList<Double> barajar(ArrayList<Double> arr){
        for (int i = 0; i <20 ; i++) {
            int number = (int)(Math.random()*arr.size());
            int number2 = (int)(Math.random()*arr.size());
            if(number != number2) {
                double control = arr.get(number);
                arr.set(number, arr.get(number2));
                arr.set(number2, control);
            }
            else{
                i--;
                continue;
            }
        }
        return arr;
    }
    public static double[] Gameplay(int jugadores, ArrayList<Double> cartas2) {
        double puntuacion[] = new double[jugadores];
        int indice = 0;
        int turno = jugadores;
        while (true) {
            for (int i = 0; i <turno ; i++) {
            puntuacion[i] += cartas2.get(indice);
            cartas2.remove(indice);
            barajar(cartas2);
            if (puntuacion[i]== 7.5) {
                System.out.println("EEEE");
                break;
            }
            if (puntuacion[i] > 7.5) {
                System.out.println("MEEC");
                break;
            }
        i = 0;
        }
            return puntuacion;

    }
    }
    public static boolean Cuadradobig(int[][] arr){
        for (int i = 0; i <arr.length; i++) {
            if (arr.length!= arr[i].length){
                System.out.println("ERROR");
                return false;
            }

        }
        return true;

    }

    public static void diagonal(int[][] arr){
        ArrayList<Integer> copy = new ArrayList<>();
        if(Cuadradobig(arr)) {
            for (int i = 0; i <arr.length; i++) {
              copy.add(arr[i][i]);
            }
            Collections.reverse(copy);
            for (int i = 0; i <arr.length; i++) {
               arr[i][i] = copy.get(i);
            }
            printarr(arr);
        }

    }
    public static void printarr(int[][] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.println();
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j]+ " ");
            }
        }
    }
    public static boolean valfaseuno(String matricula){
        boolean alfanum = true;
        int digitos = 0;
        int letras = 0;
        if(matricula.length()>8||matricula.length()<6){
            return false;
        }
        for (int i = 0; i <matricula.length() ; i++) {
            char curr = (matricula.charAt(i));
            if(Character.isDigit(curr)){
                digitos++;
            }
            if (Character.isAlphabetic(curr)){
                letras++;
            }
        }
        if(digitos!=4||(letras<2||letras>4)){
            return false;
        }
        return true;
    }
    public static boolean valfasedos(String matricula){
        boolean alfanum = true;
        char first = matricula.charAt(0);
        char last = matricula.charAt(matricula.length()-1);
        char second = matricula.charAt(1);
        char secondlast = matricula.charAt(matricula.length()-2);
        if(valfaseuno(matricula)){
        if(Character.isAlphabetic(first)&&Character.isAlphabetic(last)){
            if (matricula.length()==6){
                return true;
            }
            else if(matricula.length()==7&&(Character.isAlphabetic(second)||Character.isAlphabetic(secondlast))){
                return true;
            }

            else if(matricula.length()==8&&(Character.isAlphabetic(second)&&Character.isAlphabetic(secondlast))){
                return true;
            }

            }

        else if(Character.isDigit(first)){
                if(matricula.length()>7){
                    return false;
                }
            for (int i = 0; i <3 ; i++) {
                if(!Character.isDigit(matricula.charAt(i))){
                    return false;
                }
            }
            return true;
            }

        }
            return  false;

    }
}


