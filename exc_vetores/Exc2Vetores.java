/* EXC 2 - Criar um Vetor de 15 numeros; Apos isso criar vetor onde todos os numeros sao os numeros do primeiro 
multiplicados por 3 (multiplos de 3) */
import java.util.Scanner;

public class Exc2Vetores {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int i;
		int size = 15;
		int[] array = new int[15];
		
		for(i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}
		
		for(i = 0; i < size; i++) {
			System.out.println("Value " + (i+1) + ": " + (array[i] * 3));
		}
		
		scanner.close();
	}
}	
