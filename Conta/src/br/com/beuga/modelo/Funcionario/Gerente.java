package br.com.beuga.modelo.Funcionario;

public class Gerente extends Funcionario implements Autenticavel {

	public double getBonificacao() {
		System.out.println("Chamado o método do Gerente");
		return super.getSalario() * 0.1;
	}

	@Override
	public boolean autentica(String senha) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setSenha(String senha) {
	}

}
