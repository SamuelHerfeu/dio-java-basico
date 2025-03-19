import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita os dois números ao usuário
        System.out.println("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        try {
            // Chama o método que realiza a contagem
            contar(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
            // Exibe a mensagem de erro caso a exceção seja lançada
            System.out.println(e.getMessage());
        } finally {
            // Fecha o scanner
            scanner.close();
        }
    }

    // Método que realiza a contagem e lança a exceção se necessário
    public static void contar(int numero1, int numero2) throws ParametrosInvalidosException {
        // Verifica se o segundo número é menor que o primeiro
        if (numero2 < numero1) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        // Realiza o loop para imprimir os números
        for (int i = numero1; i <= numero2; i++) {
            System.out.println("Imprimindo o número " + i);
        }

        // Calcula e exibe o número de iterações
        int iteracoes = numero2 - numero1 + 1;
        System.out.println("Total de iterações: " + iteracoes);
    }
}
