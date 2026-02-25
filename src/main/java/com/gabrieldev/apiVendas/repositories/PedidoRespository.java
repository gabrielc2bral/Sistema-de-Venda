package com.gabrieldev.apiVendas.repositories;

import com.gabrieldev.apiVendas.dto.response.PedidoDtoResponse;
import com.gabrieldev.apiVendas.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PedidoRespository extends JpaRepository<Pedido, Long> {
    @Query("SELECT DISTINCT p FROM Pedido p " +
            "LEFT JOIN FETCH p.itemPedidos " +
            "JOIN FETCH p.usuario " +
            "JOIN FETCH p.vendedor " +
            "WHERE p.usuario.id = :usuarioId")
    List<Pedido> findByUsuarioComItens(@Param("usuarioId") Long usuarioId);
}
