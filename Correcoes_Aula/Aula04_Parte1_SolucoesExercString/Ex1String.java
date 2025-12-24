/*
Escreva um programa que leia duas strings (dois nomes) e as imprima na tela. 
Imprima também a segunda letra de cada string. 
*/
import java.util.Scanner;
public class Ex1String {

    public static void main(String[] args) {
        
		Scanner entra = new Scanner(System.in); 
		System.out.print("Digite o primeiro nome: ");
        String nome1 = entra.nextLine(); 
		System.out.print("Digite o segundo nome: ");
        String nome2 = entra.nextLine(); 
        
		System.out.println("\nNome 1:"+ nome1);   
		System.out.println("\nNome 2:"+ nome2);   
		System.out.println("Segunda letra do nome 1: " + nome1.charAt(1));
		System.out.println("Segunda letra do nome 2: " + nome2.charAt(1));
}
}