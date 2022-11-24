package com.rezzhelp.chamado.repository;

import com.rezzhelp.chamado.entity.Chamado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChamadoRepository extends JpaRepository<Chamado, Integer> {

    @Query(nativeQuery = true, value = "" +
            "SELECT * FROM ti.chamado WHERE status = 'A'")
    List<Chamado> findAllChamadosAbertos();

    @Query(nativeQuery = true, value = "" +
            "SELECT * FROM ti.chamado WHERE status = 'F'")
    List<Chamado> findAllChamadosEncerrados();
}
