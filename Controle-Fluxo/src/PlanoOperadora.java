public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "M"; // M / T
        switch (plano) {
            case "B" -> System.out.println("100 minutos de ligação");
            case "M" -> {
                System.out.println("100 minutos de ligação");
                System.out.println("Whats e Intagram grátis");
            }
            case "T" -> {
                System.out.println("100 minutos de ligação");
                System.out.println("Whats e Intagram grátis");
                System.out.println("5Gb Youtube");
            }
            default -> {
            }
        }

    }
}
