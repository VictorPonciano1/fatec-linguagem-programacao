/*
Escreva um programa para armazenar 50 números inteiros em um vetor. 
Ao final mostrar apenas os números positivos contidos no vetor.
*/

import java.util.Scanner;

public class Ex5Vetor {
  public static void main(String[] args) {
    
    int[] vet;
	int total=5;
	vet = new int[total];
	int i;
	Scanner entra = new Scanner(System.in);
    
	
	for(i=0;i<total;i++){
		System.out.print("Digite o "+(i+1)+"o. valor do vetor: ");
		vet[i] = entra.nextInt();			
	}
	System.out.println("\nVetor ");
	for(i=0;i<total;i++){
		System.out.print(vet[i] + "|");		
	}
	System.out.println("\nVetor positivos contidos no vetor");
	for(i=0;i<total;i++){
		if(vet[i]>0)
		  System.out.print(vet[i] + "|");		
	}
	
	
}
}
