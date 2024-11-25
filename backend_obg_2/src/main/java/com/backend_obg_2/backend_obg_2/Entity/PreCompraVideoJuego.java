package com.backend_obg_2.backend_obg_2.Entity;

public class PreCompraVideoJuego {
    

    private int idVideoJuego;

    private double precioIndividual;

    private int cantidad;

    private double precioFinal;

    public int getIdVideoJuego() {
        return idVideoJuego;
    }

    public void setIdVideoJuego(int idVideoJuego) {
        this.idVideoJuego = idVideoJuego;
    }

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

    public PreCompraVideoJuego(int idVideoJuego, double precioIndividual, int cantidad, double precioFinal) {
        this.idVideoJuego = idVideoJuego;
        this.precioIndividual = precioIndividual;
        this.cantidad = cantidad;
        this.precioFinal = precioFinal;
    }

    
}
