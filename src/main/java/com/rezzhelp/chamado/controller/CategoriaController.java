package com.rezzhelp.chamado.controller;

import com.rezzhelp.chamado.dto.CategoriaDTO;
import com.rezzhelp.chamado.dto.UsuarioDTO;
import com.rezzhelp.chamado.entity.Categoria;
import com.rezzhelp.chamado.entity.Usuario;
import com.rezzhelp.chamado.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categoria")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping()
    public List<Categoria> findAllCategorias() {
        return this.categoriaService.findAllCategorias();
    }

    @PostMapping()
    public Categoria createUsuario(@RequestBody CategoriaDTO categoriaDTO) {
        return this.categoriaService.save(categoriaDTO);
    }
}
