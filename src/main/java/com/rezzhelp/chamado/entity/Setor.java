package com.rezzhelp.chamado.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "SETOR", schema = "TI")
@Data
@NoArgsConstructor
@SequenceGenerator(name = "setor_id_setor_seq", sequenceName = "setor_id_setor_seq", schema = "ti", allocationSize = 1)
public class Setor {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "setor_id_setor_seq")
    @Column(name = "ID_SETOR")
    private Integer id;

    @Column(name = "DESCRICAO")
    private String descricao;
}
