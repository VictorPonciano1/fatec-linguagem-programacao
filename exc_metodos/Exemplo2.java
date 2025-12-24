/*O programa possui um método chamado preencherVetor que é responsável por adicionar valores inteiros em um vetor de 
tamanho definido pelo usuário. Além do vetor o método recebe um valor inteiro que é o tamanho do vetor */
import java.util.Scanner;
import java.util.Random;

public class Exemplo2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);


        System.out.println("Declare o tamanho do vetor:");
        int tamanho = scanner.nextInt();

        int[] vet = new int[tamanho];

        preencherVetor(vet,tamanho);
        imprimirVetor(vet);

       scanner.close();
    }

    public static void preencherVetor(int[] vet, int tamanho) {

        Random random = new Random();
        int i;

        for(i = 0; i < tamanho; i++) {
            vet[i] = random.nextInt(vet.length);
        }

        return;
    }

    public static void imprimirVetor(int[] vet) {

        int i;
        for(i = 0; i < vet.length; i++) {
            System.out.println("Valores: " + (i+1) + " : " + vet[i]);
        }
    
        return;
    }
}
