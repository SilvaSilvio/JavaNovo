package Principal;

import br.com.beuga.modelo.Conta.ContaCorrente;
import br.com.beuga.modelo.Conta.ContaPoupanca;

public class TesteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente cc = new ContaCorrente(111, 123, 2000);
		cc.deposita(500);

		ContaPoupanca cp = new ContaPoupanca(123, 123, 2000);
		cp.deposita(500);

		cc.transfere(500, cp);

		System.out.println("Conta Corrente: " + cc.getSaldo());
		System.out.println("Conta Poupança: " + cp.getSaldo());

	}

}
