package br.com.beuga.modelo.Conta;

public class GuardadorDeConta {
	private Conta[] referencias;
	private int posLivre;

	public GuardadorDeConta() {
		this.referencias = new Conta[10];
		this.posLivre = 0;
	}

	public void adiciona(Conta ref) {
		this.referencias[posLivre] = ref;
		this.posLivre++;
	}

	public int getQuantidadeDeElemento() {
		return this.posLivre;
	}
	
	public Conta getReferencia(int pos){
		return this.referencias[pos];
	}
}
