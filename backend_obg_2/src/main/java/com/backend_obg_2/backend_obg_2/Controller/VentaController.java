package com.backend_obg_2.backend_obg_2.Controller;

import java.time.LocalDate;

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

import com.backend_obg_2.backend_obg_2.Entity.UsuarioPremium;
import com.backend_obg_2.backend_obg_2.Entity.UsuarioRegular;
import com.backend_obg_2.backend_obg_2.Entity.Venta;
import com.backend_obg_2.backend_obg_2.Repository.UsuarioPremiumRepository;
import com.backend_obg_2.backend_obg_2.Repository.UsuarioRegularRepository;
import com.backend_obg_2.backend_obg_2.Repository.VentaRepository;



@RestController
@RequestMapping("/venta")
//@CrossOrigin(origins = "http://localhost:3000")
@CrossOrigin(origins= "*")
public class VentaController {
    

     @Autowired
    private VentaRepository ventaRepository;

    @Autowired
    private UsuarioRegularRepository usuarioregularRepository;
    @Autowired
    private UsuarioPremiumRepository usuariopremiumRepository;

    @PostMapping
    public ResponseEntity<?> altaVenta(@RequestBody Venta venta){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(ventaRepository.save(venta));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e);
        }
    }


     @PutMapping
    public ResponseEntity<?> modificacionVenta(@RequestBody Venta venta){
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

    @GetMapping("/usuario/{id}")
    public ResponseEntity<?> conseguirVentaPorUsuario(@PathVariable int id){
        try {
           try{
            UsuarioRegular usuarioregular = new UsuarioRegular();
            usuarioregular = usuarioregularRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario not found"));
            return ResponseEntity.status(HttpStatus.OK).body(ventaRepository.findByPersona(usuarioregular));
           }catch(Exception e){
            try{
                UsuarioPremium usuariopremium = new UsuarioPremium();
                usuariopremium = usuariopremiumRepository.findById(id).orElseThrow(() -> new RuntimeException("Usuario not found"));
                return ResponseEntity.status(HttpStatus.OK).body(ventaRepository.findByPersona(usuariopremium));
            }
            catch(Exception e2){
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Usuario no encontrado");
            }
           }
        }
        catch (Exception e3) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }
    
    @GetMapping("/fecha/{fecha}")
    public ResponseEntity<?> conseguirVentaPorFecha(@PathVariable String fecha){
        try {
            try{
                LocalDate fechaMod = LocalDate.parse(fecha);
                 return ResponseEntity.status(HttpStatus.OK).body(ventaRepository.findByFechacompra(fechaMod));
        
            }
            catch(Exception e){
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Fecha no valida");
            }
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }
}
    