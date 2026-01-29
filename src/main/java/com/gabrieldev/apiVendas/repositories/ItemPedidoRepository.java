package com.gabrieldev.apiVendas.repositories;

import com.gabrieldev.apiVendas.entities.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Long> {
}
