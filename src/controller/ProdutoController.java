package controller;

import models.Produto;
import persistence.ProdutoDao;

public class ProdutoController {
    private Produto produto;

    public ProdutoController(Produto produto) {
        this.produto = produto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public static Boolean salvar(Produto produto) {
        if(produto != null && ProdutoDao.buscarProduto(produto.getCodigo()) == null) {
            ProdutoDao.salvar(produto);
            return true;
        }
        return false;
    }

    public static Boolean excluir(Produto produto) {
        if(produto != null && ProdutoDao.contains(produto)){
            ProdutoDao.excluir(produto);
            return true;
        }
        return false;
    }

    public static Boolean editar(Integer codigo, Produto produtoMod) {
        if (produtoMod != null) {
            Produto prodE = ProdutoDao.buscarProduto(codigo);
            if (prodE != null) {
                ProdutoDao.editar(codigo, produtoMod);
                return true;
            }
        }
        return false;
    }
}
