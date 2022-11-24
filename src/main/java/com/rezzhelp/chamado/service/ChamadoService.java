package com.rezzhelp.chamado.service;

import com.rezzhelp.chamado.dto.ChamadoDTO;
import com.rezzhelp.chamado.entity.Categoria;
import com.rezzhelp.chamado.entity.Chamado;
import com.rezzhelp.chamado.entity.Usuario;
import com.rezzhelp.chamado.repository.CategoriaRepository;
import com.rezzhelp.chamado.repository.ChamadoRepository;
import com.rezzhelp.chamado.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class ChamadoService {

    @Autowired
    private ChamadoRepository chamadoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;


    public List<Chamado> findAllChamado() {
        return this.chamadoRepository.findAll();
    }

    public List<Chamado> findAllChamadoAbertos() {
        return this.chamadoRepository.findAllChamadosAbertos();
    }

    public List<Chamado> findAllChamadosEncerrados() {
        return this.chamadoRepository.findAllChamadosEncerrados();
    }

    public Chamado save (ChamadoDTO chamadoDTO) {
//        Categoria categoria = categoriaRepository.findById(chamadoDTO.getCategoria()).orElseThrow();
//        Usuario solicitante = usuarioRepository.findById(chamadoDTO.getSolicitante()).orElseThrow();
        Chamado chamado = new Chamado(chamadoDTO);
        chamado.setDtCriacao(new Date());
        chamado.setStatus('A');
//        chamado.setSolicitante(solicitante);
//        chamado.setCategoria(categoria);
        return this.chamadoRepository.save(chamado);
    }

    public Chamado findById(Integer id) {
        return chamadoRepository.findById(id).orElseThrow();
    }

    public Chamado solucionaChamado(Integer id, ChamadoDTO chamadoDTO) {
        Chamado chamado = this.findById(id);
//        Usuario responsavel = usuarioRepository.findById(chamadoDTO.getResponsavel()).orElseThrow();

        if (chamadoDTO.getSolucao() != null) {
            chamado.setSolucao(chamadoDTO.getSolucao());
        }
        if (chamadoDTO.getResponsavel() != null) {
            chamado.setResponsavel(chamadoDTO.getResponsavel());
        }
        chamado.setStatus('F');
        chamado.setDtFechamento(new Date());

        return chamadoRepository.save(chamado);
    }
}
