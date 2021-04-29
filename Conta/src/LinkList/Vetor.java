package LinkList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

import br.com.beuga.modelo.Conta.Conta;
import br.com.beuga.modelo.Conta.ContaCorrente;

public class Vetor {
public static void main(String[] args) {
	Conta conta = new ContaCorrente(0, 0, 0);
	
	List<Conta> lista = new Vector<>();
	
	Collection<Conta> cc = new ArrayList<Conta>();
	
	cc.add(conta);
	
	for (Conta conta2 : cc) {
		System.out.println(conta2.getNumero());
	}
}
}
