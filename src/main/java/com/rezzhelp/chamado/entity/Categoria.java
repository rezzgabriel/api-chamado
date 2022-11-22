package com.rezzhelp.chamado.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "CATEGORIA", schema = "TI")
@Data
@NoArgsConstructor
@SequenceGenerator(name = "categoria_id_categoria_seq", sequenceName = "categoria_id_categoria_seq", schema = "ti", allocationSize = 1)
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "categoria_id_categoria_seq")
    @Column(name = "ID_CATEGORIA")
    private Integer id;

    @Column(name = "DESCRICAO")
    private String descricao;
}
