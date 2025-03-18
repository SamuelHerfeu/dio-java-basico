// Estrutura ternaria deixando o encadeamento do script de forma mais limpa.

public class ResultadoEscolarTernario {
    public static void main(String[] args) {

        int nota = 6;
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);
    }
}