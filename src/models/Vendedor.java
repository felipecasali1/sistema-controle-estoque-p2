package models;

public class Vendedor {
    private String nome;
    private String cpf;

    public Vendedor() {
        this.nome = "";
        this.cpf = "";
    }

    public Vendedor(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}