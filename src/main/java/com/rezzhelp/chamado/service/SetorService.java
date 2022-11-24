package com.rezzhelp.chamado.service;

import com.rezzhelp.chamado.dto.SetorDTO;
import com.rezzhelp.chamado.entity.Setor;
import com.rezzhelp.chamado.repository.SetorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SetorService {

    @Autowired
    private SetorRepository setorRepository;

    public List<Setor> findAllSetores() {
        return this.setorRepository.findAll();
    }

    public Setor save(SetorDTO setorDTO) {
        Setor setor = new Setor(setorDTO);
        return this.setorRepository.save(setor);
    }
}
