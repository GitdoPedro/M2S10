package com.example.thymeleaf.controller;

import com.example.thymeleaf.Pessoa;
import com.example.thymeleaf.Produto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/produtos")
public class ProdutosController {

   @GetMapping
    public String produtos(){
        return "produtos";
    }

    /*
    @GetMapping
    public String produtos(Model model,
                             @RequestParam String nomeProduto,
                             @RequestParam String descricao,
                             @RequestParam String valor,
                             @RequestParam String dataLancamento){
        model.addAttribute("nome",nomeProduto);
        model.addAttribute("descricao",descricao);
        model.addAttribute("valor",valor);
        model.addAttribute("dataLancamento",dataLancamento);
        return "produtos";
    }*/

   /* @GetMapping
    public String produtos(@RequestParam String nomeProduto,
                           @RequestParam String descricao,
                           @RequestParam String valor,
                           @RequestParam String dataLancamento){
        nomeProduto    = "Sabão";
        descricao      = "Serve para limpeza";
        valor          = "R$ 3,50";
        dataLancamento = "04/04/2022";
        return "produtos";
    }*/
}
