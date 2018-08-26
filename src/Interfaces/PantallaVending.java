/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Controladores.Vending;

/**
 *
 * @author Emanuel Álvarez, Brian Hortua, Andrés Mora, Thomas Rivera
 */
public class PantallaVending {
    Vending vending;
    public static void main(String[] args) {
        //AQUI IBA EL MAIN MARICONES
        
    }
    //CONSTRUCTORES
    public PantallaVending() {
    }
    //MODIFICADORES
    public Vending getVending() {
        return vending;
    }
    
    public void setVending(Vending vending) {
        this.vending = vending;
    }
    
}
