package software.modelo;

public class Ticket implements Comparable<Ticket> {
    public static final String SISTEMA_NOME = "SISTEMA_SUPORTE_V1";
    private static int contador = 1;

    private int id;
    private String descricao;
    private Prioridade prioridade;

    public Ticket(String descricao, Prioridade prioridade) {
        this.id = contador++;
        setDescricao(descricao);
        this.prioridade = prioridade;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("Descrição não pode ser vazia.");
        }
        this.descricao = descricao;
    }

    public Prioridade getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade) {
        this.prioridade = prioridade;
    }

    public String exibirDetalhes() {
        return String.format("(%s) ID: %d | Prioridade: %s | Prazo: %dh | Descrição: %s",
                SISTEMA_NOME, id, prioridade, prioridade.getPrazoHoras(), descricao);
    }

    public static int getContador() {
        return contador - 1;
    }

    @Override
    public int compareTo(Ticket outro) {

        return outro.prioridade.ordinal() - this.prioridade.ordinal();
    }
}