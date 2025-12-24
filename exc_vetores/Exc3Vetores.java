/* EXC 3 - Criar um vetor com tamanho para 50 numeros; Exibir o maior; */
import java.util.Scanner;

public class Exc3Vetores {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int size = 50;
		int biggestN = 0;
		int[] array = new int[size];
		
		for(int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
			
			if(array[i] > biggestN){
				biggestN = array[i];
			}
		}
		
		System.out.print("Biggest Number of the Array: " + biggestN);
		
		scanner.close();
	}
}