package com.backend_obg_2.backend_obg_2.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend_obg_2.backend_obg_2.Entity.UsuarioRegular;
import com.backend_obg_2.backend_obg_2.Repository.UsuarioRegularRepository;

@RestController
@RequestMapping("/usuarioRegular")
//@CrossOrigin(origins = "http://localhost:3000")
@CrossOrigin(origins= "*")
public class UsuarioRegularController {

    @Autowired
    private UsuarioRegularRepository usuarioRegularRepository;

    @PostMapping
    public ResponseEntity<?> altaUsuarioRegular(@RequestBody UsuarioRegular UsuarioRegular){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(usuarioRegularRepository.save(UsuarioRegular));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }

     @PutMapping
    public ResponseEntity<?> modificacionUsuarioRegular(@RequestBody UsuarioRegular UsuarioRegular){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(usuarioRegularRepository.save(UsuarioRegular));
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminacionUsuarioRegular(@PathVariable int id){
        try {
            usuarioRegularRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body("Eliminado");
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }


     @GetMapping("/{id}")
    public ResponseEntity<?> conseguirUsuarioRegular(@PathVariable int id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(usuarioRegularRepository.findById(id));
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }

    @GetMapping
    public ResponseEntity<?> conseguirUsuarioRegulares(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(usuarioRegularRepository.findAll());
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }



}
