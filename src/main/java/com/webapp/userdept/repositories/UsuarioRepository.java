package com.webapp.userdept.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import com.webapp.userdept.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
};