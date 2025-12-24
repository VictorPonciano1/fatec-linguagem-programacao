/* EXC 2 - Crie um programa que lia dois numeros e envia esses numeros para um metodos chamado calcularSoma. O metodo 
calcularSoma, apos receber esses valores, devera realizar uma soma e imprimir o resultado obtido dentro do metodo. */
import java.util.Scanner;

public class Sominha {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num1;
		int num2;	
		
		System.out.println("Numero 1: ");
		num1 = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Numero 2: ");
		num2 = scanner.nextInt();
		
		calcularSoma(num1, num2);

		scanner.close();
	}

	public static void calcularSoma(int num1, int num2) { 
		
		int soma = num1 + num2;	
		System.out.println("Soma: " + soma);
	}
}