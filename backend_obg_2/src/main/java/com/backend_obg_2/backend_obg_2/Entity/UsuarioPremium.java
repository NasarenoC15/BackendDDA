package com.backend_obg_2.backend_obg_2.Entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;

public class UsuarioPremium extends Persona {
    

    
    @JsonIgnore
    @OneToMany(mappedBy = "Venta")
    private Set<Venta> HistorialCompras  =new HashSet<>();


    @Column
    private Date AdquisicionMembresia;


    public Set<Venta> getHistorialCompras() {
        return HistorialCompras;
    }


    public void setHistorialCompras(Set<Venta> historialCompras) {
        HistorialCompras = historialCompras;
    }


    public Date getAdquisicionMembresia() {
        return AdquisicionMembresia;
    }


    public void setAdquisicionMembresia(Date adquisicionMembresia) {
        AdquisicionMembresia = adquisicionMembresia;
    }


    public UsuarioPremium(int id, String nombre, String correo, Date fechaRegistro, Set<Venta> historialCompras,
            Date adquisicionMembresia) {
        super(id, nombre, correo, fechaRegistro);
        HistorialCompras = historialCompras;
        AdquisicionMembresia = adquisicionMembresia;
    }

    
}
