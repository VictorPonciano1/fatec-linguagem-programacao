/*
Crie um programa para ler o primeiro nome de uma pessoa e contar quantas vogais esse nome possui.
*/
import java.util.Scanner;
public class Ex2String {

    public static void main(String[] args) {
        
		Scanner entra = new Scanner(System.in); 
		System.out.print("Digite o seu nome em letras minusculas: ");
        String nome = entra.nextLine(); 
		String maiusculas = nome.toUpperCase();
		String minusculas = nome.toLowerCase();

        int i=0,conta=0;
        while(i<minusculas.length()){
            if(minusculas.charAt(i)=='a' || minusculas.charAt(i)=='e' || minusculas.charAt(i)=='i' || minusculas.charAt(i)=='o' || minusculas.charAt(i)=='u'  ){
			   conta=conta+1;
			}
		i=i+1;
		}            
		System.out.println("\nO nome "+ nome+" possui "+ conta+" vogais");   
		System.out.println("Em letras maiusculas: " + maiusculas);
		System.out.println("Em letras minusculas: " + minusculas);
}
}