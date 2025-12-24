import java.util.Scanner;

public class Exerc1Tridimen{
	public static void main (String [] args){
		
		int i, j, k;
		int tri[][][] = new int [3][3][3];
	
		Scanner entrada = new Scanner(System.in); 
		
		System.out.println("Digite os valores do cubo:");
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				for(k=0;k<3;k++){
					tri[i][j][k]=entrada.nextInt();
				}
			}
		}
		
		System.out.println("Valores do cubo:");
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				for(k=0;k<3;k++){
					System.out.print("["+i+"]["+j+"]["+k+"]="+tri[i][j][k]+" | ");
				}
			System.out.println("");
			}
		System.out.println("");
		}
					
			
		
		
		
	}
}