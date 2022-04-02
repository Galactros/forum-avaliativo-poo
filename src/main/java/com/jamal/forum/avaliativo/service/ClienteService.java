package com.jamal.forum.avaliativo.service;

import com.jamal.forum.avaliativo.dao.PostgresConnection;
import com.jamal.forum.avaliativo.model.Cliente;

public class ClienteService {

    public void clienteActions() {

        Cliente cliente = new Cliente(
                "025029858731", "Alex Cruzeiro", "62  82743-94343", "Rua Euer, Quadra 333, Gostol log");

        PostgresConnection app = new PostgresConnection();

        app.insertCliente(cliente);

        System.out.println("Cliente: " + cliente.getNome() + " inserido");

        app.updateCliente(cliente);

        System.out.println("Cliente: " + cliente.getNome() + " atualizado");

        app.deleteCliente(cliente);

        System.out.println("Cliente: " + cliente.getNome() + " deletado");
    }

}
