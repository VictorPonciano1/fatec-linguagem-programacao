/* EXEMPLO DE STRING CONCATENADA
Notas: o "String.format" assim como sua derivada "System.out.printf" reconhece o tipo de variavel que ele esta puxando de 
acordo com a letra que segue o simbolo de %: %s: strings; %d: integer (int); %f: floats (possivel controlar o numero de 
casas decimais exibidas; exemplo: numero 5.4892 - %5.2f - onde o .2f indica o numero de decimais) %t ou %T: usado para 
datas ou definir o tempo */
import java.util.Scanner;

public class ConcatenaString {
	public static void main (String[] args) {
		
		//EXEMPLO COM SCANNER;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o nome: ");
		String nome = scanner.nextLine();
		System.out.println("Digite o sobrenome: ");
		String sobrenome = scanner.nextLine();
		
		System.out.println("\n\nExemplo com Scanner:");
		System.out.println("Nome completo: " + nome + " " + sobrenome); //NORMAL;
		System.out.println("Nome completo: ".concat(nome) .concat(" ") .concat(sobrenome)); //CONCAT;
		System.out.println(String.format("%s %s %s", "Nome Completo:", nome, sobrenome)); //FORMAT;
		
		//EXEMPLO COM STRING DECLARADA;
		String nome2 = "Felipe";
		String sobrenome2 = "Ponciano";
		
		System.out.println("\n\nExemplo com String declarada:");
		System.out.println("Nome completo: " + nome2 + " " + sobrenome2); //NORMAL;
		System.out.println("Nome completo: ".concat(nome2) .concat(" ") .concat(sobrenome2)); //CONCAT;
		System.out.println(String.format("%s %s %s", "Nome Completo:", nome2, sobrenome2)); //FORMAT;
		
		//FECHANDO SCANNER;
		scanner.close();
	}
}