package desafio_dio_banco;

// Criação Classe Conta Corrente filha da Classe Conta
public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);

    }

    // Criação do Método para Imprimir Extrato da Conta Corrente
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();

    }

}
