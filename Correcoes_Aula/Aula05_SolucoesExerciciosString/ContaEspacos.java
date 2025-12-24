/*
1.Escreva um programa em Java que receba uma frase do teclado e 
informe quantos espaços essa frase possui. 
*/
import java.util.Scanner;
public class ContaEspacos{
  public static void main(String[] args){
	  
	Scanner entra = new Scanner(System.in); 
	System.out.print("Digite uma frase: ");
    String frase = entra.nextLine();
    int espacos=0;
     
    for(int i = 0; i < frase.length(); i++){
        if(frase.charAt(i)==' ')
           espacos++;
    }         
    if(espacos!=0)
       System.out.println("A string possui "+espacos+" espacos");
    else
       System.out.println("A string NAO possui espacos");
   
    entra.close();
  }
} 
/*
import java.util.Scanner;
public class ContaEspacos{
  public static void main(String[] args){
	  
	Scanner entra = new Scanner(System.in); 
	System.out.print("Digite uma frase: ");
    String frase = entra.nextLine();
    int espacos=0;
     
    for(int i = 0; i < frase.length(); i++){
        Character caractere = frase.charAt(i);
        if(Character.isWhitespace(caractere))
           espacos++;
    }         
    if(espacos!=0)
       System.out.println("A string possui "+espacos+" espacos");
    else
       System.out.println("A string NAO possui espacos");
     
  }
}
*/