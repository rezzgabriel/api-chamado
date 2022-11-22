package com.rezzhelp.chamado.service;

import com.rezzhelp.chamado.dto.UsuarioDTO;
import com.rezzhelp.chamado.entity.Usuario;
import com.rezzhelp.chamado.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> findAllUsuarios() {
        return this.usuarioRepository.findAll();
    }

    public Usuario save(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario(usuarioDTO);
        return this.usuarioRepository.save(usuario);
    }
}
