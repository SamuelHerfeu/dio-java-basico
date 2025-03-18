// Modo condicional switch / case

public class SistemaMedida {
	public static void main(String[] args) {
		String sigla = "M";

		switch (sigla) {
			case "P" -> {
				System.out.println("PEQUENO");
			}
			case "M" -> {
				System.out.println("MEDIO");
			}
			case "G" -> {
				System.out.println("GRANDE");
			}
			default -> System.out.println("INDEFINIDO");
		}
	}
}

// Modo condicional if/else
/*
 * public class SistemaMedida {
 * public static void main(String[] args) {
 * String sigla = "M";
 * 
 * if(sigla == "P")
 * System.out.println("PEQUENO");
 * else if(sigla == "M")
 * System.out.println("MEDIO");
 * else if(sigla == "G")
 * System.out.println("GRANDE");
 * else
 * System.out.println("INDEFINIDO");
 */