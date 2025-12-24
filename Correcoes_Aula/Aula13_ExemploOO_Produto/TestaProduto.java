import java.util.Scanner;
public class TestaProduto{
	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);
			
		Produto p1 = new Produto(); //p1 é uma instância (ocorrência da classe Produto)
		
		System.out.print("Digite o codigo do produto: ");
		int num = entrada.nextInt();
		p1.codProd = num;

		//limpa a entrada, pois anteriormente foi feita a leitura de um valor numerico
		entrada.nextLine();
		
		System.out.print("Digite a descricao do produto: ");
		String desc = entrada.nextLine();
		p1.descricaoProd = desc;
		
		System.out.print("Digite o preco do produto: ");
		double valor = entrada.nextDouble();
		p1.precoProd = valor;
		
		p1.imprimirProduto();
		
		Produto p2 = new Produto(); //p2 é outra instância (ocorrência da classe Produto)
		p2.codProd = 222;
		p2.descricaoProd = "Cafe";
		p2.precoProd = 10;
		
		p2.imprimirProduto();
		
		entrada.close();
	}
}