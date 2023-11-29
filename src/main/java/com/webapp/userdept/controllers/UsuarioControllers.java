package com.webapp.userdept.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.userdept.entity.Usuario;
import com.webapp.userdept.repositories.UsuarioRepository;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioControllers {

    @Autowired
    private UsuarioRepository repositorio;

    @GetMapping
    public List<Usuario> findAll() {
        List<Usuario> resultado = repositorio.findAll();
        return resultado;
    };

    @GetMapping(value = "/{id}")
    public Usuario findById(@PathVariable Long id) {
        /* try {
            Usuario resultado = repositorio.findById(id).get();
            return resultado;
        } catch(Exception erro) {
            return null;
        } */

        Usuario resultado = repositorio.findById(id).get();
        return resultado;
    };

    @PostMapping
    public Usuario insert(@RequestBody Usuario usuario) {
        Usuario resultado = repositorio.save(usuario);
        return resultado;
    }
};