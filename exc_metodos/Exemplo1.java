/* Crie um programa para inserir 10 valores inteiros em um vetor chamado vet; Em seguida, um método static chamado 
somarPares, deve receber o vetor, somar apenas os valores pares e retornar o total da soma; Ao final imprimir o total da 
soma no método main. */
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int i;
        int resultado;
        int[] vet = new int[10];

        for (i = 0; i < 10; i++) {
            vet[i] = scanner.nextInt();
        }

        resultado = somarPares(vet);
        System.out.println("Soma dos pares: " + resultado);

        scanner.close();
    }

    public static int somarPares(int[] vet) {

        int i; 
        int soma = 0;
    
        for (i = 0; i < 10; i++) {
            if (vet[i] % 2 == 0) {
                soma = soma + vet[i];
            }
        }

        return soma;
    }
}
