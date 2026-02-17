package com.gabrieldev.apiVendas.entities;

import com.gabrieldev.apiVendas.entities.enun.Role;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Poderia colocar um uuid no futuro
    private Long id;

    private String nomeCompleto;

    private String cpf;

    @Enumerated(EnumType.STRING)
    private TipoDeConta tipoDeConta;

    private String email;

    private String senha;
    @Enumerated(EnumType.STRING)
    private Role role;

    @OneToMany(mappedBy = "usuario", fetch = FetchType.LAZY)
    private List<Pedido> pedidos;

    public String getNomeCompleto() {
        return nomeCompleto;
    }
}
