package LinkList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.beuga.modelo.Conta.Conta;
import br.com.beuga.modelo.Conta.ContaCorrente;
import br.com.beuga.modelo.Conta.Pessoa;

//Código omitido

public class TesteExercicio {
	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		p.setNome("Silvio");
		Conta cc1 = new ContaCorrente(122, 122, 123, p);
		Conta cc2 = new ContaCorrente(133, 133, 133, p);
		Conta cc3 = new ContaCorrente(144, 144, 144, p);
		Conta cc4 = new ContaCorrente(155, 155, 155, p);

		List<Conta> lista = new ArrayList<>();

		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

//		NumeroDaContaComparator2 comparator = new NumeroDaContaComparator2();

		lista.sort(new Comparator<Conta>() { //Classe anonima.

			@Override
			public int compare(Conta conta1, Conta conta2) {

				return Double.compare(conta1.getSaldo(), conta2.getSaldo());
			}

		}

		);

		for (Conta conta : lista) {
			System.out.println(conta);
		}

//        NumeroDaContaComparator comparator = new NumeroDaContaComparator();

//                Collections.sort(lista, new NumeroDaContaComparator());
//                Collections.sort(list);
//                Collections.reverse(lista);

		System.out.println("---------");

		for (Conta conta : lista) {
			System.out.println(conta + ", " + conta.getPessoa().getNome());
		}

	}

	class TitularDaContaComparator2 implements Comparator<Conta> {

		@Override
		public int compare(Conta c1, Conta c2) {

			String nomeC1 = c1.getPessoa().getNome();
			String nomeC2 = c2.getPessoa().getNome();
			return nomeC1.compareTo(nomeC2);
		}
	}

//	class NumeroDaContaComparator2 implements Comparator<Conta> {
//
//		@Override
//		public int compare(Conta c1, Conta c2) {
//
//			return Integer.compare(c1.getNumero(), c2.getNumero());
//		}
//	}
}