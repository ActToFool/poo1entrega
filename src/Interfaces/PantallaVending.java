/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Controladores.DTO;
import Controladores.Vending;
import Entidades.Adicional;
import Entidades.Moneda;
import Entidades.Producto;
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
        int opcion;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese: \n 1 -> Ingresar Producto \n 2 -> Probar para los casos positivos y negativos \n 3 -> Reportes \n 4-> Salir"));
            pantalla.menuP(opcion);
        }while(opcion!=4);
    }

    public void menuP(int opcion) {
        switch (opcion) {
            case 1:
                //recibe el codigo del producto a comprar
                String codigo = this.recibirCodigo();
                //pide los adicionales y lo ingresa a la lista
                this.recibirAdicionales(codigo);
                break;
            case 2:
                //seteado producto 1, caso en que todo este bien
                String codigo1="101";
                ArrayList<String> a = new ArrayList<>();
                a.add("Azucar");
                this.vending.comprarProducto(codigo1, a);
                ArrayList<Integer> monedas1;
                
                //seteado producto 1, caso en que el codigo del producto este mal
                String codigo2="106";
                ArrayList<String> a1 = new ArrayList<>();
                a1.add("Azucar");
                this.vending.comprarProducto(codigo2, a1);
                break;
            case 3:
                DTO d=this.vending.getReportes();
                JOptionPane.showMessageDialog(null, "El cuadre de caja es: "+d.getCuadreCaja());
                JOptionPane.showMessageDialog(null, this.vending.formatearNoVendidos());
                JOptionPane.showMessageDialog(null, "El total de ventas del dia es: "+d.getTotalVentasDia());
                JOptionPane.showMessageDialog(null, "El cuadre de caja es: "+this.vending.formatearVendidosDia());
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
                break;
        }
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
        int acum = 0;
        double auxtotal = this.vending.getValorTotalProducto();
        JOptionPane.showMessageDialog(null, "El valor a pagar es: " + auxtotal);
        do {
            monedita = Integer.parseInt(JOptionPane.showInputDialog("Ingrese una moneda(''0'' si no ingresará más) El valor restante es: " + (auxtotal - acum)));
            acum += monedita;
            if ((auxtotal - acum) < 0) {
                acum = (int) auxtotal;
            }
            monedasIngresadas.add(monedita);
        } while (monedita != 0);
        monedasIngresadas.remove(monedasIngresadas.size() - 1);
        double bandera = this.vending.pagoProductoVentaActual(monedasIngresadas);
        if (bandera == 0.0) {
            JOptionPane.showMessageDialog(null, "Disfrute su producto :) ");
        } else {
            if (bandera > 0.0) {
                ArrayList<Moneda> vueltos = this.vending.devolverRestante();
                JOptionPane.showMessageDialog(null, "Toca dar vueltas monedas de:" + this.vending.formatearVueltas());

            } else {
                if (bandera == -1) {
                    JOptionPane.showMessageDialog(null, "Devolución: " + this.vending.formatearVueltas());
                    JOptionPane.showMessageDialog(null, "Pago fallido");
                }
            }
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
