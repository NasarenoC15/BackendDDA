package com.backend_obg_2.backend_obg_2.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend_obg_2.backend_obg_2.Entity.UsuarioRegular;
import com.backend_obg_2.backend_obg_2.Repository.UsuarioRegularRepository;

@Service
public class UsuarioRegularImpl implements UsuarioRegularService{

    @Autowired
    private UsuarioRegularRepository usuarioRegularRepository;

    public UsuarioRegular agregarUsuarioRegular(UsuarioRegular ur){
        return usuarioRegularRepository.save(ur);
    }
    
    public UsuarioRegular modificacionUsuarioRegular(UsuarioRegular ur){
        if(usuarioRegularRepository.existsById(ur.getId())){
            return usuarioRegularRepository.save(ur);
        }
        return null;
    }

    public boolean eliminacionUsuarioRegular(int id){
        if(usuarioRegularRepository.existsById(id)){
            usuarioRegularRepository.deleteById(id);
            return true;
        }
         return false;
    }

    public UsuarioRegular conseguirUsuarioRegular(int id){
         Optional<UsuarioRegular> opcional =  usuarioRegularRepository.findById(id);
       if(opcional.isPresent()){
        return opcional.get();
       }
       return null;
    }

    public List<UsuarioRegular> listarUsuarioRegulares(){
        return usuarioRegularRepository.findAll();
    }
}
