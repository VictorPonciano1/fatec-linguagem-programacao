/*
Faça um programa para ler e armazenar 100 números inteiros em um vetor. 
Calcular a soma dos elementos (números) que estão nos índices ímpares do vetor.

*/

import java.util.Scanner;

public class Ex4Vetor {
  public static void main(String[] args) {
    
    int[] vet;
	int total=5,soma=0;
	vet = new int[total];
	int i;
	Scanner entra = new Scanner(System.in);
    
	
	for(i=0;i<total;i++){
		System.out.print("Digite o "+(i+1)+"o. valor do vetor: ");
		vet[i] = entra.nextInt();			
		if(i%2==1)
			soma=soma+vet[i];	
	}
	System.out.println("\nVetor ");
	for(i=0;i<total;i++){
		System.out.print(vet[i] + "|");		
	}
	System.out.println("\nSoma dos valores das posicoes impares: "+soma);
	
}
}
