package com.example.thymeleaf;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Produto {
    private String nomeProduto;
    private String descricao;
    private String valor;
    private String dataLancamento;
}

/*O nome do produto,
Uma descrição dele,
A data de lançamento e
Um valor para o mesmo.*/