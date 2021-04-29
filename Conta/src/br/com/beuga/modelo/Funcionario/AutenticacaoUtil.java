package br.com.beuga.modelo.Funcionario;

public class AutenticacaoUtil implements Autenticavel {
	private String senha;
	@Override
	public boolean autentica(String senha) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void setSenha(String senha) {
		this.senha = senha;
		
	}

}
