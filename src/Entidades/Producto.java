/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Emanuel Álvarez, Brian Hortua, Andrés Mora, Thomas Rivera
 */
public class Producto {
    private String codigo;
    private int unidadesDisponibles;
    private double precio;
    private ArrayList<Producto> obsequios;
    private ArrayList<Adicional> adicionalesProducto;

    //CONSTRUCTORES
    public Producto() {
    }
    //MODIFICADORES
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Producto> getObsequios() {
        return obsequios;
    }

    public void setObsequios(ArrayList<Producto> obsequios) {
        this.obsequios = obsequios;
    }

    public ArrayList<Adicional> getAdicionalesProducto() {
        return adicionalesProducto;
    }

    public void setAdicionalesProducto(ArrayList<Adicional> adicionalesProducto) {
        this.adicionalesProducto = adicionalesProducto;
    }
    
}
