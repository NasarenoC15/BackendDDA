package com.backend_obg_2.backend_obg_2.Entity;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class PreCompraVideoJuego {
    
    @ManyToOne
    @JoinColumn(name="idVideoJuego", referencedColumnName = "id")
    private videoJuego VideoJuego;

    private double precioIndividual;

    private int cantidad;

    private double precioFinal;

    

    public double getPrecioIndividual() {
        return precioIndividual;
    }

    public void setPrecioIndividual(double precioIndividual) {
        this.precioIndividual = precioIndividual;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }


    
}
