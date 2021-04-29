package Principal;

import br.com.beuga.modelo.Funcionario.ControleBonificacao;
import br.com.beuga.modelo.Funcionario.EditorVideo;
import br.com.beuga.modelo.Funcionario.Gerente;

public class TesteGerenteGererico {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setSalario(12000);

		EditorVideo editorvideo = new EditorVideo();
		editorvideo.setSalario(5000);

		ControleBonificacao controle = new ControleBonificacao();
	
		controle.registra(g1);
		System.out.println(g1.getSalario());
		
		controle.registra(editorvideo);
		System.out.println(editorvideo.getSalario());
		
		String nome = "Alura";
		String outroNome = nome.toLowerCase();
		System.out.println(outroNome);
		
		
		System.out.println(nome.charAt(2));
		
		int pos = nome.indexOf("ur");
		System.out.println(pos);
		String vazio = "   ";
		String outroVazio = vazio.trim();
		System.out.println(outroVazio.isEmpty());
		System.out.println(vazio.isEmpty());

	}

}
