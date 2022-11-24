package com.rezzhelp.chamado.controller;

import com.rezzhelp.chamado.dto.ChamadoDTO;
import com.rezzhelp.chamado.entity.Chamado;
import com.rezzhelp.chamado.service.ChamadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chamado")
public class ChamadoController {

    @Autowired
    private ChamadoService chamadoService;

    @GetMapping()
    public List<Chamado> findAllChamados() {
        return this.chamadoService.findAllChamado();
    }

    @GetMapping("/abertos")
    public List<Chamado> findAllChamadosAbertos() {
        return this.chamadoService.findAllChamadoAbertos();
    }

    @GetMapping("/encerrados")
    public List<Chamado> findAllChamadosEncerrados() {
        return this.chamadoService.findAllChamadosEncerrados();
    }

    @GetMapping("/{id}")
    public Chamado findById(@PathVariable Integer id) {
        return this.chamadoService.findById(id);
    }

    @PostMapping()
    public Chamado createChamado(@RequestBody ChamadoDTO chamadoDTO) {
        return this.chamadoService.save(chamadoDTO);
    }

    @PutMapping("/solucao/{id}")
    public ResponseEntity<Chamado> solucionaChamado(@PathVariable Integer id, @RequestBody ChamadoDTO chamadoDTO) {
        Chamado solucaoChamado = chamadoService.solucionaChamado(id, chamadoDTO);
        return ResponseEntity.ok(solucaoChamado);
    }

}
