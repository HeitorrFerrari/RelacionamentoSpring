package com.example.ClienteProduto.Repositories;

import com.example.ClienteProduto.Models.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {
}
