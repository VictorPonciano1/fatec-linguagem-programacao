/* EXC 2 - Crie um programa para armazenar valores inteiros em duas matrizes quadradas, denominadas A e B, de ordem 2. Em seguida, gerar uma terceira matriz chamada C que é obtida a partir da adição 
da matriz A e B */
import java.util.Scanner;

public class Exc2Matrizes {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[][] matrixA = new int[2][2];
		int[][] matrixB = new int[2][2];
		int[][] matrixC = new int[2][2];
		int i, j;
		
		//Matriz A;
		for (i = 0; i < matrixA.length; i++) {
			for (j = 0; j < matrixA.length; j++) {
				System.out.println("Digite o valor da position ["+(i+1)+"]["+(j+1)+"] da matriz");
				matrixA[i][j] = scanner.nextInt();
			}
		}
		
		//Matriz B;
		for (i = 0; i < matrixB.length; i++) {
			for (j = 0; j < matrixB.length; j++) {
				System.out.println("Digite o valor da position ["+(i+1)+"]["+(j+1)+"] da matriz");
				matrixB[i][j] = scanner.nextInt();
			}
		}

		//Matriz C;
		for (i = 0; i < matrixC.length; i++) {
			for (j = 0; j < matrixC.length; j++) {
				matrixC[i][j] = matrixA[i][j] + matrixB[i][j];
			}
		}
		
		//Matriz Exibida;
		System.out.println("\n\nConteudo da Matriz: ");
		for (i = 0; i < matrixC.length; i++) {
			for (j = 0; j < matrixC.length; j++) {
				System.out.print(matrixC[i][j] + " | ");
			}
			System.out.println("");
		}
		
		scanner.close();
	}
}