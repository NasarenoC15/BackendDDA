package com.backend_obg_2.backend_obg_2.Entity;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class UsuarioRegular extends Persona{
     @JsonIgnore
    @OneToMany(mappedBy = "persona")
    private Set<Venta> HistorialCompras  =new HashSet<>();

    public Set<Venta> getHistorialCompras() {
        return HistorialCompras;
    }

    public void setHistorialCompras(Set<Venta> historialCompras) {
        HistorialCompras = historialCompras;
    }

    public UsuarioRegular(int id, String nombre, String correo, LocalDate fechaRegistro, Set<Venta> historialCompras) {
        super(id, nombre, correo, fechaRegistro);
        HistorialCompras = historialCompras;
    }

    public UsuarioRegular() {
    }
    


}
