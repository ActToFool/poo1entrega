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

    public Producto(String codigo, int unidadesDisponibles, double precio) {
        this.codigo = codigo;
        this.unidadesDisponibles = unidadesDisponibles;
        this.precio = precio;
    }

    public boolean validarObsequios() {
        if (this.unidadesDisponibles < 0) {
            return false;
        } else {
            for (Producto obsequio : obsequios) {
                if (obsequio.unidadesDisponibles < 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public ArrayList<String> adicionalesDisponibles() {
        ArrayList<String> listaAdicionales = new ArrayList<>();
        for (Adicional adicionPro : this.adicionalesProducto) {
            if (adicionPro.getExistencias() > 0) {
                listaAdicionales.add(adicionPro.getNombre());
            }
        }
        return listaAdicionales;
    }

    //este mejor lo hacemos de tipo lista de adicionales para no repetir codigo
    public ArrayList<Adicional> disponibilidadAdicionales(ArrayList<String> adiciones) {
        ArrayList<Adicional> lista = new ArrayList<Adicional>();
        ArrayList<String> aux = this.adicionalesDisponibles();
        for (String llega : adiciones) {
            for (String hay : aux) {
                if (llega.compareTo(hay) == 0) {
                    lista.add(this.buscarAdicionalNombre(hay));
                }
            }
        }
        return lista;
    }

    public Adicional buscarAdicionalNombre(String buscar) {
        for (Adicional adiciona : this.adicionalesProducto) {
            if (adiciona.getNombre().equals(buscar)) {
                return adiciona;
            }
        }
        return null;
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
