package com.backend_obg_2.backend_obg_2.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.backend_obg_2.backend_obg_2.Entity.Venta;
import com.backend_obg_2.backend_obg_2.Repository.VentaRepository;
import com.backend_obg_2.backend_obg_2.Service.VentaService;

public class VentaController {
    



    @PostMapping
    public ResponseEntity<?> altaVenta(@RequestBody Venta venta){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(ventaService.agregarVenta(venta));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }


     @PutMapping
    public ResponseEntity<?> modificacionBiblioteca(@RequestBody Venta venta){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(ventaRepository.save(venta));
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminacionVenta(@PathVariable int id){
        try {
            ventaRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body("Eliminado");
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> conseguirVenta(@PathVariable int id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(ventaRepository.findById(id));
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }

    @GetMapping
    public ResponseEntity<?> conseguirVenta(){
        try {
            
            return ResponseEntity.status(HttpStatus.OK).body(ventaRepository.findAll());
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }
}
