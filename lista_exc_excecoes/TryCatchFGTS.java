/* EX1 - Crie um programa que solicite o nome e o salario de um funcionario e calcule o valor que a empresa deve depositar em sua conta FGTS (Fundo de Garantia por Tempo de 
Servico). Esse programa deve realizar toda interacao com o usuario como mostra o exemplo a seguir: 
*/
import java.util.Scanner;
import java.util.InputMismatchException;

public class TryCatchFGTS {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String nome;
		double salario;

		while (true) {
            try {
                System.out.print("Digite o nome do funcionário: ");
                nome = scanner.nextLine();
                validarNome(nome);
                break; // Sai do loop se o nome for válido
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        // Solicita e valida o salário do funcionário com tratamento de exceções
        while (true) {
            try {
                System.out.print("Digite o salário do funcionário (R$): ");
                salario = scanner.nextDouble();
                validarSalario(salario);
                break; // Sai do loop se o salário for válido
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. O salário deve ser um número fracionário.");
                scanner.next(); // Limpa a entrada inválida do buffer
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        double fgts = salario * 0.08;

        System.out.println("\n--- Recibo de Pagamento ---");
        System.out.println("Nome do Funcionário: " + nome);
        System.out.printf("Salário: R$ %.2f%n", salario);
        System.out.printf("Valor do FGTS a ser depositado: R$ %.2f%n", fgts);

        scanner.close(); 
    }

    public static void validarNome(String nome) {
        if (nome.length() < 5 || nome.length() > 50) {
            throw new IllegalArgumentException("O nome deve ter entre 5 e 50 caracteres.");
        }
        if (nome.matches(".*\\d.*")) {
            throw new IllegalArgumentException("O nome não pode conter números.");
        }
    }

    public static void validarSalario(double salario) {
        if (salario < 1412.00) {
            throw new IllegalArgumentException("O salário deve ser igual ou superior a R$1412,00.");
        }
    }
}