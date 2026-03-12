package software.modelo;

public class Ticket {

    public static final String SISTEMA_SUPORTE = "SISTEMA_SUPORTE_V1";

    private int id;
    private String descricao;
    private Prioridade prioridade;
    private static int contador = 1;

    public Ticket(String descricao, Prioridade prioridade) {
        this.id = contador++;
        setDescricao(descricao);
        this.prioridade = prioridade;
    }

    public String exibirDetalhes() {
        return String.format(
                "[%s] Ticket ID: %d | Descrição: %s | Prioridade: %s | Prazo: %dh",
                SISTEMA_SUPORTE,
                this.id,
                this.descricao,
                this.prioridade,
                this.prioridade.getPrazoHoras()
        );
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(descricao != null && !descricao.trim().isEmpty()) {
            this.descricao = descricao;
        } else {
            System.out.println("A descriçãp não pode ser vazia.");
        }
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }
}
