/*
Escreva um programa que leia uma string e substitua todos os caracteres ‘a’ da string lida por ‘*’. 
Informe na tela quantos caracteres foram retirados. 

*/
/*Solução 1*/
import java.util.Scanner;
public class Ex3String {

    public static void main(String[] args) {
        
		String novo;
		Scanner entra = new Scanner(System.in); 
		System.out.print("Digite uma frase: ");
        String frase = entra.nextLine(); 
		frase.toLowerCase();
        
		int i=0,conta=0;
        while(i<frase.length()){
            if(frase.charAt(i)=='a'){
				conta=conta+1;
			}
		i=i+1;
		}            
		novo=frase.replace("a","*");
		System.out.println("\nFrase alterada: "+ novo);   
		System.out.println("Quantidade de vogais substituidas: " + conta);
}
}

/*Solução 2: Convertendo a string para um StringBuffer
import java.util.Scanner;
public class Ex3 {

    public static void main(String[] args) {
        
		String novo;
		Scanner entra = new Scanner(System.in); 
		System.out.print("Digite uma frase: ");
        String frase = entra.nextLine(); 
		frase.toLowerCase();
  
        StringBuffer frase1 = new StringBuffer(frase);
        
		int i=0,conta=0;
   	    while(i<frase1.length()){
            if(frase1.charAt(i)=='a'){
				//System.out.println("\nEncontrou uma letra a");
				frase1.setCharAt(i, '*'); 
				conta=conta+1;
			}
		i=i+1;
		}            
		System.out.println("\nFrase digitada: "+ frase1);   
		System.out.println("Quantidade de vogais substituidas: " + conta);
}
}
*/