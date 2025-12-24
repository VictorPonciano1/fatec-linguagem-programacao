/* EXC1 - Escreva um programa que leia duas strings (dois nomes) e as imprima na tela. Imprima também a segunda letra de 
cada string. */
import java.util.Scanner;

public class Exc1String {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro nome: ");
        String nome1 = scanner.nextLine();
        System.out.println("Digite o segundo nome: ");
        String nome2 = scanner.nextLine();

        //O INDEX COMECA EM 0, ENTAO A SEGUNDA POSICAO E A DE NUMERO 1;
        System.out.println("O primeiro: " + nome1 + " + sua segunda letra: " + nome1.charAt(1) );
        System.out.println("O primeiro: " + nome2 + " + sua segunda letra: " + nome2.charAt(1) );

        scanner.close();
    }
}
