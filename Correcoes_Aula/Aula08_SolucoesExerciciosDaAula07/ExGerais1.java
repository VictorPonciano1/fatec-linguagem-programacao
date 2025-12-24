import java.util.Scanner;
public class ExGerais1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int valorA, valorB;
		
		System.out.print("Digite um valor inteiro de 4 digitos:");
		valorA = sc.nextInt();
		while(valorA<1000 || valorA>9999){
			System.out.println("Vc digitou um valor invalido!!");
			System.out.print("Digite um valor de 4 digitos: ");
			valorA = sc.nextInt();
		}	
		System.out.print("Digite um valor inteiro de 2 digitos:");
		valorB = sc.nextInt();
		while(valorB<10 || valorB>99){
			System.out.println("Vc digitou um valor invalido!!");
			System.out.print("Digite um valor de 2 digitos: ");
			valorB = sc.nextInt();
		}	
		encaixarValores(valorA,valorB); //chamada do método --> não se usa tipo de dados 
		System.out.print("Saiu do metodo encaixarValores. Estamos finalizando o programa");
	}
	
	public static void encaixarValores(int A, int B){
	    if(A%100==B){
			System.out.println("Encaixa");
		}
		else{
			System.out.println("Nao Encaixa");
		}
	return;
	}
	
}