//Primeiro codigo(ou algoritmo) da aula de Linguagem de Prog (LP);
import java.util.Scanner;

public class Exemplo {
	public static void main (String args[]) {

		Scanner scanner = new Scanner(System.in);
		
		String hello;
		
		System.out.println("Digite a sua mensagem: ");
		hello = scanner.nextLine();
		
		System.out.println(hello);
		
		scanner.close();
		}
	}