package com.backend_obg_2.backend_obg_2.Service;

import java.util.List;

import com.backend_obg_2.backend_obg_2.Entity.VideoJuego;

public interface  VideoJuegoService {
    public VideoJuego agregarVideoJuego(VideoJuego v);
    
    public VideoJuego modificacionVideoJuego(VideoJuego v);

    public boolean eliminacionVideoJuego(int id);

    public VideoJuego conseguirVideoJuego(int id);

    public List<VideoJuego> listarVideoJuegos();
    
}
