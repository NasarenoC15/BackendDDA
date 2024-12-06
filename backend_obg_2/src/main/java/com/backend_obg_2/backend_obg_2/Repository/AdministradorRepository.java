package com.backend_obg_2.backend_obg_2.Repository;

import com.backend_obg_2.backend_obg_2.Entity.Administrador;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministradorRepository extends JpaRepository<Administrador, Integer> {

    Optional<Administrador> findByCorreo(String correo);
	
}
