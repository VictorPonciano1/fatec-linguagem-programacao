public class MultiCatch1 {
   public static void main( String[] args ) {
	  try {
		System.out.println(10 / 0);
	  } catch (ArithmeticException e) {
		System.out.println("Erro: " + e.getMessage());
	  } catch (IllegalArgumentException e) {
		System.out.println("Erro: " + e.getMessage());
	  } catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Erro: " + e.getMessage());
	  }
   }
}
/*
Observacoes:
ArithmeticException: esse tipo de exceção ocorre quando alguma operação aritmética 
é inválida e a mesma gera uma exceção, operações essas que não podem ser resolvidas, 
como é o caso da divisão por zero.

IllegalArgumentException: esse tipo exceção geralmente é utilizada para validar valores 
de parâmetros que não estão nas condições adequadas ao programa.

ArrayIndexOutOfBoundsException: esse tipo de exceção acontece quando fornecemos um índice fora 
dos limites permitidos para o acesso de elementos em um vetor ou matriz (array).
*/
