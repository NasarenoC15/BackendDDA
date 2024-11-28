package com.backend_obg_2.backend_obg_2.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.backend_obg_2.backend_obg_2.Entity.VideoJuego;
import com.backend_obg_2.backend_obg_2.Repository.VideoJuegoRepository;

@Service
public class VideoJuegoServiceImpl implements VideoJuegoService {

    @Autowired
    private VideoJuegoRepository VideoJuegoRepository;

    public VideoJuego agregarVideoJuego(VideoJuego v){
    
        return VideoJuegoRepository.save(v); 
    }
    
    public VideoJuego modificacionVideoJuego(VideoJuego v){
        if(VideoJuegoRepository.existsById(v.getId())){
            return VideoJuegoRepository.save(v);
        }
        return null;
    }

    public boolean eliminacionVideoJuego(int id){
        if(VideoJuegoRepository.existsById(id)){
            VideoJuegoRepository.deleteById(id);
            return true;
        }
         return false;
    }

    public VideoJuego conseguirVideoJuego(int id){
        Optional<VideoJuego> opcional =  VideoJuegoRepository.findById(id);
       if(opcional.isPresent()){
        return opcional.get();
       }
       return null;
    }

    public List<VideoJuego> listarVideoJuegos(){
        return VideoJuegoRepository.findAll();
    }
} 