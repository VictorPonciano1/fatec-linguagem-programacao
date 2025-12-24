/* EXC2 - EXPLORANDO AS HIERARQUIAS DO JAVA: PROGRAMA 2 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Hierarquia2 {
	public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];
        int i;
        
        try {
            for(i = 0; i <= 10; i++) {
                vetor[i] = scanner.nextInt();
            }
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("Erro" + exception);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira um número inteiro.");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e);
        } finally {
            System.out.println("Execução finalizada.");
            scanner.close(); // Fecha o Scanner para liberar recursos
        }

        scanner.close();
    }
}