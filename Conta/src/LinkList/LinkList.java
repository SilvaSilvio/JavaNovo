package LinkList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import br.com.beuga.modelo.Conta.Conta;
import br.com.beuga.modelo.Conta.ContaCorrente;

public class LinkList {
	public static void main(String[] args) {

		List<Conta> lista = new LinkedList<>();

		Conta conta = new ContaCorrente(12, 21, 5000);

		lista.add(conta);
		
		for (Conta c : lista) {
			System.out.println(c.getNumero());
		}

		

	}

}
