/*
Crie um programa para armazenar os valores 0s e 1s em uma matriz quadrada de ordem 3. 
Em seguida verificar se a matriz é uma matriz identidade.
	Obs: uma matriz identidade é aquela em que os elementos da diagonal principal são iguais a 1 e 
	os demais elementos são iguais a zero.
*/
import java.util.Scanner;
public class Ex6Matriz{
	public static void main(String[] args){
		
	int[][] mat;
	int ord=3;
	mat = new int[ord][ord];
	int i,j, princ=0,demais=0;
	Scanner entra = new Scanner(System.in);
		
	for(i=0;i<ord;i++){ //loop que percorre a linha
		for(j=0;j<ord;j++){ //loop que percorre a coluna
			System.out.print("Digite o valor da posicao ["+(i+1)+"]["+(j+1)+"] da matriz: ");
			mat[i][j]=entra.nextInt();
			while(mat[i][j]<0 || mat[i][j]>1){
				System.out.print("Vc digitou um valor inadequado. Digite apenas 0 ou 1: ");
				mat[i][j]=entra.nextInt();
			}
		}
	}
	System.out.println("\nImprimindo a matriz  ");
	for(i=0;i<ord;i++){
		for(j=0;j<ord;j++){	
			System.out.print(mat[i][j]+" | ");
		}
	System.out.println("");
	}
	for(i=0;i<ord;i++){
		for(j=0;j<ord;j++){
			if(i==j)			
				princ=princ+mat[i][j];
			else
				demais=demais+mat[i][j];
		}
	}
	if(princ==ord && demais==0)
			System.out.print("Matriz identidade");
	else
			System.out.print("Matriz nao identidade");	
  }
}


/*
6) Crie um programa para armazenar os valores 0s e 1s em uma matriz 
quadrada de ordem 3. Em seguida verificar se a matriz é uma matriz 
identidade.
	Obs: uma matriz identidade é aquela em que os elementos da diagonal 
	principal são iguais a 1 e os demais elementos são iguais a zero.

*/