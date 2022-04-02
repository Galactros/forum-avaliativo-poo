package com.jamal.forum.avaliativo.service;

import com.jamal.forum.avaliativo.dao.PostgresConnection;
import com.jamal.forum.avaliativo.model.Produto;

public class ProdutoService {

    public void produtoActions() {

        Produto produto = new Produto(
                1, "Pano", 5.45);

        PostgresConnection app = new PostgresConnection();

        app.insertProduto(produto);

        System.out.println("Executando Select Geral na Tabela de Cliente");

        app.selectFullProduto();

        System.out.println("Executando Select especifico na Tabela de Cliente");

        app.selectProduto(produto);

        app.updateProduto(produto);

        app.deleteProduto(produto);
    }

}
