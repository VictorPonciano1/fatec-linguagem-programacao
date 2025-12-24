/* Crie um  programa para ler um numero inteiro de 3 digitos. Verificar e imprimir se: numero = palindromo; Apos, imprimir numero invertido */

import java.util.Scanner;

public class ProgPalindromo {
	public static void main (String args[]) {
	
		Scanner scanner = new Scanner(System.in);
	
		int num;
		int c;
		int d;
		int u;
		int resto1;
		int numInv;
		
		System.out.println("Digite seu numero:");
		num = scanner.nextInt();
		
		if (num > 99 && num < 1000) {
			c = num / 100;
			resto1 = num % 100;
			d = resto1 / 10;
			u = resto1 % 10;
			numInv = (u*100) + (d*10) + (c);
			if (c == u) {
				System.out.println("Palindromo");
				System.out.println("Ele invertido: " + numInv);
			} else {
				System.out.println("Numero = nao palindromo");
			}
		} else {
			System.out.println("Digite um numero valido (3 digitos)");
		}
	
		scanner.close();
	}
}