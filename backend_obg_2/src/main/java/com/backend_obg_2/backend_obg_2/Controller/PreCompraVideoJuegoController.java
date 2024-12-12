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

import com.backend_obg_2.backend_obg_2.Entity.Categoria;
import com.backend_obg_2.backend_obg_2.Entity.PreCompraVideoJuego;
import com.backend_obg_2.backend_obg_2.Entity.VideoJuego;
import com.backend_obg_2.backend_obg_2.Repository.CategoriaRepository;
import com.backend_obg_2.backend_obg_2.Repository.PreCompraVideoJuegoRepository;
import com.backend_obg_2.backend_obg_2.Repository.VideoJuegoRepository;
import com.backend_obg_2.backend_obg_2.Repository.PreCompraVideoJuegoRepository;



@RestController
@RequestMapping("/precompra")
//@CrossOrigin(origins = "http://localhost:3000")
@CrossOrigin(origins= "*")
public class PreCompraVideoJuegoController {
    
     @Autowired
    private PreCompraVideoJuegoRepository PreCompraVideoJuegoRepository;

    @Autowired
    private VideoJuegoRepository videoJuegoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @PostMapping
public ResponseEntity<?> altaPreCompraVideoJuego(@RequestBody PreCompraVideoJuego preCompraVideoJuego){
    try {
        // Retrieve the VideoJuego from the database
        VideoJuego videoJuego = videoJuegoRepository
            .findById(preCompraVideoJuego.getVideoJuego().getId())
            .orElseThrow(() -> new RuntimeException("VideoJuego not found"));

            // Retrieve Categoria if necessary
        Categoria categoria = categoriaRepository
        .findById(videoJuego.getCategoria().getId())
        .orElseThrow(() -> new RuntimeException("Categoria not found"));

        videoJuego.setCategoria(categoria);

        // Set the managed VideoJuego to PreCompraVideoJuego
        preCompraVideoJuego.setVideoJuego(videoJuego);

        // Save PreCompraVideoJuego
        PreCompraVideoJuego savedPreCompra = PreCompraVideoJuegoRepository.save(preCompraVideoJuego);

        return ResponseEntity.status(HttpStatus.OK).body(savedPreCompra);
    } catch (Exception e) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e);
    }
}

     @PutMapping
    public ResponseEntity<?> modificacionPreCompra(@RequestBody PreCompraVideoJuego PreCompraVideoJuego){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(PreCompraVideoJuegoRepository.save(PreCompraVideoJuego));
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminacionPreCompraVideoJuego(@PathVariable int id){
        try {
            PreCompraVideoJuegoRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body("Eliminado");
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> conseguirPreCompraVideoJuego(@PathVariable int id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(PreCompraVideoJuegoRepository.findById(id));
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }

    @GetMapping
    public ResponseEntity<?> conseguirPreCompraVideoJuego(){
        try {
            
            return ResponseEntity.status(HttpStatus.OK).body(PreCompraVideoJuegoRepository.findAll());
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }

}
