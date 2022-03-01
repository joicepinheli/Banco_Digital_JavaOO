package desafio_dio_banco;

// Criação da Classe de Interface IConta 
public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();

}
