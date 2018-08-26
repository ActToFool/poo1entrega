/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Emanuel Álvarez, Brian Hortua, Andrés Mora, Thomas Rivera
 */
public class Venta {
    Producto productoVendido;
    Date fechaHora;
    ArrayList<Moneda> pagoMonedas;
    ArrayList<Adicional> adicionalesSeleccionados;
}
