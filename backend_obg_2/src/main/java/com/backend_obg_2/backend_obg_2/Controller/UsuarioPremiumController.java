package com.backend_obg_2.backend_obg_2.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;

import com.backend_obg_2.backend_obg_2.Entity.UsuarioPremium;
import com.backend_obg_2.backend_obg_2.Repository.UsuarioPremiumRepository;

@RestController
@RequestMapping("/usuarioPremium")
@CrossOrigin(origins = "http://localhost:3000")

public class UsuarioPremiumController {

    @Autowired
    private UsuarioPremiumRepository usuarioPremiumRepository;

    @PostMapping
    public ResponseEntity<?> altaUsuarioPremium(@RequestBody UsuarioPremium UsuarioPremium){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(usuarioPremiumRepository.save(UsuarioPremium));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }

    @PutMapping
    public ResponseEntity<?> modificacionUsuarioPremium(@RequestBody UsuarioPremium UsuarioPremium){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(usuarioPremiumRepository.save(UsuarioPremium));
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminacionUsuarioPremium(@PathVariable int id){
        try {
            usuarioPremiumRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body("Eliminado");
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<?> conseguirUsuarioPremium(@PathVariable int id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(usuarioPremiumRepository.findById(id));
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }

    @GetMapping
    public ResponseEntity<?> conseguirUsuarioPremiums(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(usuarioPremiumRepository.findAll());
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }


    
}
