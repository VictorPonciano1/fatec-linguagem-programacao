/*
4.	Escreva um programa que dados um inteiro n e um caractere ch, solicite que o usuário informe n palavras 
que começam com a letra ch. Se o usuário informar alguma palavra que não comece com a letra ch, o programa 
deve exibir uma mensagem informando que a palavra não começa com a letra ch. No final o programa deve exibir 
as n palavras digitadas pelo usuário que começam com a letra ch.
*/
import java.util.Scanner;
import java.io.IOException;
public class Npalavras{
  public static void main(String[] args) throws Exception{
	
	Scanner entra = new Scanner(System.in); 
	System.out.print("Digite um valor inteiro: ");
    int n = entra.nextInt();
	
    System.out.printf("Informe uma letra: ");
    char c = (char)System.in.read();
	char c1;
	c1 = Character.toLowerCase(c);
	char caractereInicial;
	
	String[] palavrasComALetra = new String[n]; 
	
	System.out.print("Digite "+n+" palavras\n");  
	int i, iguais=0,diferentes=0;
	for (i=0;i<n;i++){
		System.out.print("\nDigite a "+(i+1)+"a. palavra com a letra "+c1+": ");
        String palavra = entra.next();
		palavra = palavra.toLowerCase();
		entra.nextLine();
		caractereInicial = palavra.charAt(0);
		if (c1==caractereInicial){
		    //Palavra comeca com a letra digitada
			palavrasComALetra[iguais]=palavra;
			iguais++;
		}
		else{
			System.out.print("A palavra digitada nao comeca com a letra '"+c1+"'");
			diferentes++;
			i--;
		}
	}
	System.out.print("\nForam digitadas "+iguais+" palavra(s) que comecam com a letra '"+c+"'!!");	
	System.out.print("\nVetor com as palavras que comecam com a letra "+c1+": |");
	for (i=0;i<iguais;i++){
		System.out.print(" "+palavrasComALetra[i]+" |");
	}
  }    
  }
	