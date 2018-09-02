/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Controladores.Vending;
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
      String adicionales;
      if(pantalla.vending.adicionalesProducto(codigo)!=null){
         pantalla.imprimirAdicionalesProducto(codigo);
         pantalla.recibirAdicionales();
         
      }
      else{
          pantalla.mensajeErrorProducto();
      }
    }
    public void mensajeErrorProducto(){
        JOptionPane.showMessageDialog(null,"El producto no se encuentra disponible ");
    }
    public void imprimirAdicionalesProducto(String codigo){
        JOptionPane.showMessageDialog(null, "Los productos disponibles son: \n "+this.vending.adicionalesProducto(codigo).toString());
    }
    public String recibirCodigo(){
        String codigo = JOptionPane.showInputDialog("Ingrese el codigo del producto: ");
        return codigo;
    }
    public String recibirAdicionales(){
        String adicionales = JOptionPane.showInputDialog("Ingrese los adicionales");
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
