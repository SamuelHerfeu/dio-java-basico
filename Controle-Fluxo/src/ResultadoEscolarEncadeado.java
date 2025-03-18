// ResultadoEscolar.java
public class ResultadoEscolarEncadeado {
    public static void main(String[] args) {

       int nota = 7;
       
       if(nota >= 7)
        System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7)
        System.out.println("Prova Recuperacao");

       else
       System.out.println("Reprovado");
    }
}