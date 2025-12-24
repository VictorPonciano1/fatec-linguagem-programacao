/*
5) Crie um programa em Linguagem Java que armazene dados inteiros 
em uma matriz de ordem 5 e imprima todos os elementos que se encontram 
em posições cuja linha mais coluna formam um número par. 
*/
import java.util.Scanner;
public class Ex5Matriz{
	public static void main(String[] args){
		
	int[][] mat;
	int ord=3;
	mat = new int[ord][ord];
	int i,j;
	Scanner entra = new Scanner(System.in);
		
	for(i=0;i<ord;i++){ //loop que percorre a linha
		for(j=0;j<ord;j++){ //loop que percorre a coluna
			System.out.print("Digite o valor da posicao ["+(i+1)+"]["+(j+1)+"] da matriz: ");
			mat[i][j]=entra.nextInt();
		}
	}

	System.out.println("\nImprimindo a matriz  ");
	for(i=0;i<ord;i++){
		for(j=0;j<ord;j++){	
			System.out.print(mat[i][j]+" | ");
		}
	System.out.println("");
	}
/*imprima todos os elementos que se encontram 
em posições cuja linha mais coluna formam um número par. 
*/
	System.out.println("\nImprimindo elementos  ");
	for(i=0;i<ord;i++){
		for(j=0;j<ord;j++){	
			if((i+j)%2==0)			
				System.out.print("   "+mat[i][j]);
			else
				System.out.print("   ");
		}
	System.out.println("");
	}
	
  }
}