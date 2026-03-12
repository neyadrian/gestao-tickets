public class Main {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria(123, "João Silva", 500.0);

        minhaConta.depositar(200.0);
        minhaConta.sacar(1000.0);
        minhaConta.sacar(300.0);

        minhaConta.imprimirExtrato();
    }
}