import java.util.ArrayList;
import java.util.List;

public class ContaBancaria {
    private int numeroConta;
    private String titular;
    private double saldo;
    private List<String> historico;

    public ContaBancaria(int numeroConta, String titular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldoInicial;
        this.historico = new ArrayList<>();
        this.historico.add("Conta criada com saldo inicial de: " + saldoInicial);
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            this.historico.add("Depósito de " + valor);
        } else {
            this.historico.add("Tentativa de depósito inválida (valor negativo)");
        }
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            this.historico.add("Saque de " + valor);
        } else {
            this.historico.add("Tentativa de saque falha: Saldo insuficiente");
        }
    }

    public void imprimirExtrato() {
        System.out.println("--- Extrato da Conta: " + numeroConta + " (" + titular + ") ---");
        for (String operacao : historico) {
            System.out.println("- " + operacao);
        }
        System.out.println("Saldo Atual: R$ " + this.saldo);
        System.out.println("---------------------------------------------------------");
    }

    public double getSaldo() {
        return saldo;
    }
}
