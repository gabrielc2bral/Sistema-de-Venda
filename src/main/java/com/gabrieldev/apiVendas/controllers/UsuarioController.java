package com.gabrieldev.apiVendas.controllers;

import com.gabrieldev.apiVendas.dto.request.UsuarioDtoRequest;
import com.gabrieldev.apiVendas.dto.response.UsuarioDtoResponse;
import com.gabrieldev.apiVendas.services.UsuarioService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<UsuarioDtoResponse> criar(@Valid @RequestBody UsuarioDtoRequest dto){
        UsuarioDtoResponse usuarioDtoResponse =  usuarioService.criarUsuario(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioDtoResponse);
    }

}
