/* EXC 4 - Crie um programa em Linguagem Java que armazene dados inteiros em uma matriz de ordem 5. Em seguida imprima apenas a diagonal principal. Depois imprima a diagonal secundária. */
import java.util.Scanner;

public class Exc4Matrizes {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			
		int[][] matrix = new int[5][5];
		int i, j;
		
		//Matriz original;
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
		
		//Diagonal principal;
		for (i = 0; i < matrix.length; i++) {
			for (j = 0; j < matrix.length; j++) {
				if (i == j) {
				System.out.print(matrix[i][j] + " ");
				}
			}
		}
		
		//Diagonal invertida;
		for (i = 0; i < matrix.length; i++) {
			for (j = 0; j < matrix.length; j++) {
				if (i + j == 4) {
				System.out.print(matrix[i][j] + " ");
				}
			}
		}
			
		scanner.close();
	}
}