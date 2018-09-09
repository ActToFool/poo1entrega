/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Venta;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author brian
 */
public class DTO {

    int TotalVentasDia = 0;
    ArrayList<Venta> VentasDia = new ArrayList<>();
    //Valor total ventas del día

    public int ValorTotalVentasDia(ArrayList<Venta> VentasRealizadas) {
        for (Venta not : VentasRealizadas) {
            LocalDate DateTimeConvertido = not.getFechaHora().toLocalDate();
            if (LocalDate.now().equals(DateTimeConvertido)) {
                TotalVentasDia += not.getProductoVendido().getPrecio();
            }
        }
        return TotalVentasDia;
    }

    public ArrayList<Venta> NombreYVentasDia(ArrayList<Venta> VentasRealizadas) {
        for (Venta not : VentasRealizadas) {
            LocalDate DateTimeConvertido = not.getFechaHora().toLocalDate();
            if (LocalDate.now().equals(DateTimeConvertido)) {
                VentasDia.add(not);
            }
        }
        return
                VentasDia;
    }

}
