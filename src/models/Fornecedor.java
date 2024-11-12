package models;

import persistence.FornecedorDao;

public class Fornecedor {
    private String nome;
    private String cnpj;

    public Fornecedor() {
        this.nome = "";
        this.cnpj = "";
    }

    public Fornecedor(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return nome;
    }
}
