package org.example;

import java.util.ArrayList;

public class CajonFacturas {
    ArrayList<Factura> fac;
    ArrayList<Factura> sincobrar;
    public CajonFacturas(){
        fac = new ArrayList<Factura>();
        sincobrar = new ArrayList<Factura>();
    }
    public void Añadir(Factura fr){
        fac.add(fr);
    }
    public Factura Buscar(int numfac){
        for (Factura curr: fac) {
            if(curr.getNumerofactura()==numfac){
                return curr;
            }
        }
        return null;
    }
    public ArrayList<Factura> FacturasPendienteCobro(){
        for (Factura curr: fac) {
            if(!curr.isPagada()){
                this.sincobrar.add(curr);
            }
        }
        return sincobrar;
    }
}
