package com.backend_obg_2.backend_obg_2.Service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.backend_obg_2.backend_obg_2.Entity.Venta;
import com.backend_obg_2.backend_obg_2.Repository.VentaRepository;


@Service
public class VentaServiceImpl implements VentaService{
    

    @Autowired
    private VentaRepository ventaRepository;

    public Venta agregarVenta(Venta v){
        return ventaRepository.save(v);
    }

    public boolean eliminarVenta(int id){
        if(ventaRepository.existsById(id)){
            ventaRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Venta modificarVenta(Venta v){
        if(ventaRepository.existsById(v.getId())){
            return ventaRepository.save(v);
        }
        return null;
    }

    public Venta conseguir(int id){
        Optional<Venta> opcional = ventaRepository.findById(id);
        
        if(opcional.isPresent()){
            return opcional.get();
        }

        return null;
    }

    public List<Venta> listar(){
        return ventaRepository.findAll();
    }
}
