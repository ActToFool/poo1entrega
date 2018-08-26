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
    private Producto productoVendido;
    private Date fechaHora;
    private ArrayList<Moneda> pagoMonedas;
    private ArrayList<Adicional> adicionalesSeleccionados;

    //CONSTRUCTORES
    public Venta() {
    }
    //MODIFICADORES
    public Producto getProductoVendido() {
        return productoVendido;
    }

    public void setProductoVendido(Producto productoVendido) {
        this.productoVendido = productoVendido;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public ArrayList<Moneda> getPagoMonedas() {
        return pagoMonedas;
    }

    public void setPagoMonedas(ArrayList<Moneda> pagoMonedas) {
        this.pagoMonedas = pagoMonedas;
    }

    public ArrayList<Adicional> getAdicionalesSeleccionados() {
        return adicionalesSeleccionados;
    }

    public void setAdicionalesSeleccionados(ArrayList<Adicional> adicionalesSeleccionados) {
        this.adicionalesSeleccionados = adicionalesSeleccionados;
    }
    
}
