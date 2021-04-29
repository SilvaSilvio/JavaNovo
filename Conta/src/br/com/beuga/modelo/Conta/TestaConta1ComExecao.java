package br.com.beuga.modelo.Conta;

import br.com.beuga.modelo.JavaPilha.minhaExcecao;

public class TestaConta1ComExecao {

	public static void main(String[] args)  {
		Conta1 c = new Conta1();
		
		try {
			c.deposita();
		} catch (minhaExcecao e) {
			e.printStackTrace();
			System.out.println("Tratativa...");
		}
	}

}
