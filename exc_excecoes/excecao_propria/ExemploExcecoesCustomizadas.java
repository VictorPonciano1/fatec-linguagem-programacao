/* EXEMPLO DO USO DE "TRATAMENTO DE EXCECOES" COM EXCECOES PERSONALIZADAS */

public class ExemploExcecoesCustomizadas {
	public static void main (String[] args) {
		
		try {
			numero(5);
			numero(15);
		} catch (MinhaExcecao e) { 
			// Catch que especifica o tipo de erro que se deseja capturar;
			System.out.println("Pegou um tipo de erro: " + e);
		}
	}
	
	static void numero(int a) throws MinhaExcecao {
		System.out.println("Metodo numero (" + a + ") foi chamado");
		if (a > 10) { //Se houver algo que satisfaca, a nova excecao sera chamada;
			throw new MinhaExcecao(a);
		}
		System.out.println("Saida normal");
	}
}