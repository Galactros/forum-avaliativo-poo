package com.jamal.forum.avaliativo.model;

public class Cliente {

    private String CPF;
    private String Nome;
    private String Fone;
    private String Endereco;

    public Cliente(String CPF, String Nome, String Fone, String Endereco) {
        this.CPF = CPF;
        this.Nome = Nome;
        this.Fone = Fone;
        this.Endereco = Endereco;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getFone() {
        return Fone;
    }

    public void setFone(String Fone) {
        this.Fone = Fone;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

}
