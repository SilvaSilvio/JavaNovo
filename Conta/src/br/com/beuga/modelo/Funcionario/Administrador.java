package br.com.beuga.modelo.Funcionario;

public class Administrador extends Funcionario implements Autenticavel {

	@Override
	public double getBonificacao() {
		// TODO Auto-generated method stub
		return 50;
	}

	@Override
	public boolean autentica(String senha) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setSenha(String senha) {
		// TODO Auto-generated method stub
		
	}

}
