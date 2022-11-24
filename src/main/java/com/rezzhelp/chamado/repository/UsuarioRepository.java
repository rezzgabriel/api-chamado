package com.rezzhelp.chamado.repository;

import com.rezzhelp.chamado.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByNome(String nome);

    @Query(nativeQuery = true, value = "" +
            "SELECT * FROM ti.usuario where username = :username AND password = :password")
    Usuario login(@Param("username") String username, @Param("password") String password);


}
