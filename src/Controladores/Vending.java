/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Moneda;
import Entidades.Producto;
import Entidades.Venta;
import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Emanuel Álvarez, Brian Hortua, Andrés Mora, Thomas Rivera
 */
public class Vending {

    private GestionProducto gestion;
    private ArrayList<Producto> catalogo;
    private ArrayList<Venta> ventasRealizadas;
    private Venta ventaActual;
    private ArrayList<Moneda> dineroAcumulado;

    public boolean crearNuevaVenta() {
        if (this.catalogo.isEmpty()) {
            return false;
        } else {
            this.ventaActual = new Venta();
            this.ventaActual.setFechaHora(LocalDateTime.now());
            this.ventasRealizadas.add(ventaActual);
            return true;
        }
    }

    public int monedasExistentes(int denominacion) {
        Moneda aux=new Moneda(1,denominacion);
        if ((denominacion == 50) || (denominacion == 100) || (denominacion == 200) || (denominacion == 500) || (denominacion == 1000)) {
            this.ventaActual.getPagoMonedas().add(aux);
            return this.buscarMonedasDenominacion(denominacion) + 1;
        } else {
            return -1;
        }
    }

    //busca en la lista por denominacion y retorna la cantidad actual
    public int buscarMonedasDenominacion(int denominacion) {
        for (Moneda moneda : dineroAcumulado) {
            if (moneda.getDenominacion() == denominacion) {
                return moneda.getCantidad();
            }
        }
        return 0;
    }

    //CONSTRUCTORES
    public Vending() {
    }

    //MODIFICADORES
    public GestionProducto getGestion() {
        return gestion;
    }

    public void setGestion(GestionProducto gestion) {
        this.gestion = gestion;
    }

    public ArrayList<Producto> getCatalogo() {
        return catalogo;
    }

    public void setCatalogo(ArrayList<Producto> catalogo) {
        this.catalogo = catalogo;
    }

    public ArrayList<Venta> getVentasRealizadas() {
        return ventasRealizadas;
    }

    public void setVentasRealizadas(ArrayList<Venta> ventasRealizadas) {
        this.ventasRealizadas = ventasRealizadas;
    }

    public Venta getVentaActual() {
        return ventaActual;
    }

    public void setVentaActual(Venta ventaActual) {
        this.ventaActual = ventaActual;
    }

    public ArrayList<Moneda> getDineroAcumulado() {
        return dineroAcumulado;
    }

    public void setDineroAcumulado(ArrayList<Moneda> dineroAcumulado) {
        this.dineroAcumulado = dineroAcumulado;
    }
}
