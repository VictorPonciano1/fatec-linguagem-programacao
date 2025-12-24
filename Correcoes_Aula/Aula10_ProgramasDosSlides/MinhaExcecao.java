public class MinhaExcecao extends Exception {
   private int detalhe;
   MinhaExcecao(int a) {
      detalhe = a;
   }
   public String toString() {
      return "MinhaExcecao[" + detalhe + "]";
   }
}

