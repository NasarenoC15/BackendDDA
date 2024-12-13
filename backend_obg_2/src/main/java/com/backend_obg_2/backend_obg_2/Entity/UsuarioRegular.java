package com.backend_obg_2.backend_obg_2.Entity;

import java.time.LocalDate;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;


@Entity
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class UsuarioRegular extends Persona{

    // @JsonManagedReference(value = "personaReference")
    // @OneToMany(mappedBy = "persona")
    // private Set<Venta> HistorialCompras  =new HashSet<>();

   
    // public Set<Venta> getHistorialCompras() {
    //     return HistorialCompras;
    // }

    // public void setHistorialCompras(Set<Venta> historialCompras) {
    //     HistorialCompras = historialCompras;
    // }

    public UsuarioRegular(int id, String nombre, String correo, LocalDate fechaRegistro, Set<Venta> historialCompras) {
        super(id, nombre, correo, fechaRegistro, historialCompras);
        // HistorialCompras = historialCompras;
    }

    public UsuarioRegular() {
    }
    


}
