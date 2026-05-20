package com.example.ClienteProduto.Models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "TBL_CLIENTE")

public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomeCliente;

    @OneToMany
    private List<ProdutoModel> produtoModels;

}
