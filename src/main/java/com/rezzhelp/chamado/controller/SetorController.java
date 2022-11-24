package com.rezzhelp.chamado.controller;

import com.rezzhelp.chamado.dto.SetorDTO;
import com.rezzhelp.chamado.entity.Setor;
import com.rezzhelp.chamado.service.SetorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/setor")
public class SetorController {

    @Autowired
    private SetorService setorService;

    @GetMapping
    public List<Setor> findAllSetores() {
        return this.setorService.findAllSetores();
    }

    @PostMapping
    public Setor createSetor(@RequestBody SetorDTO setorDTO) {
        return this.setorService.save(setorDTO);
    }
}
