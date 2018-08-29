/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Adicional;
import Entidades.Moneda;
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
        
        //pto el que lo lea
        //CREAMOS LOS OBSEQUIOS PARA PRODUCTO 1
        Producto o1=new Producto("301",12,0);
        Producto o2=new Producto("302",12,0);
        Producto o3=new Producto("303",12,0);
        Producto o4=new Producto("304",12,0);
        Producto o5=new Producto("305",12,0);
        //CREAMOS LOS ADICIONALES PARA EL PRODUCTO 2
        Adicional a1=new Adicional("Azucar",100);
        Adicional a2=new Adicional("Chocolate",500);
        Adicional a3=new Adicional("Leche",1000);
        //AÑADIMOS LOS OBSEQUIOS A UNA LISTA AUXILIAR PARA EL PRODUCTO 1
        producto_aux.add(o1);
        producto_aux.add(o2);
        producto_aux.add(o3);
        producto_aux.add(o4);
        producto_aux.add(o5);
        //CREAMOS EL PRODUCTO E INSERTAMOS LA LISTA AUXILIAR PARA EL PRODUCTO 1
        Producto p1=new Producto("101",24,1200);
        p1.setObsequios(producto_aux);
        //AÑADIMOS LOS ADICIONALES A UNA LISTA AUXILIAR PARA EL PRODUCTO 1
        adicional_aux.add(a1);
        adicional_aux.add(a2);
        adicional_aux.add(a3);
        //INSERTAMOS LA LISTA AUXILIAR DE ADICIONALES A EL PRODUCTO
        p1.setAdicionalesProducto(adicional_aux);
        //INSERTAMOS EL PRODUCTO EN LA LISTA QUE VAMOS A RETORNAR
        creada.add(p1);
        
        //CREAMOS LOS OBSEQUIOS PARA PRODUCTO 2
        Producto o21=new Producto("311",12,0);
        Producto o22=new Producto("312",12,0);
        Producto o23=new Producto("313",12,0);
        Producto o24=new Producto("314",12,0);
        Producto o25=new Producto("315",12,0);
        //CREAMOS LOS ADICIONALES PARA EL PRODUCTO 2
        Adicional a21=new Adicional("Jugo",1200);
        Adicional a22=new Adicional("Galleta",800);
        Adicional a23=new Adicional("Papas",1200);
        //AÑADIMOS LOS OBSEQUIOS A UNA LISTA AUXILIAR PARA EL PRODUCTO 2
        producto_aux.clear();
        producto_aux.add(o21);
        producto_aux.add(o22);
        producto_aux.add(o23);
        producto_aux.add(o24);
        producto_aux.add(o25);
        //CREAMOS EL PRODUCTO E INSERTAMOS LA LISTA AUXILIAR PARA EL PRODUCTO 2
        Producto p2=new Producto("102",24,4000);
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
        
        //CREAMOS LOS OBSEQUIOS PARA PRODUCTO 3
        Producto o31=new Producto("321",12,0);
        Producto o32=new Producto("322",12,0);
        Producto o33=new Producto("323",12,0);
        Producto o34=new Producto("324",12,0);
        Producto o35=new Producto("325",12,0);
        //CREAMOS LOS ADICIONALES PARA EL PRODUCTO 3
        Adicional a31=new Adicional("ManiSal",900);
        Adicional a32=new Adicional("ManiMoto",1200);
        Adicional a33=new Adicional("ManiDulce",1000);
        //AÑADIMOS LOS OBSEQUIOS A UNA LISTA AUXILIAR PARA EL PRODUCTO 3
        producto_aux.clear();
        producto_aux.add(o31);
        producto_aux.add(o32);
        producto_aux.add(o33);
        producto_aux.add(o34);
        producto_aux.add(o35);
        //CREAMOS EL PRODUCTO E INSERTAMOS LA LISTA AUXILIAR PARA EL PRODUCTO 3
        Producto p3=new Producto("103",24,2500);
        p3.setObsequios(producto_aux);
        //AÑADIMOS LOS ADICIONALES A UNA LISTA AUXILIAR PARA EL PRODUCTO 3
        adicional_aux.clear();
        adicional_aux.add(a31);
        adicional_aux.add(a32);
        adicional_aux.add(a33);
        //INSERTAMOS LA LISTA AUXILIAR DE ADICIONALES A EL PRODUCTO
        p3.setAdicionalesProducto(adicional_aux);
        //INSERTAMOS EL PRODUCTO EN LA LISTA QUE VAMOS A RETORNAR
        creada.add(p3);
        
        //CREAMOS LOS OBSEQUIOS PARA PRODUCTO 4
        Producto o41=new Producto("331",12,0);
        Producto o42=new Producto("332",12,0);
        Producto o43=new Producto("333",12,0);
        Producto o44=new Producto("334",12,0);
        Producto o45=new Producto("335",12,0);
        //CREAMOS LOS ADICIONALES PARA EL PRODUCTO 4
        Adicional a41=new Adicional("Cheetos",1000);
        Adicional a42=new Adicional("Doritos",1400);
        Adicional a43=new Adicional("Choclitos",900);
        //AÑADIMOS LOS OBSEQUIOS A UNA LISTA AUXILIAR PARA EL PRODUCTO 4
        producto_aux.clear();
        producto_aux.add(o41);
        producto_aux.add(o42);
        producto_aux.add(o43);
        producto_aux.add(o44);
        producto_aux.add(o45);
        //CREAMOS EL PRODUCTO E INSERTAMOS LA LISTA AUXILIAR PARA EL PRODUCTO 4
        Producto p4=new Producto("104",24,3500);
        p4.setObsequios(producto_aux);
        //AÑADIMOS LOS ADICIONALES A UNA LISTA AUXILIAR PARA EL PRODUCTO 4
        adicional_aux.clear();
        adicional_aux.add(a41);
        adicional_aux.add(a42);
        adicional_aux.add(a43);
        //INSERTAMOS LA LISTA AUXILIAR DE ADICIONALES A EL PRODUCTO
        p4.setAdicionalesProducto(adicional_aux);
        //INSERTAMOS EL PRODUCTO EN LA LISTA QUE VAMOS A RETORNAR
        creada.add(p4);
        
        //CREAMOS LOS OBSEQUIOS PARA PRODUCTO 5
        Producto o51=new Producto("341",12,0);
        Producto o52=new Producto("342",12,0);
        Producto o53=new Producto("343",12,0);
        Producto o54=new Producto("344",12,0);
        Producto o55=new Producto("345",12,0);
        //CREAMOS LOS ADICIONALES PARA EL PRODUCTO 2
        Adicional a51=new Adicional("CocaCola",2600);
        Adicional a52=new Adicional("Pepsi",2200);
        Adicional a53=new Adicional("Quatro",1800);
        //AÑADIMOS LOS OBSEQUIOS A UNA LISTA AUXILIAR PARA EL PRODUCTO 5
        producto_aux.clear();
        producto_aux.add(o51);
        producto_aux.add(o52);
        producto_aux.add(o53);
        producto_aux.add(o54);
        producto_aux.add(o55);
        //CREAMOS EL PRODUCTO E INSERTAMOS LA LISTA AUXILIAR PARA EL PRODUCTO 5
        Producto p5=new Producto("105",24,1500);
        p5.setObsequios(producto_aux);
        //AÑADIMOS LOS ADICIONALES A UNA LISTA AUXILIAR PARA EL PRODUCTO 5
        adicional_aux.clear();
        adicional_aux.add(a51);
        adicional_aux.add(a52);
        adicional_aux.add(a53);
        //INSERTAMOS LA LISTA AUXILIAR DE ADICIONALES A EL PRODUCTO
        p5.setAdicionalesProducto(adicional_aux);
        //INSERTAMOS EL PRODUCTO EN LA LISTA QUE VAMOS A RETORNAR
        creada.add(p5);
        
        return creada;
    }
    public ArrayList<Moneda> dineroAcumulado(){
        //CREAMOS LAS MONEDAS DE TODAS LAS DENOMINACIONES
        Moneda m1=new Moneda(50,20);
        Moneda m2=new Moneda(100,20);
        Moneda m3=new Moneda(200,20);
        Moneda m4=new Moneda(500,20);
        Moneda m5=new Moneda(1000,20);
        //CREAMOS LA LISTA QUE VAMOS A RETORNAR Y AGREGAMOS LAS MONEDAS
        ArrayList<Moneda> creada=new ArrayList<>();
        creada.add(m1);
        creada.add(m2);
        creada.add(m3);
        creada.add(m4);
        creada.add(m5);
        
        return creada;
    }
}
