package com.backend_obg_2.backend_obg_2.Service;

import java.util.List;

import com.backend_obg_2.backend_obg_2.Entity.UsuarioPremium;

public interface  UsuarioPremiumService {
    public UsuarioPremium agregarUsuarioPremium(UsuarioPremium up);
    
    public UsuarioPremium modificacionUsuarioPremium(UsuarioPremium up);

    public boolean eliminacionUsuarioPremium(int id);

    public UsuarioPremium conseguirUsuarioPremium(int id);

    public List<UsuarioPremium> listarUsuarioPremiums();
    
}