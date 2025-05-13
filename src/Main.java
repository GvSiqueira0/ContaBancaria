//Obs: GPT usado para comentar de forma clara e direta apenas
// Criei o exibirConta para deixar o codigo menor para não deixar duplicado

public class Main {
    public static void main(String[] args) {
        // Criação de dois objetos do tipo ContaBancaria
        ContaBancaria c1 = new ContaBancaria(1910, "Gabriel", 1000.00);
        ContaBancaria c2 = new ContaBancaria(1210, "Maria", 15000.00);

        // Exibição das informações da primeira conta
        exibirConta(c1);

        // Linha separadora visual
        System.out.print("***********************************");

        // Exibição das informações da segunda conta
        exibirConta(c2);
    }


 //    Método auxiliar para exibir dados e realizar operações em uma conta bancária
    private static void exibirConta(ContaBancaria conta) {
        // Exibe o número da conta e o nome do titular
        System.out.println("\nNúmero da conta: " + conta.getNumeroConta() +
                "\nNome do cliente: " + conta.getTitular());

        // Exibe o saldo inicial da conta
        System.out.println("Saldo inicial R$" + conta.getSaldo());

        // Realiza um depósito de R$1000,00
        conta.depositar(1000);

        // Exibe o saldo após o depósito
        System.out.println("Após deposito de R$" + conta.getSaldo());

        // Tenta sacar R$5000,00 e guarda o resultado (true ou false)
        boolean ok = conta.sacar(5000);

        // Informa se o saque foi bem-sucedido ou não
        if (ok) {
            System.out.println("Tentativa de saque bem sucedida!!");
        } else {
            System.out.println("Tentativa de saque falhou");
        }

        // Exibe o saldo final após as operações
        System.out.println("Saldo final da conta R$" + conta.getSaldo());
    }
}
