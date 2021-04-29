package br.com.beuga.modelo.Funcionario;

//Quem assina esse contrato precisa implementar
//metodo
//autentica.
public abstract interface Autenticavel {

	public abstract boolean autentica(String senha);

	public abstract void setSenha(String senha);

}
