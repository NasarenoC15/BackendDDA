package com.backend_obg_2.backend_obg_2.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.Task;

import com.backend_obg_2.backend_obg_2.Entity.Categoria;
import com.backend_obg_2.backend_obg_2.Repository.CategoriaRepository;

public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria agregarCategoria(Categoria c){
        return categoriaRepository.save(c);
    }

    public boolean eliminarCategoria(int id){
        if(categoriaRepository.existsById(id)){
            categoriaRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public Categoria modificarCategoria(Categoria c){
        if(categoriaRepository.existsById(c.getId())){
            return categoriaRepository.save(c);
        }
        return null;
    }

    public Categoria conseguir(int id){
        Optional<Categoria> opcional = categoriaRepository.findById(id);
        
        if(opcional.isPresent()){
            return opcional.get();
        }

        return null;
    }

    public List<Categoria> listar(){
        return categoriaRepository.findAll();
    }
}
