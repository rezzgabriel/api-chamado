package com.rezzhelp.chamado.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "CHAMADO", schema = "TI")
@Data
@NoArgsConstructor
@SequenceGenerator(name = "chamado_id_chamado_seq", sequenceName = "chamado_id_chamado_seq", schema = "ti", allocationSize = 1)
public class Chamado {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "chamado_id_chamado_seq")
    @Column(name = "ID_CHAMADO")
    private Integer id;

    @Column(name = "DESCRICAO")
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "RESPONSAVEL")
    private Usuario responsavel;

    @Column(name = "STATUS")
    private Character status;

    @Column(name = "DTCRIACAO", columnDefinition = "DATE")
    private Date dtCriacao;

    @Column(name = "DTFECHAMENTO", columnDefinition = "DATE")
    private Date dtFechamento;

    @ManyToOne
    @JoinColumn(name = "SOLICITANTE")
    private Usuario solicitante;

    @Column(name = "SOLUCAO")
    private String solucao;

    @ManyToOne
    @JoinColumn(name = "CATEGORIA")
    private Categoria categoria;
}
