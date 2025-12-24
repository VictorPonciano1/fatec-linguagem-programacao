import java.util.Scanner;
public class ExGerais3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N;
		int result1;
		char resultadoLetra;
		
		System.out.print("Escolha uma opcao: ou 1, ou 2, ou 3: ");
		N = sc.nextInt();
		while(N<1 || N>3){
			System.out.println("Valor invalido. Digite novamente!");
			System.out.print("Escolha uma opcao: ou 1, ou 2, ou 3: ");
			N = sc.nextInt();
		}	
		if(N==1){
			result1=metodo1(); //chamada do metodo1
			System.out.println("Valor da soma dos pares divisiveis por 3: "+result1);
		}
		else{
			if(N==2){
			    metodo2();	//chamada do metodo2
			}
			else{
				resultadoLetra=metodo3();
				System.out.println("Matriz triangular superior: "+resultadoLetra);
			}
		}
		
	}
	public static int metodo1(){
		Scanner entrada = new Scanner(System.in);
		int i, soma=0;
		int qtde = 5;
		int [] vetA = new int[qtde];
		System.out.println("Digite os valores do vetor: ");
		for(i=0;i<qtde;i=i+1){
			vetA[i]=entrada.nextInt();
			if(vetA[i]%2==0 && vetA[i]%3==0){
				soma=soma+vetA[i]; //soma é um acumulador
			}
		}
	return(soma);	
	}
	public static void metodo2(){
		Scanner entrada = new Scanner(System.in);
		int i, j, soma;
		int qtde = 5;
		int [] A = new int[qtde];	
		int [] B = new int[qtde];		
		System.out.println("Digite os valores do vetor A: ");
		for(i=0;i<qtde;i=i+1){
			A[i]=entrada.nextInt();
		}
		for(i=0;i<qtde;i=i+1){
			soma=0;
			for(j=0;j<=A[i];j=j+1){
				soma=soma+j;
			}
			B[i]=soma;
		}
		System.out.println("Vetor A: ");
		for(i=0;i<qtde;i=i+1){
			System.out.print(A[i]+" | ");
		}	
		System.out.println("\nVetor B: ");
		for(i=0;i<qtde;i=i+1){
			System.out.print(B[i]+" | ");
		}
		return;
		
	}
	public static char metodo3(){
		//necessário ler uma matriz de ordem 4
		Scanner entrada = new Scanner(System.in);
		int i, j, soma=0;
		int [][] matriz = new int[4][4];
		char letra;
		System.out.println("Digite os valores da matriz de ordem 4: ");
		for(i=0;i<4;i=i+1){
			for(j=0;j<4;j=j+1){
				matriz[i][j]=entrada.nextInt();	
			}	
		}
		for(i=0;i<4;i=i+1){
			for(j=0;j<4;j=j+1){
				System.out.print(matriz[i][j]+"   ");	
			}	
			System.out.println("");
		}
		for(i=0;i<4;i=i+1){
			for(j=0;j<4;j=j+1){
				if(i>j){
					soma=soma+matriz[i][j];
				}
			}	
		}
		if(soma==0){
			letra='V';
		}
		else{
			letra='F';
		}
	return(letra);	
	}
}