package com.backend_obg_2.backend_obg_2.Service;



import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.backend_obg_2.backend_obg_2.Entity.Persona;
import com.backend_obg_2.backend_obg_2.Entity.UsuarioPremium;
import com.backend_obg_2.backend_obg_2.Entity.UsuarioRegular;
import com.backend_obg_2.backend_obg_2.Entity.Venta;
import com.backend_obg_2.backend_obg_2.Repository.PreCompraVideoJuegoRepository;
import com.backend_obg_2.backend_obg_2.Repository.VentaRepository;


@Service
public class VentaServiceImpl implements VentaService{
    

    @Autowired
    private VentaRepository ventaRepository;
    @Autowired 
    private PreCompraVideoJuegoRepository preCompraRepository;

    public Venta agregarVenta(Venta v){
        ventaRepository.save(v);
        // for(PreCompraVideoJuego p : v.getCarrito()){
        //     preCompraRepository.save(p);
        // }
        return v;
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

    public List<Venta> listarPorRegular(Persona usuarioRegular){
        return ventaRepository.findByPersona(usuarioRegular);
    }
    // public List<Venta> listarPorPremium(UsuarioPremium usuarioPremium){
    //     return ventaRepository.findByUsuarioPremium(usuarioPremium);
    // }

    public List<Venta> listarPorFecha(LocalDate fecha){
        return ventaRepository.findByFechacompra(fecha);
    }
}
