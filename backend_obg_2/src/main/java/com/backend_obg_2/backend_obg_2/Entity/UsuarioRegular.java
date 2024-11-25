package com.backend_obg_2.backend_obg_2.Entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.OneToMany;

public class UsuarioRegular extends Persona{
     @JsonIgnore
    @OneToMany(mappedBy = "Venta")
    private Set<Venta> HistorialCompras  =new HashSet<>();

    public Set<Venta> getHistorialCompras() {
        return HistorialCompras;
    }

    public void setHistorialCompras(Set<Venta> historialCompras) {
        HistorialCompras = historialCompras;
    }

    public UsuarioRegular(int id, String nombre, String correo, Date fechaRegistro, Set<Venta> historialCompras) {
        super(id, nombre, correo, fechaRegistro);
        HistorialCompras = historialCompras;
    }

    


}
