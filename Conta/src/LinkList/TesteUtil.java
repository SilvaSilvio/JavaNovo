package LinkList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import br.com.beuga.modelo.Conta.Conta;
import br.com.beuga.modelo.Conta.ContaCorrente;

public class TesteUtil {
	public static void main(String[] args) {
		int[] idades = new int[5];
		String[] nomes = new String[5];

		int idade = 29; // Integer é o atribuido orietado a objeto
		Integer idadeRef = new Integer(29); // Errado
		Integer idadeRef1 = Integer.valueOf(idade);

		int valor = idadeRef1.intValue();

//		System.out.println(valor);

		List<Integer> numeros = new ArrayList<Integer>();

		numeros.add(idadeRef);

//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE);

		NumeroDaContaComparatacao comparator = new NumeroDaContaComparatacao();

		List<Conta> list = new ArrayList<>();

		Conta c1 = new ContaCorrente(123, 32, 200);
		Conta c2 = new ContaCorrente(122, 25, 7000);

		list.add(c1);
		list.add(c2);

		for (Conta conta : list) {
			System.out.println(conta);
		}

		list.sort(comparator);

		for (Conta conta : list) {
			System.out.println(conta);
		}

//		Collections.sort(list, new NumeroDaContaComparatacao());
//		System.out.println("Com comparador");
		
//		Collections.sort(null);
		
//		for (Conta conta : list) {
//			System.out.println(conta);
//		}

	}
}

class NumeroDaContaComparatacao implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {
		if (c1.getNumero() < c2.getNumero()) {
			return -12;
		}
		if (c1.getNumero() > c2.getNumero()) {
			return 123;
		}
		return 0;

	}

}
