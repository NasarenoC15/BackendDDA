package com.backend_obg_2.backend_obg_2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend_obg_2.backend_obg_2.Entity.VideoJuego;

@Repository
public interface VideoJuegoRepository extends JpaRepository<VideoJuego,Integer> {
    
}