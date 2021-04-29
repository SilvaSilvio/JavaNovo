package br.com.beuga.modelo.Funcionario;

import br.com.beuga.modelo.Conta.Pessoa;

public class Cliente implements Autenticavel {
	Pessoa pessoa;
	private String senha;

	@Override
	public boolean autentica(String senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void setSenha(String senha) {
		this.senha = senha;

	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

}
