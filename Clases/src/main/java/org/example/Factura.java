package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Factura {
    ArrayList<LineaFactura> factura;
    int numerofactura;
    LocalDate fecha;
    boolean pagada;

    public Factura(int numerofactura, LocalDate fecha, boolean pagada) {
        this.numerofactura = numerofactura;
        this.fecha = fecha;
        this.pagada = pagada;
        this.factura = new ArrayList<LineaFactura>();
    }

    public LineaFactura getLinea(int codigo) throws Exception{
        for (LineaFactura ln:factura) {
            if(codigo==ln.getCodigo()){
                return ln;
            }
        }
        throw new Exception("MECCCC");
    }

    public void setLinea(LineaFactura ln) {
       this.factura.add(ln);
    }

    public int getNumerofactura() {
        return numerofactura;
    }

    public void setNumerofactura(int numerofactura) {
        this.numerofactura = numerofactura;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }
}
