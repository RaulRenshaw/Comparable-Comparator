package Set.OperacoesBasicas;

public class Main {
    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        System.out.println(conjuntoConvidados.contarConvidados());

        conjuntoConvidados.adicionarConvidado("1",1234);
        conjuntoConvidados.adicionarConvidado("2",1235);
        conjuntoConvidados.adicionarConvidado("3",1234);
        conjuntoConvidados.adicionarConvidado("4",1236);
        System.out.println(conjuntoConvidados.contarConvidados());

        conjuntoConvidados.exibirConvidados();
    }
}
