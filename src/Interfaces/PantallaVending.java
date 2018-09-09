/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Controladores.Vending;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Emanuel Álvarez, Brian Hortua, Andrés Mora, Thomas Rivera
 */
public class PantallaVending {

    Vending vending;

    public static void main(String[] args) {
        //AQUI IBA EL MAIN
        PantallaVending pantalla = new PantallaVending();
        //recibe el codigo del producto a comprar
        String codigo = pantalla.recibirCodigo();

        //pide los adicionales y lo ingresa a la lista
        pantalla.recibirAdicionales(codigo);
        

    }

    public void mensajeErrorProducto() {
        JOptionPane.showMessageDialog(null, "El producto no se encuentra disponible ");
    }

    /*public void imprimirAdicionalesProducto(String codigo){
        JOptionPane.showMessageDialog(null, "Los productos disponibles son: \n "+this.vending.adicionalesProducto(codigo).toString());
    }*/
    public String recibirCodigo() {
        String codigo = JOptionPane.showInputDialog("Ingrese el codigo del producto: ");
        return codigo;
    }

    public void recibirMonedas() {
        ArrayList<Integer> monedasIngresadas = new ArrayList<>();
        int monedita = 0;
        do {
            monedita = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una moneda(''0'' si no desea más)"));
            monedasIngresadas.add(monedita);
        } while (monedita != 0);
        monedasIngresadas.remove(monedasIngresadas.size()-1);
        if(this.vending.pagoProductoVentaActual(monedasIngresadas)){
            JOptionPane.showMessageDialog(null, "Disfrute su producto :) ");
        }
        else{
            JOptionPane.showMessageDialog(null, "Pago fallido");
        }

    }

    //pide los adicionales
    public void recibirAdicionales(String codigo) {
        //crea la lista de adicionales a comprar
        ArrayList<String> adicionales = new ArrayList<>();
        String aux;

        do {
            aux = JOptionPane.showInputDialog("Ingrese un adicional(''no'' si no desea más)");
            adicionales.add(aux);
        } while ((aux.compareTo("no") != 0));
        adicionales.remove(aux); //se elimina el último agregado que es el "no"
        
        //empieza la venta del producto
        if (this.vending.comprarProducto(codigo, adicionales)) {
            //llama a la que recibe monedas
            //Inserta las monedas
            this.recibirMonedas();
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo realizar la venta");
        }
    }

    //CONSTRUCTORES
    public PantallaVending() {
        this.vending = new Vending();
    }

    //MODIFICADORES
    public Vending getVending() {
        return vending;
    }

    public void setVending(Vending vending) {
        this.vending = vending;
    }

}
