/*
Crie um programa em Linguagem Java que armazene dados inteiros em uma matriz de ordem 5. 
Em seguida imprima apenas a diagonal principal. Depois imprima a diagonal secundária.
*/
import java.util.Scanner;
public class Ex4Matriz{
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
	System.out.println("\nImprimindo a diagonal principal da matriz  ");
	for(i=0;i<ord;i++){
		for(j=0;j<ord;j++){	
			if (i==j)
				System.out.print(mat[i][j]);
			else
				System.out.print("   ");
		}
	System.out.println("");
	}
	System.out.println("\nImprimindo a diagonal secundaria da matriz  ");
	for(i=0;i<ord;i++){
		for(j=0;j<ord;j++){	
			if (i+j==ord-1)
				System.out.print(mat[i][j]);
			else
				System.out.print("   ");
		}
	System.out.println("");
	}	
  }
}


/*
4) Crie um programa em Linguagem Java que armazene dados inteiros em 
uma matriz de ordem 5. Em seguida imprima apenas a diagonal principal. 
Depois imprima a diagonal secundária.
*/