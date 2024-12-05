package com.backend_obg_2.backend_obg_2.Entity;
import com.backend_obg_2.backend_obg_2.Repository.VideoJuegoRepository;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.backend_obg_2.backend_obg_2.Entity.VideoJuego;
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

    

    public PreCompraVideoJuego (int id, VideoJuego videoJuego, double precioIndividual, int cantidad, double precioFinal) {
        this.id = id;
        VideoJuego = videoJuego;
        this.precioIndividual = precioIndividual;
        this.cantidad = cantidad;
        this.precioFinal = precioFinal;
    }

    public PreCompraVideoJuego() {
    }
    
}
