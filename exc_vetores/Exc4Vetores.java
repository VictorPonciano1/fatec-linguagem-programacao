/* EXC 4 - Criar um vetor com 100 posicoes; Calcular e exibir a soma dos numeros dos indices impares; */
import java.util.Scanner;

public class Exc4Vetores {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int i;
		int sum = 0; /* sum = soma em ingles; */
		int size = 100;
		int[] array = new int[size];
		
		for(i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
			
			if(i % 2 == 1) {
				sum = sum + array[i];
			}
		}
		
		System.out.print("The sum of all values in the array: " + sum);
		
		scanner.close();
	}
}
