public class ExemploForEach {
    public static void main(String[] args) {

        // em arrays o indice inicia em ZERO
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        // Forma abreviada
        for(String aluno : alunos) {
            System.out.println("Nome do aluno é: " + aluno);

        }
    }
}
