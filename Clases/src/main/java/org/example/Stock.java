package org.example;

import java.util.ArrayList;

public class Stock {
    ArrayList<Producto> productos;
    public Stock(){
    this.productos = new ArrayList<Producto>();
    }
    public void addProducto(Producto pr){
        this.productos.add(pr);
    }
    public void delProducto(Producto pr){
        this.productos.remove(pr);
    }
    public Producto searchProducto(int codigo){
        Producto ret = null;
        for (Producto pr: productos) {
          if( pr.getCodigo()==codigo){
              ret=pr;
          }
        }
        return ret;
    }
    public ArrayList ProductosAgotados(){
        ArrayList<Producto> agotados = new ArrayList<>();
        for (Producto pr: productos) {
            if(pr.getCantidad()==0){
                agotados.add(pr);
            }
        }
        return agotados;
    }
    public ArrayList BajoMinimos(){
        ArrayList<Producto> bajomin = new ArrayList<>();
        for (Producto pr: productos) {
            if(pr.getCantidad()<pr.getMinimo()){
                bajomin.add(pr);
            }
        }
        return bajomin;
    }
    public ArrayList<Producto> getStock(){
        return this.productos;
    }


}
