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

    private int TotalVentasDia;
    private ArrayList<Venta> productoVendidoDia;
    private ArrayList<Producto> NoVendidos;
    private int cuadreCaja;

    public DTO() {
        this.TotalVentasDia = 0;
        this.productoVendidoDia = new ArrayList<>();
        this.NoVendidos = new ArrayList<>();
        this.cuadreCaja=0;
    }

    //Valor total ventas del día (Parte a) 
    public int valorTotalVentasDia(ArrayList<Venta> VentasRealizadas) {
        Producto aux;
        int acum=0;
        for (Venta not : VentasRealizadas) {
            LocalDate DateTimeConvertido = not.getFechaHora().toLocalDate();
            if (LocalDate.now().equals(DateTimeConvertido)) {
                aux=not.getProductoVendido();
                acum+= (aux.getPrecio()+aux.totalValorAdicionales());
            }
        }
        return acum;
    }
    public int cantidadMonedasIniciales(ArrayList<Moneda> dineroAcumulado){
        int acum=0;
        for (Moneda moneda : dineroAcumulado) {
            acum+=(moneda.getCantidadInicialDia()*moneda.getDenominacion());
        }
        return acum;
    }
    public int cantidadMonedasFinalDia(ArrayList<Moneda> dineroAcumulado){
        int acum=0;
        for (Moneda moneda : dineroAcumulado) {
            acum+=(moneda.getCantidad()*moneda.getDenominacion());
        }
        return acum;
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
    public int cuadreCaja(ArrayList<Moneda> dineroAcumulado) {
        int diferenciaCaja = 0, cajaFinal = 0, cajaInicial = 0,totalDia;
        cajaFinal=this.cantidadMonedasFinalDia(dineroAcumulado);
        cajaInicial=this.cantidadMonedasIniciales(dineroAcumulado);
        totalDia=this.TotalVentasDia;
        diferenciaCaja = cajaFinal-cajaInicial;
        return totalDia-diferenciaCaja;
    }
    
//Parte d
    //Esta funcion retorna los productos que, en general, no se vendió ninguno
    public ArrayList<Producto> productosNoVendidos(ArrayList<Venta> VentasRealizadas, ArrayList<Producto> catalogo) {
        ArrayList<Producto> aux=new ArrayList<>();
        for (Producto producto : catalogo) {
            for (Venta VentasRealizada : VentasRealizadas) {
                LocalDate DateTimeConvertido = VentasRealizada.getFechaHora().toLocalDate();
                if (LocalDate.now().equals(DateTimeConvertido)) {
                    if (!producto.getCodigo().equals(VentasRealizada.getProductoVendido().getCodigo())) {
                        aux.add(producto);
                    }
                }
            }
        }
        return aux;
    }
    //esta funcion retorna los producto restantes, es decir; los que sobran
    public ArrayList<Producto> productosNoVendidos(ArrayList<Producto> catalogo) {
        return catalogo;
    }
    public int getTotalVentasDia() {
        return TotalVentasDia;
    }

    public void setTotalVentasDia(int TotalVentasDia) {
        this.TotalVentasDia = TotalVentasDia;
    }

    public ArrayList<Venta> getProductoVendidoDia() {
        return productoVendidoDia;
    }

    public void setProductoVendidoDia(ArrayList<Venta> productoVendidoDia) {
        this.productoVendidoDia = productoVendidoDia;
    }

    public ArrayList<Producto> getNoVendidos() {
        return NoVendidos;
    }

    public void setNoVendidos(ArrayList<Producto> NoVendidos) {
        this.NoVendidos = NoVendidos;
    }

    public int getCuadreCaja() {
        return cuadreCaja;
    }

    public void setCuadreCaja(int cuadreCaja) {
        this.cuadreCaja = cuadreCaja;
    }
}
