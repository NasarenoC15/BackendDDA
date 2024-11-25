package com.backend_obg_2.backend_obg_2.Service;

import java.util.List;

import com.backend_obg_2.backend_obg_2.Entity.Administrador;

public interface  AdministradorService {
    public Administrador agregarAdministrador(Administrador v);
    
    public Administrador modificacionAdministrador(Administrador v);

    public boolean eliminacionAdministrador(int id);

    public Administrador conseguirAdministrador(int id);

    public List<Administrador> listarAdministradores();
    
}