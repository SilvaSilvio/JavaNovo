package br.com.beuga.modelo.ArrayList;

import java.util.ArrayList;

import br.com.beuga.modelo.Conta.Conta;
import br.com.beuga.modelo.Conta.ContaCorrente;

public class ArrayList1 {
	public static void main(String[] args) {

		// ArrayList1 lista = new ArrayList1();
		ArrayList lista = new ArrayList<>();

		ContaCorrente cc = new ContaCorrente(012, 120, 200);
		ContaCorrente cc1 = new ContaCorrente(013, 10, 500);

		lista.add(cc);
		lista.add(cc1);

		for (Object object : lista) {
			System.out.println(object.toString());
		}

		// System.out.println(lista.size());
		Conta ref = (Conta) lista.get(0);
		// System.out.println(ref.getNumero());

		lista.remove(1);
		
		System.out.println("Laço após a remoção dos arquivos.");

		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
	}
}
