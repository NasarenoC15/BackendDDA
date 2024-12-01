package com.backend_obg_2.backend_obg_2.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.backend_obg_2.backend_obg_2.Entity.PreCompraVideoJuego;
import com.backend_obg_2.backend_obg_2.Repository.PreCompraVideoJuegoRepository;

public class PreCompraVideoJuegoServiceImpl {
    
@Autowired
    private PreCompraVideoJuegoRepository preCompraVideoJuegoRepository;

    public PreCompraVideoJuego agregarPreCompraVideoJuego(PreCompraVideoJuego c){
        return preCompraVideoJuegoRepository.save(c);
    }

    public boolean eliminarPreCompraVideoJuego(int id){
        if(preCompraVideoJuegoRepository.existsById(id)){
            preCompraVideoJuegoRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public PreCompraVideoJuego modificarPreCompraVideoJuego(PreCompraVideoJuego c){
        if(preCompraVideoJuegoRepository.existsById(c.getId())){
            return preCompraVideoJuegoRepository.save(c);
        }
        return null;
    }

    public PreCompraVideoJuego conseguir(int id){
        Optional<PreCompraVideoJuego> opcional = preCompraVideoJuegoRepository.findById(id);
        
        if(opcional.isPresent()){
            return opcional.get();
        }

        return null;
    }

    public List<PreCompraVideoJuego> listar(){
        return preCompraVideoJuegoRepository.findAll();
    }

}
