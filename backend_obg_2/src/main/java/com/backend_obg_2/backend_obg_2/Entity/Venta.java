package com.backend_obg_2.backend_obg_2.Entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Venta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private LocalDate fechacompra;

    
    @OneToOne
    @JoinColumn(name="persona_id")
    @JsonBackReference
    private Persona persona;

    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="venta_id")
    private Set<PreCompraVideoJuego> carrito;

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
