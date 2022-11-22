package com.rezzhelp.chamado.service;

import com.rezzhelp.chamado.repository.ChamadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChamadoService {

    @Autowired
    private ChamadoRepository chamadoRepository;
}
