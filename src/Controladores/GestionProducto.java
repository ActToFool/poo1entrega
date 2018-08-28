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
    //CREA LOS PRODUCTOS
    public ArrayList<Producto> crearProductos(){
        ArrayList<Producto> creada=new ArrayList<>();
        //EJEMPLO PARA CREAR PRODUCTOS, COMO PUEDEN VER SE CREAN 3 OBSEQUIOS Y 3 ADICIONES
        ArrayList<Producto> producto_aux=new ArrayList<>();
        ArrayList<Adicional> adicional_aux=new ArrayList<>();
        
        
        //CREAMOS LOS OBSEQUIOS PARA PRODUCTO 2
        Producto o1=new Producto("301",24,0);
        Producto o2=new Producto("302",24,0);
        Producto o3=new Producto("303",24,0);
        Producto o4=new Producto("304",24,0);
        Producto o5=new Producto("305",24,0);
        //CREAMOS LOS ADICIONALES PARA EL PRODUCTO 2
        Adicional a1=new Adicional("Azucar",100);
        Adicional a2=new Adicional("Chocolate",500);
        Adicional a3=new Adicional("Leche",1000);
        //AÑADIMOS LOS OBSEQUIOS A UNA LISTA AUXILIAR PARA EL PRODUCTO 2
        producto_aux.add(o1);
        producto_aux.add(o2);
        producto_aux.add(o3);
        producto_aux.add(o4);
        producto_aux.add(o5);
        //CREAMOS EL PRODUCTO E INSERTAMOS LA LISTA AUXILIAR PARA EL PRODUCTO 2
        Producto p1=new Producto("101",24,1200);
        p1.setObsequios(producto_aux);
        //AÑADIMOS LOS ADICIONALES A UNA LISTA AUXILIAR PARA EL PRODUCTO 2
        adicional_aux.add(a1);
        adicional_aux.add(a2);
        adicional_aux.add(a3);
        //INSERTAMOS LA LISTA AUXILIAR DE ADICIONALES A EL PRODUCTO
        p1.setAdicionalesProducto(adicional_aux);
        //INSERTAMOS EL PRODUCTO EN LA LISTA QUE VAMOS A RETORNAR
        creada.add(p1);
        
        //CREAMOS LOS OBSEQUIOS PARA PRODUCTO 2
        Producto o21=new Producto("311",24,0);
        Producto o22=new Producto("312",24,0);
        Producto o23=new Producto("313",24,0);
        Producto o24=new Producto("314",24,0);
        Producto o25=new Producto("315",24,0);
        //CREAMOS LOS ADICIONALES PARA EL PRODUCTO 2
        Adicional a21=new Adicional("Jugo",100);
        Adicional a22=new Adicional("Galleta",500);
        Adicional a23=new Adicional("Papas",1000);
        //AÑADIMOS LOS OBSEQUIOS A UNA LISTA AUXILIAR PARA EL PRODUCTO 2
        producto_aux.clear();
        producto_aux.add(o21);
        producto_aux.add(o22);
        producto_aux.add(o23);
        producto_aux.add(o24);
        producto_aux.add(o25);
        //CREAMOS EL PRODUCTO E INSERTAMOS LA LISTA AUXILIAR PARA EL PRODUCTO 2
        Producto p2=new Producto("102",24,1200);
        p2.setObsequios(producto_aux);
        //AÑADIMOS LOS ADICIONALES A UNA LISTA AUXILIAR PARA EL PRODUCTO 2
        adicional_aux.clear();
        adicional_aux.add(a21);
        adicional_aux.add(a22);
        adicional_aux.add(a23);
        //INSERTAMOS LA LISTA AUXILIAR DE ADICIONALES A EL PRODUCTO
        p2.setAdicionalesProducto(adicional_aux);
        //INSERTAMOS EL PRODUCTO EN LA LISTA QUE VAMOS A RETORNAR
        creada.add(p2);
        
        
        return creada;
    }
}
