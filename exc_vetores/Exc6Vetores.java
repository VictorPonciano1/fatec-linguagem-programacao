/* EXC 6 - Criar dois vetores (pode ser A e B) de 20 posicoes; Apos, trocar o numero da posicao 1 de A com o numero da 
posicao 20 de B e assim sucessivamente; */
import java.util.Scanner;

public class Exc6Vetores {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int i;
		int j;
		int aux = 0;
		int size = 20;
		int[] arrayA = new int[size];
		int[] arrayB = new int[size];
		
		System.out.println("Array A: ");
		//Array A;
		for(i = 0; i < size; i++) {
			arrayA[i] = scanner.nextInt();
		}
		
		System.out.println("Array B: ");
		//Array B;
		for(j = 0; j < size; j++) {
			arrayB[j] = scanner.nextInt();
		}
		
		j = size - 1;
		for(i = 0; i < size; i++) {
			aux = arrayB[j];
			arrayB[j] = arrayA[i];
			arrayA[i] = aux;
			j--;
		}
		
		scanner.close();
	}
}