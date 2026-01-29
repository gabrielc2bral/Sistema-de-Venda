package com.gabrieldev.apiVendas.controllers;

import com.gabrieldev.apiVendas.entities.Usuario;
import com.gabrieldev.apiVendas.repositories.UsuarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/")
public class teste {

    private UsuarioRepository usuarioRepository;

    public teste(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    @PostMapping("/user")

    public Usuario teste2(Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    @GetMapping("/msg/{id}")
    public String teste(@PathVariable Long id){
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        return "Olá " + usuario.get().getNomeCompleto();
    }
}
