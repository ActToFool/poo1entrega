/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Emanuel Álvarez, Brian Hortua, Andrés Mora, Thomas Rivera
 */
public class Adicional {

    private String nombre;
    private double precio;
    private int existencias;

    //CONSTRUCTORES
    public Adicional() {
    }

    public Adicional(String nombre, double precio, int existencias) {
        this.nombre = nombre;
        this.precio = precio;
        this.existencias = existencias;
    }
    
    public Adicional(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    //MODIFICADORES
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }
}
