package com.rezzhelp.chamado.entity;

import com.rezzhelp.chamado.dto.UsuarioDTO;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Table(name = "USUARIO", schema = "TI")
@Entity
@SequenceGenerator(name = "usuario_id_usuario_seq", sequenceName = "usuario_id_usuario_seq", schema = "ti", allocationSize = 1)
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_id_usuario_seq")
    @Column(name = "id_usuario")
    private Integer id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "USERNAME")
    private String username;

    @Column(name = "PASSWORD")
    private String password;

    @ManyToOne
    @JoinColumn(name = "ID_SETOR")
    private Setor setor;

    public Usuario(UsuarioDTO dado) {
        this.id = dado.getId();
        this.nome = dado.getNome();
        this.username = dado.getUsername();
        this.password = dado.getPassword();
        this.setor = dado.getSetor();
    }
}
