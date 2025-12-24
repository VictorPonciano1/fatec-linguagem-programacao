/* EXC2 - CRIANDO UMA EXCECAO PROPRIA */
package excecao_propria;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Digite um valor inteiro: ");
            int valorTeste = scanner.nextInt();
            verificarValor(valorTeste);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            System.out.println("Execução finalizada.");
            scanner.close(); 
        }
    }

	public static void verificarValor(int valor) throws Exception {
        if (valor < 0) {
            throw new Exception("O valor não pode ser negativo!");
        } else {
            System.out.println("Valor " + valor + " é válido.");
        }
    }
}
