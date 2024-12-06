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

import com.backend_obg_2.backend_obg_2.Entity.Administrador;
import com.backend_obg_2.backend_obg_2.Repository.AdministradorRepository;
import com.backend_obg_2.backend_obg_2.Service.AdministradorService;


@RestController
@RequestMapping("/administrador")
@CrossOrigin(origins = "http://localhost:3000")

public class AdministradorController {
    
    @Autowired
    private AdministradorRepository administradorRepository;

    @Autowired
    private AdministradorService administradorService;

    @PostMapping
    public ResponseEntity<?> altaAdministrador(@RequestBody Administrador Administrador){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(administradorRepository.save(Administrador));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }

    @PutMapping
    public ResponseEntity<?> modificacionAdministrador(@RequestBody Administrador Administrador){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(administradorRepository.save(Administrador));
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminacionAdministrador(@PathVariable int id){
        try {
            administradorRepository.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body("Eliminado");
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<?> conseguirAdministrador(@PathVariable int id){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(administradorRepository.findById(id));
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }

    @GetMapping
    public ResponseEntity<?> conseguirAdministradores(){
        try {
            return ResponseEntity.status(HttpStatus.OK).body(administradorRepository.findAll());
        }
        catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginAdministrador(@RequestBody LoginRequest loginRequest) {
        try {
            Administrador admin = administradorService.login(loginRequest.getCorreo(), loginRequest.getContrasena());
            if (admin != null) {
                return ResponseEntity.status(HttpStatus.OK).body(admin);
            } else {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No encontrado");
            }
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Problema interno en el servidor");
        }
    }

    // Clase interna para manejar la solicitud de inicio de sesión
    public static class LoginRequest {
        private String correo;
        private String contrasena;

        // Getters y setters
        public String getCorreo() {
            return correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }

        public String getContrasena() {
            return contrasena;
        }

        public void setContrasena(String contrasena) {
            this.contrasena = contrasena;
        }
    }
}
