package desafio_dio_banco;

// Criação da Classe Main
public class Main {

    public static void main(String[] args) {
        // Criar variável novoCliente passando como valor o nome "Joice"
        Cliente novoCliente = new Cliente();
        novoCliente.setNome("Joice");

        // Criar variável Conta Corrente com a variável novoCliente como parâmetro
        Conta cc = new ContaCorrente(novoCliente);

        // Atribuir valor 100 na variável cc usando o método depositar
        cc.depositar(100);

        // Criar variável Conta Poupança com a variável novoCliente como parâmetro
        Conta cp = new ContaPoupanca(novoCliente);

        /*
         * Subtraindo o valor 100 da variável cc e atribuindo a variável cp
         * usando o método transferir.
         */
        cc.transferir(100, cp);

        // Chamando o método imprimirExtrato, para exibir o saldo das contas
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
