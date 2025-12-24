class ThrowsDemo {
   static void verificaThrow() throws IllegalAccessException {
      System.out.println("Entrou no metodo verificaThrow");
      throw new IllegalAccessException("demo");
   }
   public static void main(String args[]) {
      try {
         verificaThrow();
      } catch (IllegalAccessException e) {
         System.out.println("Pegou um catch " + e);
      }
   }
}

