/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Entidades.Adicional;
import Entidades.Moneda;
import Entidades.Producto;
import Entidades.Venta;
import Interfaces.PantallaVending;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
 

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
    //¿no se ingresan monedas en esta funcion?
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
    //Funcion punto 4
    public boolean comprarProducto(String codigo, String Adicional){
        Producto p_actual=verificarProductoAComprar(codigo);
        if((p_actual!=null)&&(p_actual.adicionalesDisponibles().isEmpty()!=true)){
            
        }
        else{
            JOptionPane.showMessageDialog(null, "El producto seleccionado no se encuentra disponible");
        }
        return false;
    }

    public int monedasExistentes(int denominacion) {
        if ((denominacion == 50) || (denominacion == 100) || (denominacion == 200) || (denominacion == 500) || (denominacion == 1000)) {
            if (this.ventaActual.buscarMonedaDenominacionVenta(denominacion) != null) {
                this.ventaActual.buscarMonedaDenominacionVenta(denominacion).setCantidad(buscarMonedaDenominacion(denominacion).getCantidad() + 1);
            }
            else{
                Moneda m=new Moneda(denominacion,1);
                this.ventaActual.getPagoMonedas().add(m);
            }
            this.buscarMonedaDenominacion(denominacion).setCantidad(buscarMonedaDenominacion(denominacion).getCantidad() + 1);
            return this.buscarMonedaDenominacion(denominacion).getCantidad();
        } else {
            return -1;
        }
    }

    //busca en la lista por denominacion y retorna la cantidad actual
    public Moneda buscarMonedaDenominacion(int denominacion) {
        for (Moneda moneda : dineroAcumulado) {
            if (moneda.getDenominacion() == denominacion) {
                return moneda;
            }
        }
        return null;
    }
    public ArrayList<String> adicionalesProducto(String codigo){
        if((this.verificarProductoAComprar(codigo)==null)||(this.verificarProductoAComprar(codigo).adicionalesDisponibles().isEmpty())){
            return null;
        }
        else{
            return this.verificarProductoAComprar(codigo).adicionalesDisponibles();
        }
    }
    //esta funcion toca revisarla :'v
    //en esta funcion decia que era booleana pero nos parefcio mas facil retornar el producto para no reescribir codigo
    private Producto verificarProductoAComprar(String codigo){
        for (Producto producto : catalogo) {
            if(producto.getCodigo().equals(codigo)){
                return producto;
            }
        }
        return null;
    }
    //CONSTRUCTORES
    public Vending() {
        this.catalogo = new ArrayList<>();
        this.gestion=new GestionProducto();
        this.catalogo = this.gestion.crearProductos();
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
