/* EXC 1 - Crie um programa para inserir valores inteiros em uma matriz 4 x 4. Calcular e imprimir a soma de todos os elementos da matriz*/
import java.util.Scanner;

public class Exc1Matrizes {
	public static void main (String[] args) {
	
		Scanner scanner = new Scanner(System.in);
	
		int sum = 0;
		int[][] mtx = new int[4][4];
		int i, j;
	
		//Preenchimento dos valores;
		for (i = 0; i < mtx.length; i++) {
			for (j = 0; j < mtx.length; j++) {
				System.out.println("Digite o valor da position ["+(i+1)+"]["+(j+1)+"] da matriz");
				mtx[i][j] = scanner.nextInt();
				
				sum = sum + mtx[i][j];
			}
		}
		
		//Matriz Exibida;
		System.out.println("\n\nConteudo da Matriz: ");
		for (i = 0; i < mtx.length; i++) {
			for (j = 0; j < mtx.length; j++) {
				System.out.print(mtx[i][j] + " | ");
			}
			System.out.println("");
		}
		
		System.out.println("Soma de todos os valores da matriz: " + sum);

		scanner.close();
	}
}