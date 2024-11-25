package com.backend_obg_2.backend_obg_2.Service;

import java.util.List;

import com.backend_obg_2.backend_obg_2.Entity.videoJuego;

public interface  VideoJuegoService {
    public videoJuego agregarVideoJuego(videoJuego v);
    
    public videoJuego modificacionVideoJuego(videoJuego v);

    public boolean eliminacionVideoJuego(int id);

    public videoJuego conseguirVideoJuego(int id);

    public List<videoJuego> listarVideoJuegos();
    
}
