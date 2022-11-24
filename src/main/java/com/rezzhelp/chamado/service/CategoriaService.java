package com.rezzhelp.chamado.service;

import com.rezzhelp.chamado.dto.CategoriaDTO;
import com.rezzhelp.chamado.dto.UsuarioDTO;
import com.rezzhelp.chamado.entity.Categoria;
import com.rezzhelp.chamado.entity.Usuario;
import com.rezzhelp.chamado.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> findAllCategorias() {
        return this.categoriaRepository.findAll();
    }

    public Categoria save(CategoriaDTO categoriaDTO) {
        Categoria categoria = new Categoria(categoriaDTO);
        return this.categoriaRepository.save(categoria);
    }
}
