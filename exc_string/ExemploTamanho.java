/* EXEMPLO PARA OBTER O TAMANHO DE UMA STRING */
import java.util.Scanner;

public class ExemploTamanho {
	public static void main (String[] args) {
		
		//EXEMPLO COM SCANNER;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escreva uma palavra");
		String palavra = scanner.nextLine();
		System.out.println("Comprimento da palavra: " + palavra.length() + " caracteres");
		
		//EXEMPLO COM STRING DECLARADA;
		String palavra2 = "Paralelepipedo";
		System.out.println("Comprimento da palavra 2: " + palavra2.length() + " caracteres");
		
		//FECHANDO SCANNER;
		scanner.close();
	}
}