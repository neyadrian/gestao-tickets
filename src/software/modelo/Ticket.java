package software.modelo;

public class Ticket {
    private int id;
    private String descricao;
    private Prioridade prioridade;
    private static int contador = 1;

    public Ticket(String descricao, Prioridade prioridade) {
        this.id = contador++;
        setDescricao(descricao);
        this.prioridade = prioridade;
    }
}
