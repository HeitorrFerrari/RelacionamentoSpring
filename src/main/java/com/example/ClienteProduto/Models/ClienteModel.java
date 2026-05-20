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

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ProdutoModel> produtoModels;

}
