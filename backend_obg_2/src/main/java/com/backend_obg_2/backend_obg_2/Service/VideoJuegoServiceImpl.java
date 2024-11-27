package com.backend_obg_2.backend_obg_2.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.backend_obg_2.backend_obg_2.Entity.videoJuego;
import com.backend_obg_2.backend_obg_2.Repository.VideoJuegoRepository;

@Service
public class VideoJuegoServiceImpl implements VideoJuegoService {

    @Autowired
    private VideoJuegoRepository videoJuegoRepository;

    public videoJuego agregarVideoJuego(videoJuego v){
    
        return videoJuegoRepository.save(v); 
    }
    
    public videoJuego modificacionVideoJuego(videoJuego v){
        if(videoJuegoRepository.existsById(v.getId())){
            return videoJuegoRepository.save(v);
        }
        return null;
    }

    public boolean eliminacionVideoJuego(int id){
        if(videoJuegoRepository.existsById(id)){
            videoJuegoRepository.deleteById(id);
            return true;
        }
         return false;
    }

    public videoJuego conseguirVideoJuego(int id){
        Optional<videoJuego> opcional =  videoJuegoRepository.findById(id);
       if(opcional.isPresent()){
        return opcional.get();
       }
       return null;
    }

    public List<videoJuego> listarVideoJuegos(){
        return videoJuegoRepository.findAll();
    }
} 