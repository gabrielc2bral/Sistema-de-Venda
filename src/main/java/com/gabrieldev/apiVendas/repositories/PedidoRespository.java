package com.gabrieldev.apiVendas.repositories;

import com.gabrieldev.apiVendas.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRespository extends JpaRepository<Pedido, Long> {
}
