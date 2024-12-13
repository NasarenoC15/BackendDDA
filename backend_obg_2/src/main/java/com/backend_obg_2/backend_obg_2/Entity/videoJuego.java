package com.backend_obg_2.backend_obg_2.Entity;

import java.sql.Blob;
import java.util.Set;

import com.backend_obg_2.backend_obg_2.Service.BlobSerializer;
import com.backend_obg_2.backend_obg_2.Service.BlobDeserializer;
import com.fasterxml.jackson.annotation.JsonIgnore;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class VideoJuego {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nombre;

    @Column
    private String descripcion;


    @Column
    @JsonSerialize(using = BlobSerializer.class)
    @JsonDeserialize(using = BlobDeserializer.class)
    private Blob imagen;

    @Column
    private int stock;

    @Column
    private Double precio;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    @JsonIgnore
    @OneToMany(mappedBy = "VideoJuego")
    private Set<PreCompraVideoJuego> preCompraVideoJuego;

 
    @Column
    private String trailer;


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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Blob getImagen() {
        return imagen;
    }

    public void setImagen(Blob imagen) {
        this.imagen = imagen;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }


    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public VideoJuego(int id, String nombre, String descripcion, Double precio,
    Blob imagen, int stock, Categoria categoria, String trailer) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.imagen = imagen;
        this.stock = stock;
        this.categoria = categoria;
        this.trailer = trailer;
    }

    public VideoJuego(){
        
    }

}
