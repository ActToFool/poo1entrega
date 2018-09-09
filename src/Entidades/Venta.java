/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Emanuel Álvarez, Brian Hortua, Andrés Mora, Thomas Rivera
 */
public class Venta {

    private Producto productoVendido;
    private LocalDateTime fechaHora;
    private ArrayList<Moneda> pagoMonedas;
    private ArrayList<Adicional> adicionalesSeleccionados;

    public Moneda buscarMonedaDenominacionVenta(int denominacion) {
        for (Moneda moneda : pagoMonedas) {
            if (moneda.getDenominacion() == denominacion) {
                return moneda;
            }
        }
        return null;
    }
    //recorre la lista de adicionales y retorna el valor total
    
    //CONSTRUCTORES
    public Venta() {
        this.adicionalesSeleccionados = new ArrayList<>();
        this.pagoMonedas=new ArrayList<>();
        this.productoVendido=new Producto();
    }

    //MODIFICADORES
    public Producto getProductoVendido() {
        return productoVendido;
    }

    public void setProductoVendido(Producto productoVendido) {
        this.productoVendido = productoVendido;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
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
