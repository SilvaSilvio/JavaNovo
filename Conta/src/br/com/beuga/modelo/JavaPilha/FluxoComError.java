package br.com.beuga.modelo.JavaPilha;

public class FluxoComError {
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
		//O método fica se chamando.
		metodo2();
		System.out.println("Fim do método 2");
	}
}
