package br.com.beuga.modelo.JavaPilha;

public class FluxoComTratamento {
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		try {
			metodo1();
		} // catch (ArithmeticException | NullPointerException | minhaExcecao e) {
		catch (Exception e) {
			String msg = e.getMessage();
			System.out.println("Verificando excessóes no metodo 2: " + msg);
		}
		System.out.println("Fim do main");
	}

	public static void metodo1() throws minhaExcecao {
		System.out.println("Inicio do metodo 1");

		metodo2();

		System.out.println("Fim do Metodo 1");
	}

	public static void metodo2() throws minhaExcecao {
		System.out.println("Inicio do metodo 2");

		throw new minhaExcecao("Deu muito errado");

		// System.out.println("Fim do método 2");
	}
}
