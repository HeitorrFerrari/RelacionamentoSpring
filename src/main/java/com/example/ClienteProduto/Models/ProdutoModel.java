package com.example.ClienteProduto.Models;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "TBL_PRODUTO")

public class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private double preco;

    @ManyToOne
    private ClienteModel clienteModel;

}
