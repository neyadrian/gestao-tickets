package software.modelo;

public class Prioridade {
    public enum TipoPrioridade {
        BAIXA(72),
        MEDIA(48),
        ALTA(24),
        URGENTE(4);

        private final int prazoHoras;

        Prioridade(int prazoHoras) {
            this.prazoHoras = prazoHoras;
        }

        public int getPrazoHoras() {
            return prazoHoras;
        }
    }
}