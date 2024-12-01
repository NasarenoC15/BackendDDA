package com.backend_obg_2.backend_obg_2.Entity;

import java.time.LocalDate;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class UsuarioPremium extends Persona {
    
    @Column
    private String tipoMembresia;
    
    @JsonIgnore
    @OneToMany(mappedBy = "persona")
    private Set<Venta> HistorialCompras  =new HashSet<>();


    @Column
    private LocalDate AdquisicionMembresia;


    public Set<Venta> getHistorialCompras() {
        return HistorialCompras;
    }


    public void setHistorialCompras(Set<Venta> historialCompras) {
        HistorialCompras = historialCompras;
    }


    public LocalDate getAdquisicionMembresia() {
        return AdquisicionMembresia;
    }


    public void setAdquisicionMembresia(LocalDate adquisicionMembresia) {
        AdquisicionMembresia = adquisicionMembresia;
    }


    public UsuarioPremium(int id, String nombre, String correo, LocalDate fechaRegistro, Set<Venta> historialCompras,
            LocalDate adquisicionMembresia) {
        super(id, nombre, correo, fechaRegistro);
        HistorialCompras = historialCompras;
        AdquisicionMembresia = adquisicionMembresia;
    }

    public UsuarioPremium() {
    }

    
}
