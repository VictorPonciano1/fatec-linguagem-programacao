import java.util.Scanner;
public class Ex1Matriz {
    public static void main(String[] args) {
   
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite seu nome: ");
    String nome = sc.nextLine();
    System.out.print("Digite o Segundo Nome");
    String nome2 = sc.nextLine();
    System.out.println(nome + " " + nome2);

    sc.close();
 }
}