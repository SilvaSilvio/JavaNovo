package br.com.beuga.modelo.Conexao;

public class TesteConexao {
	public static void main(String[] args) {

		// Já abre a conexão e faz as tratativas.
		try (Conexao conexao = new Conexao()) {
			conexao.leDados();
		} catch (IllegalStateException e) {
			System.out.println("Deu erro na conexão.");
		}

//		try {
//			
//			con.leDados();
//			
//		} catch (IllegalStateException e) {
//			// e.getMessage();
//			System.out.println("Deu erro na conexão");
//		} finally {

//			con.fecha();
//		}
	}
}
