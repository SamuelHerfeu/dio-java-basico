public class ResultadoEscolarEncadeado {

    public static void main(String[] args) {

        int nota = 7;

        if (nota >= 7)
            System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7)// tem que retornar uma condição TRUE ou FALSE
            System.out.println("Prova Recuperacao");

        else
            System.out.println("Reprovado");
    }

    @Override
    public String toString() {
        return "ResultadoEscolarEncadeado []";
    }
}