package com.backend_obg_2.backend_obg_2.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend_obg_2.backend_obg_2.Entity.Administrador;
import com.backend_obg_2.backend_obg_2.Repository.AdministradorRepository;

@Service
public class AdministradorServiceImpl implements AdministradorService {

    @Autowired
    private AdministradorRepository administradorRepository;

    public Administrador agregarAdministrador(Administrador v){
        return administradorRepository.save(v);
    }
    
    public Administrador modificacionAdministrador(Administrador v){
        if(administradorRepository.existsById(v.getId())){
            return administradorRepository.save(v);
        }
        return null;
    }

    public boolean eliminacionAdministrador(int id){
        if(administradorRepository.existsById(id)){
            administradorRepository.deleteById(id);
            return true;
        }
         return false;
    }

    public Administrador conseguirAdministrador(int id){
         Optional<Administrador> opcional =  administradorRepository.findById(id);
       if(opcional.isPresent()){
        return opcional.get();
       }
       return null;
    }

    public List<Administrador> listarAdministradores(){
        return administradorRepository.findAll();
    }
}
