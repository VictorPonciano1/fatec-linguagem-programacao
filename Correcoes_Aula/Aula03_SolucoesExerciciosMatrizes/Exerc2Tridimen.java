import java.util.Scanner;

public class Exerc2Tridimen{
	public static void main (String [] args){
		
		int i, j, k;
		int tri[][][] = new int [3][3][3];
	
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				for(k=0;k<3;k++){
					tri[i][j][k]=i+j+k;
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