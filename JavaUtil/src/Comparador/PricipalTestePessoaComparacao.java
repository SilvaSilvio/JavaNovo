package Comparador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PricipalTestePessoaComparacao {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa("Silvio", 25);
		Pessoa pessoa2 = new Pessoa("João", 23);
		Pessoa pessoa3 = new Pessoa("Ane", 22);

		List<Pessoa> lista = new ArrayList<>();

		lista.add(pessoa1);
		lista.add(pessoa2);
		lista.add(pessoa3);

		for (Pessoa pessoa : lista) {
			System.out.println(pessoa);
		}

//		lista.sort(lista);
//		Collections.sort(lista);
		System.out.println("Após a comparação por idade");

		lista.sort(new Comparator<Pessoa>() {

			@Override
			public int compare(Pessoa p1, Pessoa p2) {

				return Integer.compare(p1.getIdade(), p2.getIdade());
			}

		}

		);

		for (Pessoa pessoa : lista) {
			System.out.println(pessoa);
		}

		System.out.println("Comparator");

		
		/*Classes anomimas*/
		Comparator<Pessoa> pessoaT = new Comparator<Pessoa>() {

			@Override
			public int compare(Pessoa pess1, Pessoa pess2) {
				String nomeC1 = pess1.getNome();
				String nomeC2 = pess2.getNome();

				return nomeC1.compareTo(nomeC2);
			}

		};

		for (Pessoa pessoaT1 : lista) {
			System.out.println(pessoaT1);
		}

	}

}
