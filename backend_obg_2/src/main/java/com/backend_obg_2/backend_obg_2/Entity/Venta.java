package com.backend_obg_2.backend_obg_2.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Venta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

  
    private Date fechacompra;

    

    @ManyToOne
    @JoinColumn(name="idPersona", referencedColumnName = "id")
    private Persona persona;

    
    @Column
    private double total;
}
