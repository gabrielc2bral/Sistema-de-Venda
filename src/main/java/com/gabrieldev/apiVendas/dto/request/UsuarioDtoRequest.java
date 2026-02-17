package com.gabrieldev.apiVendas.dto.request;

import com.gabrieldev.apiVendas.entities.TipoDeConta;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDtoRequest {
    @NotBlank
    @Size(max = 100)
    private String nomeCompleto;

    @NotBlank
    @Email(message = "Email inválido")
    @Size(max = 150)
    private String email;

    @NotBlank
    @Size(min = 8, max = 255)
    private String senha;

    @NotBlank
    @Pattern(regexp = "^\\d{11}$", message = "CPF deve conter 11 dígitos")
    private String cpf;

    private TipoDeConta tipoDeConta;

}
