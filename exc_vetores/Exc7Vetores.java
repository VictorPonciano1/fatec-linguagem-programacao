/* EXC 7 - Criar um vetor de 30 posicoes; Os numeros devem ser divisiveis por 5; Se os numeros nao forem divisiveis por 5,
especificar a quantidade de nao divisiveis que foram digitados; */
import java.util.Scanner;

public class Exc7Vetores {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			
		int i;
		int nonFiveDiv = 0;
		int size = 10; //Para o teste do codigo, sera feito apenas um vetor menor de 10 posicoes
		int[] array = new int[size];
		
		for(i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
			
			if(array[i] % 5 != 0) {
			nonFiveDiv = nonFiveDiv + 1;
			}
		}
		
		System.out.print("Numbers of the Array: " + array[i] + " " + "\n Quantity of non divisible for 5: " + nonFiveDiv);
		
		scanner.close();
	}
}