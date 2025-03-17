// Importamos a ferramenta Scanner que nos ajuda a ler o que o usuário digita
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criamos uma "caixinha" chamada scanner para pegar o que o usuário digitar
        try (Scanner scanner = new Scanner(System.in)) {
            
            // Criamos espaços para guardar as informações da conta
            int numeroConta;        // Para guardar o número da conta (número inteiro)
            String agencia;         // Para guardar o número da agência (texto)
            String nomeCliente;     // Para guardar o nome do cliente (texto)
            double saldo;           // Para guardar o saldo (número com casas decimais)

            // Pedimos as informações ao usuário, uma por uma
            
            // 1. Perguntamos a agência
            System.out.println("Por favor, digite o número da Agência!");
            agencia = scanner.nextLine(); // Guardamos o que o usuário digitou
            
            // 2. Perguntamos o número da conta
            System.out.println("Por favor, digite o número da Conta!");
            numeroConta = scanner.nextInt(); // Guardamos o número
            scanner.nextLine(); // Limpamos a "sujeira" deixada pelo nextInt
            
            // 3. Perguntamos o nome
            System.out.println("Por favor, digite o seu Nome!");
            nomeCliente = scanner.nextLine(); // Guardamos o nome
            
            // 4. Perguntamos o saldo
            System.out.println("Por favor, digite o saldo inicial!");
            saldo = scanner.nextDouble(); // Guardamos o valor
            
            // Mostramos a mensagem final juntando todas as informações
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                              "sua agência é " + agencia + ", conta " + numeroConta + 
                              " e seu saldo " + saldo + " já está disponível para saque");
        }
        // O "try" cuida de fechar o scanner sozinho, então não precisamos nos preocupar
    }
}