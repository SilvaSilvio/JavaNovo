package br.com.beuga.modelo.JavaPilha;

public class Fluxo {
	public static void main(String[] args) {
		System.out.println("Inicio do main");
		try {
			metodo1();
		} catch (ArithmeticException | NullPointerException e) {
			String msg = e.getMessage();
			System.out.println("Verificando excessóes no metodo 2: " + msg);
		}
		System.out.println("Fim do main");
	}

	public static void metodo1() {
		System.out.println("Inicio do metodo 1");

		metodo2();

		System.out.println("Fim do Metodo 1");
	}

	public static void metodo2() {
		System.out.println("Inicio do metodo 2");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);

			// int a = i / 0;
			Conta1 c = null;
			c.deposita();
		}
		System.out.println("Fim do método 2");
	}
}
