package br.com.beuga.modelo.Conta;

public class CalculadorImposto {

	private double totalImposto;

	public void registra(Tributavel t) {
		double valor = t.getValor();
		this.totalImposto += valor;

	}

	public void setTotalImposto(double totalImposto) {
		this.totalImposto = totalImposto;
	}

	public double getTotalImposto() {
		return totalImposto;
	}

}
