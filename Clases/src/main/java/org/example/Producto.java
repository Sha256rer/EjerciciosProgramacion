package org.example;

public class Producto {
    int codigo;
    String descripcion;
    double precio;
    int cantidad;
    int minimo;

    public Producto(int codigo, String descripcion, double precio, int cantidad, int minimo) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.minimo = minimo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getMinimo() {
        return minimo;
    }

    public void setMinimo(int minimo) {
        this.minimo = minimo;
    }
    public String productoCompleto(){
        return getCodigo()+ " "+getDescripcion()+" "+ getCantidad()+" "+getMinimo()+" "+getPrecio()+"$";
    }
}
