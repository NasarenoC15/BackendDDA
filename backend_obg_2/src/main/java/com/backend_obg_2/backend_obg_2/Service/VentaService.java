package com.backend_obg_2.backend_obg_2.Service;


import java.util.List;
import com.backend_obg_2.backend_obg_2.Entity.Venta;

public interface VentaService {
 public Venta agregarVenta(Venta v);
    public boolean eliminarVenta(int id);
    public Venta modificarVenta(Venta v);
    public Venta conseguir(int id);
    public List<Venta> listar();
    
} 
