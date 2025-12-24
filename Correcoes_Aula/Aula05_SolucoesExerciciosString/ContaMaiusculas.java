/*
2.Escreva um programa em Java que receba uma frase do teclado e 
informe quantas letras maiúsculas essa frase possui. 
*/
import java.util.Scanner;
public class ContaMaiusculas{
  public static void main(String[] args){
	  
	Scanner entra = new Scanner(System.in); 
	System.out.print("Digite uma frase: ");
    String frase = entra.nextLine();
    int maiusculas = 0;
    char frase1[] = frase.toCharArray();
	
    for(int i = 0; i < frase1.length; i++){
        if(frase1[i]>='A'&&frase1[i]<='Z'){
            maiusculas++;
        }
    }            
    if(maiusculas!=0)
       System.out.println("A string possui "+maiusculas+" letras maiusculas");
    else
       System.out.println("A string NAO possui letras maiusculas");   
  }
} 
/*
import java.util.Scanner;
public class ContaMaiusculas{
  public static void main(String[] args){
	  
	Scanner entra = new Scanner(System.in); 
	System.out.print("Digite uma frase: ");
    String frase = entra.nextLine();
    int maiusculas = 0;
     
    for(int i = 0; i < frase.length(); i++){
        Character caractere = frase.charAt(i);
        if(Character.isUpperCase(caractere)){
            maiusculas++;
        }
    }            
    if(maiusculas!=0)
       System.out.println("A string possui "+maiusculas+" letras maiusculas");
    else
       System.out.println("A string NAO possui letras maiusculas");   
  }
} 
*/