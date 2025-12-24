/* EXC 5 - Crie um programa em Linguagem Java que armazene dados inteiros em uma matriz de ordem 5 e imprima todos os elementos que se encontram em posições cuja linha mais coluna formam um número par 
*/
import java.util.Scanner;

public class Exc5Matrizes {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			
		int[][] matrix = new int[5][5];
		int i, j;
		
		for (i = 0; i < matrix.length; i++) {
			for (j = 0; j < matrix.length; j++) {
				System.out.println("Digite o valor da position ["+(i+1)+"]["+(j+1)+"] da matriz");
				matrix[i][j] = scanner.nextInt();
			}
		}
		
		//Matriz Exibida;
		System.out.println("\n\nConteudo da Matriz: ");
		for (i = 0; i < matrix.length; i++) {
			for (j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " | ");
			}
			System.out.println("");
		}
		
		for (i = 0; i < matrix.length; i++) {
			for (j = 0; j < matrix.length; j++) {
				if ((i + j) % 2 == 0) {
				System.out.print(matrix[i][j] + " ");
				}
			}
		}
		scanner.close();
	}
}