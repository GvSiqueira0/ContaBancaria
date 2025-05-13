public class ContaBancaria {

    // Atributos privados da conta bancária
    private int numeroConta;     // Número da conta
    private String titular;      // Nome do titular da conta
    private double saldo;        // Saldo atual da conta

    // Construtor: inicializa os atributos da conta com os valores fornecidos
    public ContaBancaria(int numeroConta, String titular, double saldo) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    // Retorna o número da conta
    public int getNumeroConta() {
        return numeroConta;
    }

    // Altera o número da conta
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    // Retorna o nome do titular
    public String getTitular() {
        return titular;
    }

    // Altera o nome do titular
    public void setTitular(String titular) {
        this.titular = titular;
    }

    // Retorna o saldo atual da conta
    public double getSaldo() {
        return saldo;
    }

    // Realiza um depósito, somando o valor ao saldo, desde que seja positivo
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    // Realiza um saque, subtraindo o valor do saldo, se possível
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true; // Saque bem-sucedido
        } else {
            return false; // Saque não realizado (valor inválido ou saldo insuficiente)
        }
    }
}
