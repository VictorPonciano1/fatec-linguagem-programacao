/* EXC 3 - Crie um programa que possua um metdo chamado calcularMedia e que recebe as 2 notas de um aluno e uma letra por 
parâmetro. Se a letra recebida for a letra ‘A’ o metodo deve calcular a media aritmetica das notas do aluno, porém se a 
letra recebida for a ‘P’, o metodo deve calcular a media ponderada com pesos 7 e 3 para a primeira nota e a segunda nota, 
respectivamente. A media calculada deve retornar ao main, sendo o valor da media exibido no metodo main. */
import java.util.Scanner;

public class AritmeticaPonderada {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        float p1, p2;
        char parametro; //Criar apenas um parametro pois o "if" do calculo vai fazer o resto;
        
        System.out.println("Nota 1: ");
        p1 = scanner.nextInt();
        System.out.println("Nota 2: ");
        p2 = scanner.nextInt();

        System.out.println("Digite seu parametro: A ou P ");
        parametro = scanner.nextLine().charAt(0);

        float media = calcularMedia(p1, p2, parametro);
        System.out.println("Media escolhida: " + media);

        scanner.close();
    }

    public static float calcularMedia(float p1, float p2, char parametro) {
       
        float media = 0;
       
        if (parametro == 'A' || parametro == 'a') {
            media = (p1 + p2) / 2;
        } else {
            media = ((p1* 7) + (p2 * 3)) / 2;
        }

        return media;
    }
}