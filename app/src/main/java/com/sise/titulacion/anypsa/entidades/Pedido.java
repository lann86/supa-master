package com.sise.titulacion.anypsa.entidades;

import java.util.ArrayList;

/**
 * Creado por Luis Negrón el 22/08/16.
 * Email lann8605@gmail.com
 */
public class Pedido {
    private int idCliente;
    private double subtotal;
    private double igv;
    private double total;
    private ArrayList<DetallePedido> detallePedido;

    public Pedido() {
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public ArrayList<DetallePedido> getDetallePedido() {
        return detallePedido;
    }

    public void setDetallePedido(ArrayList<DetallePedido> detallePedido) {
        this.detallePedido = detallePedido;
    }
}
