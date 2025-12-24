/* CLASSE PARA CHAMADA DA EXCECAO CUSTOMIZADA */

class MinhaExcecao extends Exception {
	
	private int detalhe;
	MinhaExcecao(int a) {
		detalhe = a;
	}
	
	public String toString() {
		return "MinhaExcecao[" + detalhe + "]";
	}
}