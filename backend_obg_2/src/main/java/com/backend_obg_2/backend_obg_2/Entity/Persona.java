package com.backend_obg_2.backend_obg_2.Entity;

import java.time.LocalDate;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class Persona {
    
    @Id
    private int id;

    @Column
    private String nombre;

    @Column
    private String correo;

    
    private LocalDate fechaRegistro;

    @JsonIgnore
    @OneToMany(mappedBy = "persona")
    private Set<Venta> historialCompras;


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getCorreo() {
        return correo;
    }


    public void setCorreo(String correo) {
        this.correo = correo;
    }


    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }


    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Set<Venta> getHistorialCompras() {
        return historialCompras;
    }

    public void setHistorialCompras(Set<Venta> historialCompras) {
        this.historialCompras = historialCompras;
    }

    public Persona(int id, String nombre, String correo, LocalDate fechaRegistro, Set<Venta> historialCompras) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.fechaRegistro = fechaRegistro;
        this.historialCompras = historialCompras;
    }

    public Persona() {
    }

}
