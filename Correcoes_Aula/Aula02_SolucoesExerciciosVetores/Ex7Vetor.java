/*
Crie um programa em linguagem Java  para inserir dados em um vetor A de 30 posições de inteiros. 
Os números inteiros que serão armazenados no vetor só podem ser divisíveis por 5 (números que divididos por 5 terão resto igual a zero). 
Ao final mostrar o vetor A, e mostrar se o usuário digitou números não divisíveis por 5 e a respectiva quantidade.
*/

import java.util.Scanner;

public class Ex7Vetor {
  public static void main(String[] args) {
    
    int[] A;
	int total=5;
	A = new int[total];
	int i,num,naodiv5=0;
	Scanner entra = new Scanner(System.in);
    
	i=0;
	while(i<total){
		System.out.println("Digite o "+(i+1)+"o. valor divisivel por 5 do vetor A: ");
		num = entra.nextInt();	
		if(num%5==0){
			A[i]=num;
			i++;
		}
		else{
			naodiv5=naodiv5+1;
		}
	}
	System.out.println("\nVetor A");
	for(i=0;i<total;i++){
		System.out.print(A[i] + "|");		
	}
	System.out.println("\nQuantidade de valores nao divisiveis por 5: "+naodiv5);
	
}
}
