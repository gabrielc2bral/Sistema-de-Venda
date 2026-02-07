package com.gabrieldev.apiVendas.dto.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UsuarioDtoResponse {
    private String nomeCompleto;
    private String cpf;
}
