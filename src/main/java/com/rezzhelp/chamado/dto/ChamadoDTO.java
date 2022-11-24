package com.rezzhelp.chamado.dto;

import com.rezzhelp.chamado.entity.Categoria;
import com.rezzhelp.chamado.entity.Usuario;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

@Data
@NoArgsConstructor
public class ChamadoDTO {
    private Integer id;
    private String descricao;
    private Usuario responsavel;
    private Character status;
    private Date dtCriacao;
    private Date dtFechamento;
    private Usuario solicitante;
    private String solucao;
    private Categoria categoria;
}
