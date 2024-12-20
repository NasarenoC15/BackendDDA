package com.backend_obg_2.backend_obg_2.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class PreCompraVideoJuego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @ManyToOne
    @JoinColumn(name="idVideoJuego", referencedColumnName = "id")
    private VideoJuego VideoJuego;

    private double precioIndividual;

    private int cantidad;

    private double precioFinal;

    @Column(nullable = true)
    private int venta_id;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public VideoJuego getVideoJuego() {
        return VideoJuego;
    }

    public void setVideoJuego(VideoJuego videoJuego) {
        VideoJuego = videoJuego;
    }

    public int getVenta_id() {
        return venta_id;
    }

    public void setVenta_id(int venta_id) {
        this.venta_id = venta_id;
    }


    public PreCompraVideoJuego (int id, VideoJuego videoJuego, double precioIndividual, int cantidad, double precioFinal, int venta_id) {
        this.id = id;
        VideoJuego = videoJuego;
        this.precioIndividual = precioIndividual;
        this.cantidad = cantidad;
        this.precioFinal = precioFinal;
        this.venta_id = venta_id;
    }

    public PreCompraVideoJuego() {
    }
    
}
