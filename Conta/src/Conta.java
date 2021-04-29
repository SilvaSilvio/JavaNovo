
public class Conta {
	int numero;
	int agencia;
	private float saldo;
	Pessoa pessoa;
	public static int total;
	
	
	public Conta(int numero, int agencia, float saldo) {
		Conta.total++;
		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		System.out.println("Estou mostrando o número da conta " + this.numero);
		
	}

	public void deposita(float valor) {
		this.saldo = this.saldo + valor;
		// System.out.println("O valor da conta é : " + this.saldo);
	}

	public void saca(float valor) {
		this.saldo -= valor;
		System.out.println("O valor sacado foi: " + valor);
		// System.out.println("O valor o saldo é " + this.saldo);
	}

	public boolean saca1(float valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("Não existe saldo disponivel.");
			return false;
		}
	}

	public boolean transfere(float valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			System.out.println("Não é possível fazer a transferencia");
			return false;
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("Agencia não pode ter número negativo");
		} else {
			this.numero = numero;
		}

	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Agencia não pode ser número negativo.");
		} else {
			this.agencia = agencia;
		}
	}

	public float getSaldo() {
		return saldo;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public static int getTotal() {
		return Conta.total;
	}

}
