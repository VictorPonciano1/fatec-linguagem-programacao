/*Crie um programa em Java para ler e armazenar 15 números inteiros em um vetor
 e montar outro vetor com os valores do primeiro multiplicados por 3.
 */

import java.util.Scanner;

public class Ex2Vetor {
  public static void main(String[] args) {
    
    int[] vet1, vet2;
	int total=5;
	vet1 = new int[total];
	vet2 = new int[total];
	int i;
	Scanner entra = new Scanner(System.in);
    
	
	for(i=0;i<total;i++){
		System.out.print("Digite o "+(i+1)+"o. valor do vetor: ");
		vet1[i] = entra.nextInt();	
        vet2[i]=vet1[i]*3;		
	}
	System.out.println("\nVetor 1 ");
	for(i=0;i<total;i++){
		System.out.print(vet1[i] + "|");		
	}
	System.out.println("\nVetor 2 ");
	for(i=0;i<total;i++){
		System.out.print(vet2[i] + "|");		
	}		
}
}


/*
Crie um programa em Java para ler e armazenar 15 números inteiros em um vetor e montar outro vetor 
com os valores do primeiro multiplicados por 3.

*/
