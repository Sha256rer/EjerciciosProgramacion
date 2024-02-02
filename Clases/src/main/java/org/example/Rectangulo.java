package org.example;

public class Rectangulo {
    int altura;
    int anchura;
    public Rectangulo(int altura, int anchura){
        altura = altura>0 ? this.altura= altura : 5;
        anchura = anchura>0 ? this.anchura= anchura : 5;
    }
    public Rectangulo(){
        this.altura = 5;
        this.anchura = 5;
    }

    public int getAltura() {
        return altura;
    }

    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        if (anchura>0){
            this.anchura = anchura;
        }
        else {
            System.out.println("ERROR");
        }
    }

    public void setAltura(int altura) {
        if (altura>0){
        this.altura = altura;
        }
        else {
            System.out.println("ERROR");
        }
    }
    public int area(){
        return altura*anchura;
    }
    public int perimtro(){
        return (anchura*2+altura*2);
    }
    public void vertical(){
        if(altura==anchura){
            System.out.println("Es un cuadrado");
        }
        else {
            boolean orientacion = altura > anchura ? true : false;
        }
    }
    public void display(){
        System.out.println(altura);
        System.out.println(anchura);
    }
    public String dibujar(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <altura ; i++) {
            sb.append("\n");
            for (int j = 0; j <anchura ; j++) {
                sb.append("*");
            }
        }
        return sb.toString();
    }
}
