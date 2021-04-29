package Principal;

import br.com.beuga.modelo.Funcionario.Gerente;

public class PrincipalTeste {
	public static void main(String[] args) {
		Gerente g = new Gerente();

		g.setNome("Sílvio");
		g.setMatricula(123);
		g.setSalario(2300);
		System.out.println(g.getBonificacao());

	/*
	 * 	FuncionarioTeste func = new FuncionarioTeste();
		func.setSalario(400);
		func.setTipo(0);
		System.out.println(func.getBonificacao());
		
		FuncionarioTeste func1 = new FuncionarioTeste();
		func1.setSalario(400);
		func1.setTipo(1);
		System.out.println(func1.getBonificacao());*/
	}
}
