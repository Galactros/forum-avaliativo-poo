package com.jamal.forum.avaliativo.service;

import com.jamal.forum.avaliativo.dao.PostgresConnection;
import com.jamal.forum.avaliativo.model.Produto;

public class ProdutoService {

    public void produtoActions() {

        Produto produto = new Produto(
                1, "Pano", 5.45);

        PostgresConnection app = new PostgresConnection();

        app.insertProduto(produto);

        System.out.println("Produto: " + produto.getNome() + " inserido");

        app.updateProduto(produto);

        System.out.println("Produto: " + produto.getNome() + " atualizado");

        app.deleteProduto(produto);

        System.out.println("Produto: " + produto.getNome() + " deletado");
    }

}
