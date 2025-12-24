import java.util.Scanner;
public class ExGerais2{
	public static void main(String[] args){
		Scanner entrada = new Scanner(System.in);
		
		double A, n;
		
		System.out.print("Informe o valor de A (A>0):");
		A = entrada.nextDouble();
		while(A<=0){
			System.out.print("Informe um valor valido para A (A>0):");
			A = entrada.nextDouble();
		}
		System.out.print("Informe o valor de n (n>0):");
		n = entrada.nextDouble();
		while(n<=0){
			System.out.print("Informe um valor valido para n (n>0):");
			n = entrada.nextDouble();
		}	
		System.out.print("Valor total da sequencia: "+sequencia(A,n));
	}
	public static double sequencia(double valorA, double valorN){
		double soma=0, i;
		
		i=1;
		while(i<=valorN){
			soma = soma +(1/i*valorA);
			System.out.println("Valor parcial da soma: "+soma);
			i=i+1;
		}
	return (soma);	
	}	
}

