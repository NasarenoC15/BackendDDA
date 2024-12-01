package com.backend_obg_2.backend_obg_2.Service;

import java.util.List;

import com.backend_obg_2.backend_obg_2.Entity.PreCompraVideoJuego;

public interface PreCompraVideoJuegoService {
        public PreCompraVideoJuego agregarPreCompraVideoJuego(PreCompraVideoJuego c);
    public boolean eliminarPreCompraVideoJuego(int id);
    public PreCompraVideoJuego modificarPreCompraVideoJuego(PreCompraVideoJuego c);
    public PreCompraVideoJuego conseguir(int id);
    public List<PreCompraVideoJuego> listar();

}
