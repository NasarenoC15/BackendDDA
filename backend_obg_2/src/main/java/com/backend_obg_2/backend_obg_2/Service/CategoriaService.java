package com.backend_obg_2.backend_obg_2.Service;

import java.util.List;

import com.backend_obg_2.backend_obg_2.Entity.Categoria;

public interface CategoriaService {
    public Categoria agregarCategoria(Categoria c);
    public boolean eliminarCategoria(int id);
    public Categoria modificarCategoria(Categoria c);
    public Categoria conseguir(int id);
    public List<Categoria> listar();

}



