package com.rezzhelp.chamado.dto;

import com.rezzhelp.chamado.entity.Setor;
import com.rezzhelp.chamado.entity.Usuario;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UsuarioDTO {
    private Integer id;
    private String nome;
    private String username;
    private String password;
    private Setor setor;


}
