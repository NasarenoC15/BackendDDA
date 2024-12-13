package com.backend_obg_2.backend_obg_2.Entity;

import java.time.LocalDate;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;


@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class UsuarioPremium extends Persona {
    
    // @JsonManagedReference(value = "personaReference")
    // @OneToMany(mappedBy = "persona")
    // private Set<Venta> HistorialCompras ;


    @Column
    private LocalDate AdquisicionMembresia;

    
    // public Set<Venta> getHistorialCompras() {
    //     return HistorialCompras;
    // }


    // public void setHistorialCompras(Set<Venta> historialCompras) {
    //     HistorialCompras = historialCompras;
    // }


    public LocalDate getAdquisicionMembresia() {
        return AdquisicionMembresia;
    }


    public void setAdquisicionMembresia(LocalDate adquisicionMembresia) {
        AdquisicionMembresia = adquisicionMembresia;
    }


    public UsuarioPremium(int id, String nombre, String correo, LocalDate fechaRegistro, Set<Venta> historialCompras,
            LocalDate adquisicionMembresia) {
        super(id, nombre, correo, fechaRegistro, historialCompras);
        AdquisicionMembresia = adquisicionMembresia;
    }

    public UsuarioPremium() {
    }

    
}
