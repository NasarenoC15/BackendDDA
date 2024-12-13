package com.backend_obg_2.backend_obg_2.Service;


import java.time.LocalDate;
import java.util.List;

import com.backend_obg_2.backend_obg_2.Entity.Persona;
import com.backend_obg_2.backend_obg_2.Entity.UsuarioPremium;
import com.backend_obg_2.backend_obg_2.Entity.UsuarioRegular;
import com.backend_obg_2.backend_obg_2.Entity.Venta;

public interface VentaService {
 public Venta agregarVenta(Venta v);
    public boolean eliminarVenta(int id);
    public Venta modificarVenta(Venta v);
    public Venta conseguir(int id);
    public List<Venta> listar();

    public List<Venta> listarPorRegular(Persona usuarioRegular);
    // public List<Venta> listarPorPremium(UsuarioPremium usuarioPremium);
    public List<Venta> listarPorFecha(LocalDate fecha);
    
} 
