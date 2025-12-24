/* EXC 1 - Crie um programa que contenha um método denominado verificarValor. O método verificarValor recebe um parâmetro 
que é um valor inteiro e verifica se esse valor é par ou ímpar. Imprimir a mensagem dentro do método. */
import java.util.Scanner;

public class ParImpar {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int valor;
		
		System.out.println("Digite o valor: ");
		valor = scanner.nextInt();

		verificarValor(valor);

		scanner.close();
	}

	public static void verificarValor(int valor) {

		if (valor % 2 == 0) {
			System.out.println("Valor par");
		} else {
			System.out.println("Valor impar");
		}

	}
}