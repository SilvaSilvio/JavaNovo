package br.com.beuga.modelo.Funcionario;

public abstract class Funcionario {
	private String nome;
	private int matricula;
	private double salario;

	
	//Métodos abstratos não possuem corpos.
	public abstract double getBonificacao();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
