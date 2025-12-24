/* EXEMPLO DE SUBSTRINGS
Nota: startIndex: parte da index da String em que a substring comeca; endIndex:*/

public class ExemploSubstring {
	public static void main (String[] args) {
			
		String nome = "Victor Ponciano";
		//Comando o startIndex (nesse caso 8) e segue ate o final da String;
		System.out.println(nome.substring(7)); 
		//Comando onde alem do startIndex o endIndex tb esta definido, delimitando a exibicao;
		System.out.println(nome.substring(0, 6)); 
	}
}