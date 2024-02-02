package org.example;

public class LineaFactura {
    int codigo;
    double precio;
    int cantidad;
    public LineaFactura(int codigo,float precio, int cantidad){
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public LineaFactura(Producto pr, int cantidad) throws Exception {
        this.codigo = pr.getCodigo();
        this.precio = pr.getPrecio();
        if (cantidad<=pr.getCantidad()) {
            this.cantidad = cantidad;
        }
        else{
            throw new Exception("No hay más stock");
        }
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
