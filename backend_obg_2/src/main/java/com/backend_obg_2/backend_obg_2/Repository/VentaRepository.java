package com.backend_obg_2.backend_obg_2.Repository;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.backend_obg_2.backend_obg_2.Entity.Persona;
import com.backend_obg_2.backend_obg_2.Entity.UsuarioPremium;
import com.backend_obg_2.backend_obg_2.Entity.UsuarioRegular;
import com.backend_obg_2.backend_obg_2.Entity.Venta;


public interface VentaRepository extends JpaRepository<Venta, Integer> {
    List<Venta> findByPersona(Persona usuario);
    //List<Venta> findByUsuarioPremium(Persona usuarioPremium);
    List<Venta> findByFechacompra(LocalDate fecha);
}