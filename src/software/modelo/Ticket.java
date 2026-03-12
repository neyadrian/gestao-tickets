package software.modelo;

public class Ticket {
    private int id;
    private String descricao;
    private Prioridade prioridade;
    private static int contador = 1;

    public Ticket(String descricao, Prioridade prioridade) {
        this.descricao = descricao;
        this.prioridade = prioridade;
    }
}
