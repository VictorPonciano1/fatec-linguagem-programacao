/*
3.	Escreva um programa que receba uma linha de texto, conte as vogais e 
apresente o histograma da frequência de cada uma delas. 
Considere que a linha de texto não contém acentuação. Por exemplo:
Linha de texto: "Os ultimos Jogos Olimpicos foram no Brasil"
Histograma:
a: ** (2)
e: (0)
i: **** (4)
o: ******** (8)
u:  * (1)
*/
import java.util.Scanner;
public class Histograma {

    public static void main(String[] args) {
        
		Scanner entra = new Scanner(System.in); 
		System.out.print("Digite uma frase: ");
        String frase = entra.nextLine(); 
		frase=frase.toLowerCase();

        int cont=0,conta=0,a=0,e=0,i=0,o=0,u=0;
        while(cont<frase.length()){
            if(frase.charAt(cont)=='a'){
				a=a+1; 		
			}
			else if(frase.charAt(cont)=='e'){
				e=e+1; 		
			}
			else if(frase.charAt(cont)=='i'){
				i=i+1; 		
			}
			else if(frase.charAt(cont)=='o'){
				o=o+1; 		
			}
			else if(frase.charAt(cont)=='u'){
				u=u+1; 		
			}
		cont=cont+1;
		}  
    	System.out.println("\nHistograna:\n");   
		System.out.print("a: ");
		for (cont=0;cont<a;cont++){
		     System.out.print("*");
		}
		System.out.println("("+a+")");
		System.out.print("e: ");
		for (cont=0;cont<e;cont++)
		     System.out.print("*");
		System.out.println("("+e+")");
		System.out.print("i: ");
		for (cont=0;cont<i;cont++)
		     System.out.print("*");
		System.out.println("("+i+")");
		System.out.print("o: ");
		for (cont=0;cont<o;cont++)
		     System.out.print("*");
		System.out.println("("+o+")");
		System.out.print("u: ");
		for (cont=0;cont<u;cont++)
		     System.out.print("*");
		System.out.println("("+u+")");
}
}