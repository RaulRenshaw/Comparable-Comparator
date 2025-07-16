package Set.Pesquisa;

import java.util.*;

public class AgendaContato {
    private Set<Contato> contatoSet;

    public AgendaContato() {
        this.contatoSet = new HashSet<>();
    }
    public void adicionarContato(String nome, int telefone){
        contatoSet.add(new Contato(nome,telefone));
    }
    public Set<Contato> exibirContato(){
        return contatoSet;
    }
    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for (Contato contato : contatoSet){
            if (contato.getNome().startsWith(nome)){
                contatoPorNome.add(contato);
            }
        }
        return contatoPorNome;
    }
    public Contato atualizarNumeroContato(String nome, int novotelefone){
        Contato contatoAtualizado = null;
        for (Contato contato : contatoSet){
            if (contato.getNome().equalsIgnoreCase(nome)){
                contato.setTelefone(novotelefone);
                contatoAtualizado = contato;
                break;
            }
        }
        return contatoAtualizado;
    }
}
