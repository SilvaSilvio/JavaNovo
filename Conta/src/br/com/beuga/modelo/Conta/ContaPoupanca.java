package br.com.beuga.modelo.Conta;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int numero, int agencia, float saldo) {
		super(numero, agencia, saldo);
	}

	@Override
	public void deposita(float valor) {
		super.saldo += valor + 2;
		
	}

}
