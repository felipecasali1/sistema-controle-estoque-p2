package main.models;

public class Estoque {
    private Integer quantidade;
    private Integer quantidadeMinima;

    public Estoque() {
        this.quantidade = 0;
        this.quantidadeMinima = 0;
    }

    public Estoque(Integer quantidade, Integer quantidadeMinima) {
        this.quantidade = quantidade;
        this.quantidadeMinima = quantidadeMinima;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(Integer quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }

    public void adicionarQuantidade(Integer quantidade) {
        this.quantidade += quantidade;
    }

    public void removerQuantidade(Integer quantidade) {
        this.quantidade -= quantidade;
    }

    public Boolean emitirAlerta() {
        return quantidadeMinima > quantidade;
    }

    public Boolean possuiEstoque() {
        return quantidade > 0;
    }
}