package com.backend_obg_2.backend_obg_2.Entity;

import java.time.LocalDate;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Venta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private LocalDate fechacompra;

    
    @ManyToOne(optional = true)
    @JoinColumn(name="persona_id", nullable = true)
    //@JsonBackReference(value = "personaReference")
    private Persona persona;

    @ManyToOne(optional = true)
    @JoinColumn(name="vendedor_id", nullable = true)
    //@JsonBackReference(value = "vendedorReference")
    private Persona vendedor;


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

    public Persona getVendedor() {
        return vendedor;
    }

    public void setVendedor(Persona vendedor) {
        this.vendedor = vendedor;
    }

    public Venta(int id, LocalDate fechacompra, Persona persona, Set<PreCompraVideoJuego> carrito, double total , Persona vendedor) {
        this.id = id;
        this.fechacompra = fechacompra;
        this.persona = persona;
        this.carrito = carrito;
        this.total = total;
        this.vendedor = vendedor;
    }

    public Venta() {
    }
    
}
