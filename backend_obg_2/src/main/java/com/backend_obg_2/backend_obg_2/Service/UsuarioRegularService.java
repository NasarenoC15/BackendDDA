package com.backend_obg_2.backend_obg_2.Service;

import java.util.List;

import com.backend_obg_2.backend_obg_2.Entity.UsuarioRegular;

public class UsuarioRegularService {

    public UsuarioRegular agregarUsuarioRegular(UsuarioRegular ur);
    
    public UsuarioRegular modificacionUsuarioRegular(UsuarioRegular ur);

    public boolean eliminacionUsuarioRegular(int id);

    public UsuarioRegular conseguirUsuarioRegular(int id);

    public List<UsuarioRegular> listarUsuarioRegulares();
    
}
