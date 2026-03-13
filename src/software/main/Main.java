package software.main;

import software.gestao.GerenciadorTickets;
import software.modelo.Prioridade;
import software.modelo.Ticket;

public class Main {
    public static void main(String[] args) {
        GerenciadorTickets gerenciador = new GerenciadorTickets();

        gerenciador.adicionarTicket(new Ticket("problema no login", Prioridade.URGENTE));
        gerenciador.adicionarTicket(new Ticket("mudar a cor de um botão", Prioridade.BAIXA));
        gerenciador.adicionarTicket(new Ticket("sistema não está gerando PDF dos relatórios", Prioridade.ALTA));
        gerenciador.adicionarTicket(new Ticket("banco de dados com instabilidade", Prioridade.URGENTE));
        gerenciador.adicionarTicket(new Ticket("atualizar documentação", Prioridade.MEDIA));

        System.out.println("--- Lista de Tickets ---");
        gerenciador.ordenarEExibir();

        System.out.println("\nRemovendo Ticket de ID 2");
        gerenciador.removerTicket(2);

        System.out.println("Total de tickets criados: " + gerenciador.contarTotal());

        System.out.println("\n--- Lista Atualizada ---");
        gerenciador.ordenarEExibir();
    }
}