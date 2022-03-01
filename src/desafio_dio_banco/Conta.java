package desafio_dio_banco;

// Criação da Classe abstrata Conta implementando a Classe IConta
public abstract class Conta implements IConta {

    // Definindo as variável estática Agência Padrão e Sequencial
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    // Criar Método para Definir a Conta do Cliente
    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    // Definir Método Sacar
    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    // Definir Método Depositar
    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    // Definir Método Transferir
    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    // Criação do Método imprimirInfosComuns (Extrato)
    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
