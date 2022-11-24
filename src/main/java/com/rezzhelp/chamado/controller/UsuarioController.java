package com.rezzhelp.chamado.controller;

import com.rezzhelp.chamado.dto.UsuarioDTO;
import com.rezzhelp.chamado.entity.Usuario;
import com.rezzhelp.chamado.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping()
    public List<Usuario> findAllUsuarios() {
        return this.usuarioService.findAllUsuarios();
    }

    @GetMapping("/{id}")
    public Usuario findById(@PathVariable Integer id) {
        return this.usuarioService.findById(id);
    }

    @PostMapping()
    public Usuario createUsuario(@RequestBody UsuarioDTO usuarioDTO) {
        return this.usuarioService.save(usuarioDTO);
    }


}
