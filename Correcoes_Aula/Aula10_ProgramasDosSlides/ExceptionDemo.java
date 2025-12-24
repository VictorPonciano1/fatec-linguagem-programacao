class ExceptionDemo {
   public static void main(String args[]) {  
	  try {
         computar(1);
         computar(20);
      } catch (MinhaExcecao e) {
		 //catch especifica o tipo de erro que você quer capturar
         System.out.println("Pegou um tipo de erro:  " + e);
      }
   }
   public static void computar(int a) throws MinhaExcecao {
      System.out.println("Metodo computar(" + a + ") foi chamado");
      if (a > 10) {
         throw new MinhaExcecao(a);
      }
      System.out.println("Saida normal");
   }
}


