package com.backend_obg_2.backend_obg_2.Entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Venta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private LocalDate fechacompra;

    
    @ManyToOne
    @JoinColumn(name="persona_id")
    private Persona persona;

    @JsonIgnore
    @OneToMany
    @JoinColumn(name="venta_id")
    private Set<PreCompraVideoJuego> carrito = new HashSet<>();

    @Column
    private double total;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFechacompra() {
        return fechacompra;
    }

    public void setFechacompra(LocalDate fechacompra) {
        this.fechacompra = fechacompra;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public Set<PreCompraVideoJuego> getCarrito() {
        return carrito;
    }

    public void setCarrito(Set<PreCompraVideoJuego> carrito) {
        this.carrito = carrito;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Venta(int id, LocalDate fechacompra, Persona persona, Set<PreCompraVideoJuego> carrito, double total) {
        this.id = id;
        this.fechacompra = fechacompra;
        this.persona = persona;
        this.carrito = carrito;
        this.total = total;
    }

    public Venta() {
    }
    
}
