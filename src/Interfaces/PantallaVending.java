/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Controladores.Vending;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Emanuel Álvarez, Brian Hortua, Andrés Mora, Thomas Rivera
 */
public class PantallaVending {

    Vending vending;

    public static void main(String[] args) {
        //AQUI IBA EL MAIN
      PantallaVending pantalla= new PantallaVending();
      String codigo=pantalla.recibirCodigo();
      ArrayList<String> adicionales=new ArrayList<>();
      String aux;
      do{
          aux=pantalla.recibirAdicionales();
          adicionales.add(aux);
      }while((aux.compareTo("no")!=0));
      adicionales.remove(aux);
      if(pantalla.vending.comprarProducto(codigo,adicionales)){
          JOptionPane.showMessageDialog(null, "Disfrute su producto :) ");
      }
      else{
          JOptionPane.showMessageDialog(null, "No se pudo realizar la venta");
      }
    }

    public void mensajeErrorProducto(){
        JOptionPane.showMessageDialog(null,"El producto no se encuentra disponible ");
    }
    /*public void imprimirAdicionalesProducto(String codigo){
        JOptionPane.showMessageDialog(null, "Los productos disponibles son: \n "+this.vending.adicionalesProducto(codigo).toString());
    }*/
    public String recibirCodigo(){
        String codigo = JOptionPane.showInputDialog("Ingrese el codigo del producto: ");
        return codigo;
    }
    public String recibirAdicionales(){
        String adicionales = JOptionPane.showInputDialog("Ingrese los adicionales(''no'' si no desea más)");
        return adicionales;
    }

    //CONSTRUCTORES
    public PantallaVending() {
        this.vending=new Vending();
    }

    //MODIFICADORES
    public Vending getVending() {
        return vending;
    }

    public void setVending(Vending vending) {
        this.vending = vending;
    }

}
