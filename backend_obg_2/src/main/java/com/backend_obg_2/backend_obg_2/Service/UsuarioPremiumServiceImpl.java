package com.backend_obg_2.backend_obg_2.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend_obg_2.backend_obg_2.Entity.UsuarioPremium;
import com.backend_obg_2.backend_obg_2.Repository.UsuarioPremiumRepository;

@Service
public class UsuarioPremiumServiceImpl implements UsuarioPremiumService {

    @Autowired
    private UsuarioPremiumRepository usuarioPremiumRepository;

    public UsuarioPremium agregarUsuarioPremium(UsuarioPremium up){
        return usuarioPremiumRepository.save(up);
    }
    
    public UsuarioPremium modificacionUsuarioPremium(UsuarioPremium up){
        if(usuarioPremiumRepository.existsById(up.getId())){
            return usuarioPremiumRepository.save(up);
        }
        return null;
    }

    public boolean eliminacionUsuarioPremium(int id){
        if(usuarioPremiumRepository.existsById(id)){
            usuarioPremiumRepository.deleteById(id);
            return true;
        }
         return false;
    }

    public UsuarioPremium conseguirUsuarioPremium(int id){
         Optional<UsuarioPremium> opcional =  usuarioPremiumRepository.findById(id);
       if(opcional.isPresent()){
        return opcional.get();
       }
       return null;
    }

    public List<UsuarioPremium> listarUsuarioPremiums(){
        return usuarioPremiumRepository.findAll();
    }
}