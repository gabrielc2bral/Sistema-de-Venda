package com.gabrieldev.apiVendas.repositories;

import com.gabrieldev.apiVendas.entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
