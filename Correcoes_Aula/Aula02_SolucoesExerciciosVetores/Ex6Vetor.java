/* Faça um programa em linguagem Java para inserir dados em dois vetores de 20 posições
 de inteiros. A seguir, troque o 1º elemento de A com o 20º de B, o 2º de A com o 19º de B, 
 e assim por diante, até trocar o 20º de A com o 1º de B. Mostre os vetores antes e depois 
 da troca.
 */

import java.util.Scanner;
public class Ex6Vetor{
	public static void main(String[] args){
		
	Scanner entra = new Scanner(System.in);	
	int i, j, aux, qtde=5;
	int vetA[] = new int[qtde];
	int vetB[] = new int[qtde];
		
	System.out.println("Digite os valores do vetor A");
	for(i=0;i<qtde;i++){
		vetA[i] = entra.nextInt();
	}	
	System.out.println("\nDigite os valores do vetor B");
	for(i=0;i<qtde;i++){
		vetB[i] = entra.nextInt();
	}	
	System.out.println("Vetor A antes da troca");
	for(i=0;i<qtde;i++){
		System.out.print(vetA[i] + " | " );
	}	
	System.out.println("\nVetor B antes da troca");
	for(i=0;i<qtde;i++){
		System.out.print(vetB[i] + " | " );
	}	
	j=qtde-1;	
	for(i=0;i<qtde;i++){
		aux=vetB[j];
		vetB[j]=vetA[i];
		vetA[i]=aux;
	j=j-1;	
	}
	System.out.println("\n\nVetor A depois da troca");
	for(i=0;i<qtde;i++){
		System.out.print(vetA[i] + " | " );
	}			
	System.out.println("\nVetor B depois da troca");
	for(i=0;i<qtde;i++){
		System.out.print(vetB[i] + " | " );
	}		
	
	}
}