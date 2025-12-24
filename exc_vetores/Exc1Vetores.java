/* EXC 1 - Criar um vetor de 20 numeros e imprimir eles na ordem "inversa": do ultimo numero digitado ate o primeiro;
Nota: Devo comecar a ter preferencia em nomear minhas variaveis e metodos em ingles para um entendimento maior da linguagem e para me acostumar a trabalhar com pessoas de fora do pais;
 */
 
import java.util.Scanner;

public class Exc1Vetores {
	public static void main (String[] args) {

		Scanner scanner = new Scanner(System.in);
	
		/* Tambem eh possivel declara o "i" aqui com o resto das variaveis; */
		int size = 20;
		int[] array = new int[size];

		for (int i = 0; i < size; i++) /* O i++ pode ser trocado por "i = i + 1"; */ {
			array[i] = scanner.nextInt();
		}
	
		for(int i = size - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
	
		scanner.close();
	}
}