package com.gabrieldev.apiVendas.controllers;

import com.gabrieldev.apiVendas.dto.request.UsuarioDtoRequest;
import com.gabrieldev.apiVendas.dto.response.UsuarioDtoResponse;
import com.gabrieldev.apiVendas.services.UsuarioService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    private UsuarioService usuarioService;

    @PostMapping
    public ResponseEntity<UsuarioDtoResponse> criar(@Valid @RequestBody UsuarioDtoRequest dto){
        UsuarioDtoResponse usuarioDtoResponse =  usuarioService.cadastrarUsuario(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioDtoResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UsuarioDtoResponse> buscarUsuario(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.buscarUsuario(id));
    }
    @GetMapping("/me")
    public String usuarioLogado(Authentication authentication) {
        return authentication.getName();
    }
    /*
        @GetMapping
        Desabilitando esse endpoint porque vai dar erro com o hibernate "org.hibernate.loader.MultipleBagFetchException"
        Poderia usar um set (não é uma bag igual ao list)
        Não é ideal a forma que o endpoint está retornando tudo do dto, deveria separar os endpoints em:

        /usuarios
        /usuarios/{id}/pedidos
        /pedidos/{id}/itens
     */
    @GetMapping
    public List<UsuarioDtoResponse> buscarTodos(){
        return usuarioService.buscarTodos();
    }

}
