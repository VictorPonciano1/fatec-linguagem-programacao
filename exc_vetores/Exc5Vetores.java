/* EXC 5 - Criar um vetor de numeros inteiros com 50 posicoes; Exibir apenas os numeros positivos; */
import java.util.Scanner;

public class Exc5Vetores {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int i;
		int size = 5; //Para o teste o tamanho do array sera de 5 apenas;
		int[] array = new int[size];
		
		for(i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
			
		}
		
		if(array[i] > 0) {
			System.out.print(array[i] + " ");
		}
		
		scanner.close();
	}
}