/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Moneda;
import Entidades.Producto;
import Entidades.Venta;
import java.util.ArrayList;

/**
 *
 * @author Emanuel Álvarez, Brian Hortua, Andrés Mora, Thomas Rivera
 */
public class Vending {

    GestionProducto gestion;
    ArrayList<Producto> catalogo;
    ArrayList<Venta> ventasRealizadas;
    Venta ventaActual;
    ArrayList<Moneda> dineroAcumulado;
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
