package br.com.beuga.modelo.Conta;

public class ContaCorrente extends Conta implements Tributavel, Comparable<ContaCorrente> {
private Pessoa pessoa;

	public ContaCorrente(int numero, int agencia, float saldo, Pessoa pessoa) {
		super(numero, agencia, saldo, pessoa);
		
	}
	
	@Override
	public void deposita( float valor) {
		super.saldo += valor;
	}
	
	@Override
	public void saca(float valor) {
		float valorASacar = (float) (valor + 0.2);
		super.saca(valorASacar);
	}

	@Override
	public double getValor() {
		
		return super.saldo * 0.01;
	}
	
	

	@Override
	public String toString() {
		return "ContaCorrente [numero=" + numero + ", agencia=" + agencia + ", saldo=" + saldo + ", pessoa=" + pessoa
				+ ", getValor()=" + getValor() + ", getNumero()=" + getNumero() + ", getAgencia()=" + getAgencia()
				+ ", getSaldo()=" + getSaldo() + ", getPessoa()=" + getPessoa()
				+ "]";
	}

	@Override
	public int compareTo(ContaCorrente outro) {
		// TODO Auto-generated method stub
		return Double.compare(this.saldo, outro.saldo) ;
	}


	
	
}
