package br.com.beuga.modelo.Funcionario;

public class SistemaInternoTeste {
	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setSenha("22212");

		SistemaInterno si = new SistemaInterno();
		si.autentica(g1);
		
		Gerente g2 = new Gerente();
		g2.autentica("123");
		si.autentica(g2);
	}

}
