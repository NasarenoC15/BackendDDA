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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.backend_obg_2.backend_obg_2.Entity.VideoJuego;

import com.backend_obg_2.backend_obg_2.Repository.VideoJuegoRepository;

@RestController
@RequestMapping("/videojuego")
//@CrossOrigin(origins = "http://localhost:3000")
@CrossOrigin(origins= "*")
public class videoJuegoController {
    
    @Autowired
    private VideoJuegoRepository videojuegoRepository;

    @PostMapping
    public ResponseEntity<?> altaVideoJuego(@RequestBody VideoJuego juego){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(videojuegoRepository.save(juego));
        }catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }

    @PutMapping
    public ResponseEntity<?> modificacionVideoJuego(@RequestBody VideoJuego juego){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(videojuegoRepository.save(juego));
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminacionVideoJuego(@PathVariable int id){
        try {
            videojuegoRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body("Eliminado");
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }

   
    @GetMapping("/{id}")
    public ResponseEntity<?> conseguirVideoJuego(@PathVariable String id){
        try {
            int idInt = Integer.parseInt(id);
            return ResponseEntity.status(HttpStatus.OK).body(videojuegoRepository.findById(idInt));
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }

    
    @GetMapping
    public ResponseEntity<?> conseguirVideoJuegos(){
        try {
            
            return ResponseEntity.status(HttpStatus.OK).body(videojuegoRepository.findAll());
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }

    @PostMapping("/stock")
    public ResponseEntity<?> modificarStock(@RequestParam int id, @RequestParam int stock){
        try {
            VideoJuego juego = videojuegoRepository.findById(id).orElseThrow(() -> new RuntimeException("VideoJuego no encontrado"));
            juego.setStock(stock);
            return ResponseEntity.status(HttpStatus.OK).body(videojuegoRepository.save(juego));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }


}
