package Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public record Produto(long codigo, String nome, double preco, int quantidade) implements Comparable<Produto> {

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }

    @Override
    public int compareTo(Produto o) {
        return nome.compareToIgnoreCase(o.nome());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return codigo == produto.codigo;
    }
}
    class ComparatorPorPreco implements Comparator <Produto>{

        @Override
        public int compare(Produto o1, Produto o2) {
            return Double.compare(o1.preco(), o2.preco());
        }
    }
