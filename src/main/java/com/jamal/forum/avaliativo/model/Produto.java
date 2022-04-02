package com.jamal.forum.avaliativo.model;

public class Produto {

    private int Codigo;
    private String Nome;
    private double Preco;

    public Produto(int Codigo, String Nome, double Preco) {
        this.Codigo = Codigo;
        this.Nome = Nome;
        this.Preco = Preco;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double Preco) {
        this.Preco = Preco;
    }

}
