/*
Crie um programa em Java para ler e armazenar 20 números inteiros em um vetor, em seguida imprimir esses 
números na ordem inversa da leitura, ou seja, o último número lido deve ser o primeiro a ser exibido.
*/

import java.util.Scanner;

public class Ex1Vetor {
  public static void main(String[] args) {
    
    int[] numeros;
	int total=5;
	numeros = new int[total];
	int i;
	Scanner entra = new Scanner(System.in);
    
	
	for(i=0;i<total;i++){
		System.out.print("Digite o "+(i+1)+"o. valor do vetor: ");
		numeros[i] = entra.nextInt();		
	}
	System.out.println("\n\nConteudo do vetor: ");
	for(i=total-1;i>=0;i--){
		System.out.print(numeros[i] + "|");		
	}	
}
}
