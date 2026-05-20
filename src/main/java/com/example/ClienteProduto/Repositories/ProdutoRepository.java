package com.example.ClienteProduto.Repositories;

import com.example.ClienteProduto.Models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
}
