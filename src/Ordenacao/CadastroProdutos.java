package Ordenacao;

import java.util.*;

public class CadastroProdutos {
    Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }
    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }
    public Set<Produto> exibirProdutos(){
        return new TreeSet<>(produtoSet);
    }
    public Set<Produto> exibirPorPreco(){
        Set<Produto> ordenadoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoSet.addAll(produtoSet);
        return ordenadoPorPreco;
    }
}
