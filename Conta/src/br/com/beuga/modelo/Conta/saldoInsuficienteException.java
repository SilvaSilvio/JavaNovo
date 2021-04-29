package br.com.beuga.modelo.Conta;

public class saldoInsuficienteException extends RuntimeException {

	public saldoInsuficienteException(String msg) {
		super(msg);
	}
}
