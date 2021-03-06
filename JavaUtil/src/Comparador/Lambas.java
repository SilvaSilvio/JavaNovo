package Comparador;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

/*Utilização de Lambdas*/
/*
 * Labdas é expresso com o simbolo ->
 * */
public class Lambas {
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

//	lista.sort(lista);
//	Collections.sort(lista);
		System.out.println("Após a comparação por idade");

		System.out.println("Comparação de Pessoas por idade");

		lista.sort(new Comparator<Pessoa>() {
			@Override
			public int compare(Pessoa p1, Pessoa p2) {
				return Integer.compare(p1.getIdade(), p2.getIdade());
			}
		});
		
		System.out.println("Reduzindo um pouquinho mais");
		lista.sort( (Pessoa p1, Pessoa p2) -> {
				return Integer.compare(p1.getIdade(), p2.getIdade());
			}
		);
		
		System.out.println("Reduzindo um pouquinho mais");
		
		lista.sort( ( p1, p2) -> {
			return Integer.compare(p1.getIdade(), p2.getIdade());
		}
	);
		
		System.out.println("Prazer, Lambdas");
		lista.sort( ( p1, p2) -> Integer.compare(p1.getIdade(), p2.getIdade()));

		// Função Lambdas

		lista.sort((p1, p2) -> Integer.compare(p1.getIdade(), p2.getIdade()));

		System.out.println("Foreach de leve para acalmar os animos.");
		
		lista.forEach( pessoa -> System.out.println( pessoa ) );
		
		lista.forEach( new Consumer<Pessoa>() {

			@Override
			public void accept(Pessoa pessoa) {
				
			}
		
		}
		);
		
//		for (Pessoa pessoa : lista) {
//			System.out.println(pessoa);
//		}

		System.out.println("Comparator");

		/* Classes anomimas */
		Comparator<Pessoa> pessoaT = (Pessoa pess1, Pessoa pess2) -> {
			String nomeC1 = pess1.getNome();
			String nomeC2 = pess2.getNome();

			return nomeC1.compareTo(nomeC2);

		};

		for (Pessoa pessoaT1 : lista) {
			System.out.println(pessoaT1);
		}

	}

}
