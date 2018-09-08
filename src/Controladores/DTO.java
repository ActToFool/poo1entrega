/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Producto;
import Entidades.Venta;
import Controladores.Vending;
import Entidades.Moneda;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author brian
 */
public class DTO {

    //Valor total ventas del día
    
    public int ValorTotalVentasDia(ArrayList<Venta> VentasRealizadas) {
       int TotalVentasDia=0, VentaProducto=0;
       
        for (Venta not : VentasRealizadas) {
            LocalDate DateTimeConvertido = not.getFechaHora().toLocalDate();
            if (LocalDate.now().equals(DateTimeConvertido)){
                TotalVentasDia+=not.getProductoVendido().getPrecio();
            }
        }
        return TotalVentasDia;
    }
    



    }
    

