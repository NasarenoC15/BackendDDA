package com.backend_obg_2.backend_obg_2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.backend_obg_2.backend_obg_2.Entity.Categoria;
import com.backend_obg_2.backend_obg_2.Repository.CategoriaRepository;

public class CategoriaController {
    

    @Autowired
    private CategoriaRepository categoriaRepository;
   
    @PostMapping
    public ResponseEntity<?> altaCategoria(@RequestBody Categoria categoria){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(categoriaRepository.save(categoria));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }

    @PutMapping
    public ResponseEntity<?> modificacionCategoria(@RequestBody Categoria categoria){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(categoriaRepository.save(categoria));
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminacionCategoria(@PathVariable int id){
        try {
            categoriaRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body("Eliminado");
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> conseguirCategoria(@PathVariable int id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(categoriaRepository.findById(id));
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }

    @GetMapping
    public ResponseEntity<?> conseguirCategorias(){
        try {
            
            return ResponseEntity.status(HttpStatus.OK).body(categoriaRepository.findAll());
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }





}
