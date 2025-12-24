/* EXC2 - EXPLORANDO AS HIERARQUIAS DO JAVA: PROGRAMA 1 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Hierarquia1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um valor inteiro: ");
            int numero = scanner.nextInt(); 

            int resultado = 100 / numero; 
            System.out.println("Resultado da divisão de 100 por " + numero + " é: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira um número inteiro.");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            System.out.println("Execução finalizada.");
            scanner.close(); 
        }
    }
}