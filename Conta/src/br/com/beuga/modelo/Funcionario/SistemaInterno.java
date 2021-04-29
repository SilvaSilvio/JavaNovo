package br.com.beuga.modelo.Funcionario;

public class SistemaInterno {
	
	private String senha = "2222";

	public void autentica(Autenticavel f) {
		boolean autenticou = f.autentica(this.senha);
		if ( autenticou ) {
			System.out.println("Senha correta, pode entrar no sistema");
		} else {
			System.out.println("Senha incorreta");
		}

	}
}
