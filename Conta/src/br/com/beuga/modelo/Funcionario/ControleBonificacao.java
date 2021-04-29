package br.com.beuga.modelo.Funcionario;
public class ControleBonificacao {

	private double soma;

	public void registra(Funcionario funcionario) {
		double bofificacao = funcionario.getBonificacao();
		this.soma += bofificacao;
	}

	public double getSoma() {
		return soma;
	}

}
