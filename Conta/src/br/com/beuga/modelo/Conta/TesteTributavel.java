package br.com.beuga.modelo.Conta;

public class TesteTributavel {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(123, 231, 500);
		cc.deposita(200);

		SeguroVida seguro = new SeguroVida();

		CalculadorImposto calculador = new CalculadorImposto();
		calculador.registra(cc);
		calculador.registra(seguro);

		System.out.println(calculador.getTotalImposto());
	}
}
