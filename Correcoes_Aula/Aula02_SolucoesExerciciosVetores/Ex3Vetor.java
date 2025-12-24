/*
Crie um programa, usando o conceito de vetores, para ler e armazenar um conjunto de 50 números inteiros. 
Encontrar e exibir o maior número.
*/

import java.util.Scanner;

public class Ex3Vetor {
  public static void main(String[] args) {
    
    int[] vet;
	int total=5,maior;
	vet = new int[total];
	int i;
	Scanner entra = new Scanner(System.in);
    
	
	for(i=0;i<total;i++){
		System.out.print("Digite o "+(i+1)+"o. valor do vetor: ");
		vet[i] = entra.nextInt();			
	}
	maior=vet[0];
	for(i=1;i<total;i++){
		if(vet[i]>maior)
			maior=vet[i];	
	}
	System.out.println("\nVetor ");
	for(i=0;i<total;i++){
		System.out.print(vet[i] + "|");		
	}
	System.out.println("\nMaior valor contido no vetor: "+maior);
	
}
}
