package desafio_dio_banco;

// Criação Classe Conta Poupança filha da Classe Conta
public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);

    }

    // Criação do Método para Imprimir Extrato da Conta Poupança
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupanca ===");
        super.imprimirInfosComuns();

    }
}
