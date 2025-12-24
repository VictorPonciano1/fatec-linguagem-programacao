/* arquivo Produto.java */
public class Produto{

    public int codProd;
    public String descricaoProd;
    public double precoProd;   

    public void imprimirProduto()     {
        System.out.println("Codigo do produto:"+ this.codProd);
        System.out.println("Descricao do produto:"+ this.descricaoProd);
		System.out.println("Preco do produto:"+ this.precoProd);  
	} 
 }
