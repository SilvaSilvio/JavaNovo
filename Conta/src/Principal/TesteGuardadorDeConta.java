package Principal;

import br.com.beuga.modelo.Conta.Conta;
import br.com.beuga.modelo.Conta.ContaCorrente;
import br.com.beuga.modelo.Conta.GuardadorDeConta;

public class TesteGuardadorDeConta {

	public static void main(String[] args) {
		GuardadorDeConta guardador = new GuardadorDeConta();
		
		Conta cc = new ContaCorrente(123, 323, 200);
		Conta cc1 = new ContaCorrente(123, 323, 200);
		
		guardador.adiciona(cc);
		guardador.adiciona(cc1);
		
		int tamanho = guardador.getQuantidadeDeElemento();
		//int tamanho1 = guardador.getQuantidadeDeElemento();
		
		System.out.println(tamanho);
		
		Conta ref = guardador.getReferencia(1);
		
		System.out.println("A posição informarda é: " + ref.getNumero());
		

	}

}
