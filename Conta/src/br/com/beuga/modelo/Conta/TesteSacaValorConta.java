package br.com.beuga.modelo.Conta;

public class TesteSacaValorConta {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(123, 124, 0);
		cc.deposita(220.3f);
		cc.saca(220.2f);
		
		System.out.println("O Saldo é: "+ cc.getSaldo());
	}
}
