/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Adicional;
import Entidades.Producto;
import java.util.ArrayList;

/**
 *
 * @author Emanuel Álvarez, Brian Hortua, Andrés Mora, Thomas Rivera
 */
public class GestionProducto {

    //CONSTRUCTORES
    public GestionProducto() {
    }
    public ArrayList<Producto> crearProductos(){
        ArrayList<Producto> creada=new ArrayList<>();
        //EJEMPLO PARA CREAR PRODUCTOS, COMO PUEDEN VER SE CREAN 3 OBSEQUIOS Y 3 ADICIONES
        ArrayList<Producto> p=new ArrayList<>();
        ArrayList<Adicional> a=new ArrayList<>();
        Producto o1=new Producto("301",24,0);
        Producto o2=new Producto("302",24,0);
        Producto o3=new Producto("303",24,0);
        Adicional a1=new Adicional("Azucar",100);
        Adicional a2=new Adicional("Chocolate",500);
        Adicional a3=new Adicional("Leche",1000);
        p.add(o1);
        p.add(o2);
        p.add(o3);
        Producto p1=new Producto();
        p1.setObsequios(p);
        a.add(a1);
        a.add(a2);
        a.add(a3);
        p1.setAdicionalesProducto(a);
        creada.add(p1);
        return creada;
    }
}
