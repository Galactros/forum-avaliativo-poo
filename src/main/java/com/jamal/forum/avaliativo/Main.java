package com.jamal.forum.avaliativo;

import com.jamal.forum.avaliativo.service.ClienteService;
import com.jamal.forum.avaliativo.service.ProdutoService;

public class Main {

    public static void main(String[] args) {

        ClienteService clienteService = new ClienteService();

        ProdutoService produtoService = new ProdutoService();

        clienteService.clienteActions();
        produtoService.produtoActions();
    }
}
