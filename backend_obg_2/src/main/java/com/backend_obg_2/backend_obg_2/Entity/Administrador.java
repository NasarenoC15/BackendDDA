package com.backend_obg_2.backend_obg_2.Entity;

import java.util.Date;

public class Administrador extends Persona {
    
    private String contrasena;

    private String rol;

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Administrador(int id, String nombre, String correo, Date fechaRegistro, String contrasena, String rol) {
        super(id, nombre, correo, fechaRegistro);
        this.contrasena = contrasena;
        this.rol = rol;
    }

    

}
