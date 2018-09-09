/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Venta;
import Entidades.Moneda;
import Entidades.Producto;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author brian
 */
public class DTO {
//Punto 7

    int TotalVentasDia;
    ArrayList<Venta> productoVendidoDia;
    ArrayList<Producto> NoVendidos;
    int cuadreCaja;

    public DTO() {
        this.TotalVentasDia = 0;
        this.productoVendidoDia = new ArrayList<>();
        this.NoVendidos = new ArrayList<>();
        this.cuadreCaja=0;
    }

    //Valor total ventas del día (Parte a) 
    public int valorTotalVentasDia(ArrayList<Venta> VentasRealizadas) {
        for (Venta not : VentasRealizadas) {
            LocalDate DateTimeConvertido = not.getFechaHora().toLocalDate();
            if (LocalDate.now().equals(DateTimeConvertido)) {
                this.TotalVentasDia += not.getProductoVendido().getPrecio();
            }
        }
        return this.TotalVentasDia;
    }
//Parte b

    public ArrayList<Venta> productoVendidoDia(ArrayList<Venta> VentasRealizadas) {
        for (Venta not : VentasRealizadas) {
            LocalDate DateTimeConvertido = not.getFechaHora().toLocalDate();
            if (LocalDate.now().equals(DateTimeConvertido)) {
                this.productoVendidoDia.add(not);
            }
        }
        return this.productoVendidoDia;
    }

//Parte c
    public int cuadreCaja(ArrayList<Venta> VentasRealizadas) {
        int DiferenciaCaja = 0, VentasDia = 0, CajaInicial = 0;
        VentasDia = valorTotalVentasDia(VentasRealizadas);
        for (Venta VentasRealizada : VentasRealizadas) {
            LocalDate DateTimeConvertido = VentasRealizada.getFechaHora().toLocalDate();
            if (LocalDate.now().equals(DateTimeConvertido)) {
                for (Moneda not : VentasRealizada.getPagoMonedas()) {
                    CajaInicial += (not.getDenominacion() * not.getCantidadInicialDia());
                }
            }
        }
        DiferenciaCaja = VentasDia - CajaInicial;
        return DiferenciaCaja;
    }

//Parte d
    public ArrayList<Producto> productosNoVendidos(ArrayList<Venta> VentasRealizadas, ArrayList<Producto> catalogo) {

        for (Producto producto : catalogo) {
            for (Venta VentasRealizada : VentasRealizadas) {
                LocalDate DateTimeConvertido = VentasRealizada.getFechaHora().toLocalDate();
                if (LocalDate.now().equals(DateTimeConvertido)) {
                    if (catalogo.contains(VentasRealizada.getProductoVendido()) == false) {
                        this.NoVendidos.add(VentasRealizada.getProductoVendido());
                    }
                }
            }
        }
        return NoVendidos;
    }
}
