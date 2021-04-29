package Principal;

import br.com.beuga.modelo.Funcionario.Gerente;

public class TesteGerente {

	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		
		gerente.setNome("Sílvio Silva");
		gerente.setSalario(5000);
		gerente.setMatricula(12345);
		System.out.println(gerente.getBonificacao());
		
		boolean autenticou = gerente.autentica("Gatao");
		
		System.out.println( autenticou );

	}

}
