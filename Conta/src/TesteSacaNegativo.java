
public class TesteSacaNegativo {

	public static void main(String[] args) {
		Conta conta = new Conta(123, 123, 500);
		conta.deposita(100);
		conta.saca1(200);
		System.out.println(conta.getSaldo());
		
		Pessoa p = new Pessoa();
		p.nome = "Silvio";
		
		conta.setPessoa(p);
		System.out.println(conta.getPessoa().nome);
		
		Conta c1 = new Conta(321, 321, 1000);

		Pessoa p2 = new Pessoa();
		p2.nome = "Joãozinho";
		
		c1.setPessoa(p2);
		
		System.out.println(c1.getPessoa().nome);
		
		c1.setAgencia(-221);
		System.out.println(c1.getAgencia());
		System.out.println(Conta.getTotal());
	}
}