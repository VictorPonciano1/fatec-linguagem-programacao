/* EXC 3 - Faca um programa que gere uma matriz 8X8 preenchendo com "1" as “celulas” da area destacada da matriz ao lado, e "0" as demais “celulas” */
import java.util.Scanner;

public class Exc3Matrizes {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int[][] matrix = new int[8][8];
		int i, j;

		for(i = 0; i < matrix.length; i++) {
			for(j = 0; j < matrix.length; j++) {
				if (i >= j) {
					matrix[i][j] = 1;
				} else {
					matrix[i][j] = 0;
				}
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
		
		scanner.close();
	}
}